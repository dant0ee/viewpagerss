package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.fragments.BookInfoFragment


class BookAdapter(private val booklist:ArrayList<Books>)
    : RecyclerView.Adapter<BookAdapter.BookViewHolder>(){

    class BookViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView =itemView.findViewById(R.id.poto)
        val textView: TextView =itemView.findViewById(R.id.textView)
        val agwera : TextView=itemView.findViewById(R.id.agwera)
        val pasi: TextView=itemView.findViewById(R.id.wignispasi)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)

        return BookViewHolder(view)




    }
    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = booklist[position]
        holder.imageView.setImageResource(book.image)
        holder.textView.text = book.name
        holder.agwera.text=book.dec
        holder.pasi.text=book.pas



        holder.itemView.setOnClickListener {
            val bundle = Bundle()

            bundle.putString("title", book.name)
            bundle.putInt("img", book.image)
            bundle.putString("desc",book.dec)
            bundle.putString("passi",book.pas)


            val fragment  = BookInfoFragment()
            fragment.arguments = bundle

            (holder.itemView.context as FragmentActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.mainContainer, fragment,null)
                .addToBackStack(null)
                .commit()

        }


    }


    override fun getItemCount(): Int {
        return booklist.size

    }



}