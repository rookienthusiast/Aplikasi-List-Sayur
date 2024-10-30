package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListVegetableAdapter(private val listVegetable: ArrayList<Vegetable>) : RecyclerView.Adapter<ListVegetableAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_vegetable, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listVegetable.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val context = holder.itemView.context
        val vegetable = listVegetable[position]

        Glide.with(holder.itemView.context)
            .load(vegetable.photo)
            .into(holder.pic)

        holder.name.text = vegetable.name
        holder.nutrition.text = vegetable.nutrition
        holder.benefits.text = vegetable.benefits

        holder.itemView.setOnClickListener {
            val passItem = Intent(context, DetailActivity::class.java)
            passItem.putExtra(DetailActivity.EXTRA_NAME, vegetable.name)
            passItem.putExtra(DetailActivity.EXTRA_NUTRITION, vegetable.nutrition)
            passItem.putExtra(DetailActivity.EXTRA_BENEFITS, vegetable.benefits)
            passItem.putExtra(DetailActivity.EXTRA_DESC, vegetable.description)
            passItem.putExtra(DetailActivity.EXTRA_PHOTO, vegetable.photo)
            passItem.putExtra(DetailActivity.EXTRA_PICBG, vegetable.background)
            context.startActivity(passItem)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.tv_item_name)
        var nutrition: TextView = itemView.findViewById(R.id.tv_item_nutrition)
        var benefits: TextView = itemView.findViewById(R.id.tv_item_benefits)
        var pic: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Vegetable)
    }
}