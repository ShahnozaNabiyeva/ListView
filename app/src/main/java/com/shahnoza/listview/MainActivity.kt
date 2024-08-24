package com.shahnoza.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.shahnoza.listview.adapter.UserAdapter
import com.shahnoza.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list:ArrayList<String>
    lateinit var adapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        list= ArrayList()
        loadData()

        adapter = UserAdapter(this,list)
       // val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1)
        binding.listview.adapter  =  adapter
        binding.listview.setOnClickListener {


            Toast.makeText(this, "Working ", Toast.LENGTH_SHORT).show()
        }

    }

    private fun loadData() {
        for(i in 0..100){
            list.add("Android developing $i")
        }
    }
}