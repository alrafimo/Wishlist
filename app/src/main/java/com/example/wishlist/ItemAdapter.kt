package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class ItemAdapter (private val Wish: List<WishListItem>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>(){


        // Provide a direct reference to each of the views within a data item
        // Used to cache the views within the item layout for fast access
        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            // TODO: Create member variables for any view that will be set
            // as you render a row.
            lateinit var Item: TextView
            lateinit var Price: TextView
            lateinit var Store: TextView



            // We also create a constructor that accepts the entire item row
            // and does the view lookups to find each sub-view
            init {
                // TODO: Store each of the layout's views into
                // the public final member variables created above
                Item = itemView.findViewById<TextView>(R.id.textView)
                Price = itemView.findViewById<TextView>(R.id.textView2)
                Store = itemView.findViewById<TextView>(R.id.textView3)

            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val context = parent.context
            val inflater = LayoutInflater.from(context)
            // Inflate the custom layout
            val contactView = inflater.inflate(R.layout.items, parent, false)
            // Return a new holder instance
            return ViewHolder(contactView)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            // Get the data model based on position
            val need = Wish.get(position)
            // Set item views based on views and data model
            holder.Item.text = need.item
            holder.Price.text = need.price
            holder.Store.text = need.store

        }

        override fun getItemCount(): Int {
            return Wish.size
        }
    }
