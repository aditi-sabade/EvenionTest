package com.example.codingassesment_eveniontechnologies.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.codingassesment_eveniontechnologies.R
import com.example.codingassesment_eveniontechnologies.databinding.ListRowElementBinding
import com.example.codingassesment_eveniontechnologies.model.Animals

class MyRecyclerviewAdapter(listner: AnimalDeleteClickListner) :
    RecyclerView.Adapter<MyRecyclerviewAdapter.MyViewHolder>() {

    private var mAnimalsModel: List<Animals>? = null

    private val listener:AnimalDeleteClickListner = listner

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MyViewHolder {
        val mListElementBinding = DataBindingUtil.inflate<ListRowElementBinding>(
            LayoutInflater.from(viewGroup.context),
            R.layout.list_row_element, viewGroup, false
        )
        return MyViewHolder(mListElementBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentAnimal = mAnimalsModel!![position]
        holder.bind(currentAnimal, listener)
    }

    override fun getItemCount(): Int {
        return mAnimalsModel?.size!!
    }

    fun setAnimalList(mAnimalsList: List<Animals>) {
        this.mAnimalsModel = mAnimalsList
        notifyDataSetChanged()
    }

    inner class MyViewHolder(val view: ListRowElementBinding) : RecyclerView.ViewHolder(view.root) {
        fun bind(item: Animals, listener: AnimalDeleteClickListner) {
            view.animals = item
            view.animalDelete = listener
        }
    }
}

interface AnimalDeleteClickListner {
    fun onAnimalDeleteClicked(item: Animals)
}