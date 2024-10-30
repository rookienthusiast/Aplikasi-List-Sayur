package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvVegetables: RecyclerView
    private val list = ArrayList<Vegetable>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this, R.color.primary_bar)))

        rvVegetables = findViewById(R.id.rv_vegetables)
        rvVegetables.setHasFixedSize(true)

        list.addAll(getListVegetables())
        showRecyclerList()
    }

    private fun getListVegetables(): ArrayList<Vegetable> {
        return vegetableData.listData
    }

    private fun showRecyclerList() {
        rvVegetables.layoutManager = LinearLayoutManager(this)
        val listVegetableAdapter = ListVegetableAdapter(list)

        listVegetableAdapter.setOnItemClickCallback(object : ListVegetableAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Vegetable) {

                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_NAME, data.name)
                intent.putExtra(DetailActivity.EXTRA_NUTRITION, data.nutrition)
                intent.putExtra(DetailActivity.EXTRA_BENEFITS, data.benefits)
                intent.putExtra(DetailActivity.EXTRA_DESC, data.description)
                intent.putExtra(DetailActivity.EXTRA_PHOTO, data.photo)
                intent.putExtra(DetailActivity.EXTRA_PICBG, data.background)
                startActivity(intent)
            }
        })

        rvVegetables.adapter = listVegetableAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_about) {
            startActivity(Intent(this@MainActivity, AboutActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

}
