package com.ssong.themom

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ToyAdapter(val items : MutableList<Toy>, val context: Context)
    : RecyclerView.Adapter<ToyViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ToyViewHolder {
        var view = LayoutInflater.from(parent!!.context).inflate(R.layout.item,parent,false)
        return ToyViewHolder(view)

    }
    override fun onBindViewHolder(p0: ToyViewHolder, p1: Int) {
        p0.toyNameView.text = items.get(p1).name
        p0.toyBrandView.text = items.get(p1).brand
        p0.toyCostView.text = items.get(p1).cost.toString()
        p0.toyImageView.setImageResource(items.get(p1).imageSource)
        p0.toyThemomView.text = items.get(p1).themomPoints[0].toString()
        p0.toyUserView.text = items.get(p1).userPoints[0].toString()


    }
}
