package com.example.android_study_google.a_viewbinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_study_google.databinding.ItemAdapterBinding

class ViewBindingAdapter : RecyclerView.Adapter<ViewBindingAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemAdapterBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.name.text = "适配器如何编写"
    }


    class ViewHolder(itemDemoBinding: ItemAdapterBinding) :
        RecyclerView.ViewHolder(itemDemoBinding.root) {
        var binding: ItemAdapterBinding = itemDemoBinding

    }

    override fun getItemCount(): Int {
        return 10
    }
}