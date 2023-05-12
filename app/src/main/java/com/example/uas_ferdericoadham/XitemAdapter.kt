package com.example.uas_ferdericoadham

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.uas_ferdericoadham.databinding.ItemRecycleBinding

class XitemAdapter (
    private val itemo: List<Ritem>
) : RecyclerView.Adapter<XitemAdapter.XitemViewHolder>(){

    // code
    var listener: RecyclerViewClickListener? = null

    // code

    inner class XitemViewHolder(
        val itemRecycleBinding: ItemRecycleBinding

    ) : RecyclerView.ViewHolder(itemRecycleBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): XitemViewHolder {
        val itemRecycleBinding = DataBindingUtil.inflate<ItemRecycleBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_recycle, parent, false
        )
        return XitemViewHolder(itemRecycleBinding)
    }

    override fun getItemCount() = itemo.size


    override fun onBindViewHolder(holder: XitemViewHolder, position: Int) {
        holder.itemRecycleBinding.imageView3.setImageResource(itemo[position].RitemImg)
        holder.itemRecycleBinding.itemName.text = itemo[position].RitemName
        holder.itemRecycleBinding.itemDescription.text = itemo[position].RitemDescription

        // code
        holder.itemRecycleBinding.listItem.setOnClickListener {
            listener?.onItemClicked(it, itemo[position])

        }
        // code
    }

}
