package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    var my_List = ArrayList<WishListItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var data : MutableList<WishListItem> = ArrayList()
        var Rec = findViewById<RecyclerView>(R.id.RV)
        val adapter = ItemAdapter(my_List)
        val button = findViewById<Button>(R.id.button)
        val EditText1 = findViewById<EditText>(R.id.WishItem)
        val EditText2 = findViewById<EditText>(R.id.Price)
        val EditText3 = findViewById<EditText>(R.id.store)
        button.setOnClickListener {
            var item = EditText1.text.toString()
            var price = EditText2.text.toString()
            var store = EditText3.text.toString()
            my_List.add(WishListItem(item,price,store))
            EditText1.text.clear()
            EditText2.text.clear()
            EditText3.text.clear()
            adapter.notifyDataSetChanged()

        }
        Rec.adapter = adapter
        Rec.layoutManager = LinearLayoutManager(this)

    }

}