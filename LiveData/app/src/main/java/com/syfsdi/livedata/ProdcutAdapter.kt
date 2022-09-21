package com.syfsdi.livedata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class ProdcutAdapter(var listProduct : ArrayList<DataProduct>): RecyclerView.Adapter<ProdcutAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.productName)
        var price = itemView.findViewById<TextView>(R.id.productPrice)
        var img = itemView.findViewById<ImageView>(R.id.imgProduct)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = listProduct[position]
        holder.name.text = listProduct[position].nameProduct
        holder.price.text = listProduct[position].priceProduct
        holder.img.setImageResource(data.imgProduct)
    }

    override fun getItemCount(): Int {
        return listProduct.size
    }

    fun setDataProduct(itemData : ArrayList<DataProduct>) {
        this.listProduct = itemData
    }
}