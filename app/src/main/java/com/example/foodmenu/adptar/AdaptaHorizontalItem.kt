package com.example.foodmenu.adptar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmenu.R
import com.example.foodmenu.data.TitleCard
import com.example.foodmenu.databinding.RecyclerviewCardBinding

class AdaptaHorizontalItem(val list:List<TitleCard>):RecyclerView.Adapter<AdaptaHorizontalItem.HolderItemHorizontal>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderItemHorizontal {
val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_card,parent,false)
return HolderItemHorizontal(view)
    }
    override fun onBindViewHolder(holder: HolderItemHorizontal, position: Int) {
        val list= list[position]
  holder.binding.apply {
      tvFoodTitle.text=list.title
      rvFood.apply {
          layoutManager=LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
          adapter=Adpateritemfood(list.cardFood)
          rvFood.adapter=adapter
      }
  }
    }

    override fun getItemCount(): Int = list.size

    class HolderItemHorizontal(itemView: View):RecyclerView.ViewHolder(itemView){
        val binding= RecyclerviewCardBinding.bind(itemView)
    }
}