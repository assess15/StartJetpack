package com.assess15.arch_paging3.paging3_room.ui.adapter.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.assess15.arch_paging3.R
import com.assess15.arch_paging3.paging3_room.data.model.DataList

class PagingViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val txt = view.findViewById<TextView>(R.id.tvName)
    private var data: DataList? = null

    init {
        view.setOnClickListener {
            Toast.makeText(
                view.context,
                "\uD83D\uDE28 Wops ${data?.title}",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    companion object {
        fun create(parent: ViewGroup): PagingViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false)
            return PagingViewHolder(view)
        }
    }

    fun bind(list: DataList) {
        data = list
        txt.text = list.title
    }

}