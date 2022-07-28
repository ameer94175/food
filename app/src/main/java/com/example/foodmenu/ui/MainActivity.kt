package com.example.foodmenu.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodmenu.adptar.AdaptaHorizontalItem
import com.example.foodmenu.adptar.Adpateritemfood
import com.example.foodmenu.data.DataManger
import com.example.foodmenu.data.ImageFood
import com.example.foodmenu.data.TitleCard
import com.example.foodmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adpater=AdaptaHorizontalItem(DataManger.gitdata())
        binding.recyclerView.adapter=adpater
    }

}