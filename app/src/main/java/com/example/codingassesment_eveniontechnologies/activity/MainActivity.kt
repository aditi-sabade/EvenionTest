package com.example.codingassesment_eveniontechnologies.activity

import Repository
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.codingassesment_eveniontechnologies.R
import com.example.codingassesment_eveniontechnologies.adapter.AnimalDeleteClickListner
import com.example.codingassesment_eveniontechnologies.adapter.MyRecyclerviewAdapter
import com.example.codingassesment_eveniontechnologies.model.Animals
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AnimalDeleteClickListner {
    val adapter = MyRecyclerviewAdapter(this)
    lateinit var animalsList: ArrayList<Animals>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        Repository.getAnimalList()?.let {
            animalsList = it
            adapter.setAnimalList(animalsList)
        }
    }

    override fun onAnimalDeleteClicked(item: Animals) {
        animalsList.remove(item)
        adapter.setAnimalList(animalsList)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.create_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.create -> {
                animalsList.add(Animals("https://e7.pngegg.com/pngimages/665/236/png-clipart-cute-dog-puppy-dog.png","Echo","Good dog...."))
                adapter.setAnimalList(animalsList)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}