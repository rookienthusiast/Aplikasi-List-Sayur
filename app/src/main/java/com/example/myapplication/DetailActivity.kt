package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_NUTRITION = "extra_nutrition"
        const val EXTRA_BENEFITS = "extra_benefits"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_PICBG = "extra_picbg"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.hide()

        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvNutrition: TextView = findViewById(R.id.tv_item_nutrition)
        val tvBenefits: TextView = findViewById(R.id.tv_item_benefits)
        val tvDescription: TextView = findViewById(R.id.tv_description_detail)
        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        val imgBackground: ImageView = findViewById(R.id.img_background)
        val favButton: ImageView = findViewById(R.id.fav_button)
        var fav = false

        val name = intent.getStringExtra(EXTRA_NAME)
        val nutrition = intent.getStringExtra(EXTRA_NUTRITION)
        val benefits = intent.getStringExtra(EXTRA_BENEFITS)
        val description = intent.getStringExtra(EXTRA_DESC)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
        val picbg = intent.getIntExtra(EXTRA_PICBG, 0)

        tvName.text = name
        tvNutrition.text = nutrition
        tvBenefits.text = benefits
        tvDescription.text = description

        Glide.with(this)
            .load(photo)
            .into(imgPhoto)
        Glide.with(this)
            .load(picbg)
            .into(imgBackground)

        favButton.setOnClickListener {
            if (!fav) {
                Toast.makeText(this, "Add To Favorite", Toast.LENGTH_SHORT).show()
                favButton.setImageResource(R.drawable.star)
                fav = true
            } else {
                Toast.makeText(this, "Remove From Favorite", Toast.LENGTH_SHORT).show()
                favButton.setImageResource(R.drawable.unstar)
                fav = false
            }
        }
    }
}