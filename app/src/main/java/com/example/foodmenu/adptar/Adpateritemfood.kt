package com.example.foodmenu.adptar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodmenu.R
import com.example.foodmenu.data.ImageFood
import com.example.foodmenu.databinding.ItemCardFoodBinding

class Adpateritemfood(val foodList:List<ImageFood>) :RecyclerView.Adapter<Adpateritemfood.HolderFood>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderFood {
       val view= LayoutInflater.from(parent.context).inflate(R.layout.item_card_food,parent,false)
      return  HolderFood(view)
    }

    override fun onBindViewHolder(holder: HolderFood, position: Int) {
        val listFood= foodList[position]
        holder.binding.apply {
         tvDish.text=listFood.name
            Glide.with(this.root).load(listFood.image).into(ivDish)
        }
    }

    override fun getItemCount(): Int = foodList.size

    class HolderFood(itemView: View):RecyclerView.ViewHolder(itemView){
        val binding= ItemCardFoodBinding.bind(itemView)
    }
}