package com.example.testapp.others

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import kotlinx.android.synthetic.main.item_view_pager.view.*

class ViewPager2Adapter(val items:List<Int>) : RecyclerView.Adapter<ViewPager2Adapter.ViewPager2ViewHolder>() {
    inner class ViewPager2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPager2ViewHolder {
        return ViewPager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewPager2ViewHolder, position: Int) {
        val photo = items[position]
        holder.itemView.iv.setImageResource(photo)
    }
}