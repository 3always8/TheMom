package com.ssong.themom

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ToyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val toyNameView = view.name
    val toyBrandView= view.brand
    val toyCostView = view.cost
    val toyImageView = view.image
    val toyThemomView = view.themom_point
    val toyUserView = view.user_point
    }