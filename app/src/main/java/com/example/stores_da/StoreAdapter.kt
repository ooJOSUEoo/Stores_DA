package com.example.stores_da

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.stores_da.databinding.ItemStoreBinding

class StoreAdapter {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemStoreBinding.bind(view)
    }
}