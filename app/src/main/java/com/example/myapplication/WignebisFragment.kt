package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class WignebisFragment : Fragment() {
    private lateinit var recyclerview:RecyclerView
    private lateinit var BookAdapter:BookAdapter
    private lateinit var booklist:ArrayList<Books>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_wignebis, container, false)
        recyclerview=view.findViewById(R.id.recycle)
        recyclerview.setHasFixedSize(true)
        recyclerview.layoutManager=LinearLayoutManager(this.requireContext())
        booklist=ArrayList()

        booklist.add(Books(R.drawable.metro2023,"Metro2033"))
        booklist.add(Books(R.drawable.hitleri,"ჩემი ბრძოლა"))
        booklist.add(Books(R.drawable.snowman,"თოვლის კაცი"))
        booklist.add(Books(R.drawable.nigbisaxsareba,"ნიღბის აღსარება"))
        booklist.add(Books(R.drawable.danashauli,"დანაშაული და სასჯელი"))
        booklist.add(Books(R.drawable.gtafimonte,"გრაფი მონტე კრისტო"))
        booklist.add(Books(R.drawable.vefxistyaos1,"ვეფხისტყაოსანი"))
        booklist.add(Books(R.drawable.metro2023,"Metro2033"))
        booklist.add(Books(R.drawable.hitleri,"ჩემი ბრძოლა"))
        booklist.add(Books(R.drawable.snowman,"თოვლის კაცი"))
        booklist.add(Books(R.drawable.nigbisaxsareba,"ნიღბის აღსარება"))
        booklist.add(Books(R.drawable.danashauli,"დანაშაული და სასჯელი"))
        booklist.add(Books(R.drawable.gtafimonte,"გრაფი მონტე კრისტო"))
        booklist.add(Books(R.drawable.vefxistyaos1,"ვეფხისტყაოსანი"))
        booklist.add(Books(R.drawable.metro2023,"Metro2033"))
        booklist.add(Books(R.drawable.hitleri,"ჩემი ბრძოლა"))
        booklist.add(Books(R.drawable.snowman,"თოვლის კაცი"))
        booklist.add(Books(R.drawable.nigbisaxsareba,"ნიღბის აღსარება"))
        booklist.add(Books(R.drawable.danashauli,"დანაშაული და სასჯელი"))
        booklist.add(Books(R.drawable.gtafimonte,"გრაფი მონტე კრისტო"))
        booklist.add(Books(R.drawable.vefxistyaos1,"ვეფხისტყაოსანი"))
        booklist.add(Books(R.drawable.metro2023,"Metro2033"))
        booklist.add(Books(R.drawable.hitleri,"ჩემი ბრძოლა"))
        booklist.add(Books(R.drawable.snowman,"თოვლის კაცი"))
        booklist.add(Books(R.drawable.nigbisaxsareba,"ნიღბის აღსარება"))
        booklist.add(Books(R.drawable.danashauli,"დანაშაული და სასჯელი"))
        booklist.add(Books(R.drawable.gtafimonte,"გრაფი მონტე კრისტო"))
        booklist.add(Books(R.drawable.vefxistyaos1,"ვეფხისტყაოსანი"))
        booklist.add(Books(R.drawable.metro2023,"Metro2033"))
        booklist.add(Books(R.drawable.hitleri,"ჩემი ბრძოლა"))
        booklist.add(Books(R.drawable.snowman,"თოვლის კაცი"))
        booklist.add(Books(R.drawable.nigbisaxsareba,"ნიღბის აღსარება"))
        booklist.add(Books(R.drawable.danashauli,"დანაშაული და სასჯელი"))
        booklist.add(Books(R.drawable.gtafimonte,"გრაფი მონტე კრისტო"))
        booklist.add(Books(R.drawable.vefxistyaos1,"ვეფხისტყაოსანი"))
        booklist.add(Books(R.drawable.metro2023,"Metro2033"))
        booklist.add(Books(R.drawable.hitleri,"ჩემი ბრძოლა"))
        booklist.add(Books(R.drawable.snowman,"თოვლის კაცი"))
        booklist.add(Books(R.drawable.nigbisaxsareba,"ნიღბის აღსარება"))
        booklist.add(Books(R.drawable.danashauli,"დანაშაული და სასჯელი"))
        booklist.add(Books(R.drawable.gtafimonte,"გრაფი მონტე კრისტო"))
        booklist.add(Books(R.drawable.vefxistyaos1,"ვეფხისტყაოსანი"))
        booklist.add(Books(R.drawable.metro2023,"Metro2033"))
        booklist.add(Books(R.drawable.hitleri,"ჩემი ბრძოლა"))
        booklist.add(Books(R.drawable.snowman,"თოვლის კაცი"))
        booklist.add(Books(R.drawable.nigbisaxsareba,"ნიღბის აღსარება"))
        booklist.add(Books(R.drawable.danashauli,"დანაშაული და სასჯელი"))
        booklist.add(Books(R.drawable.gtafimonte,"გრაფი მონტე კრისტო"))
        booklist.add(Books(R.drawable.vefxistyaos1,"ვეფხისტყაოსანი"))
        booklist.add(Books(R.drawable.metro2023,"Metro2033"))
        booklist.add(Books(R.drawable.hitleri,"ჩემი ბრძოლა"))
        booklist.add(Books(R.drawable.snowman,"თოვლის კაცი"))
        booklist.add(Books(R.drawable.nigbisaxsareba,"ნიღბის აღსარება"))
        booklist.add(Books(R.drawable.danashauli,"დანაშაული და სასჯელი"))
        booklist.add(Books(R.drawable.gtafimonte,"გრაფი მონტე კრისტო"))
        booklist.add(Books(R.drawable.vefxistyaos1,"ვეფხისტყაოსანი"))
        booklist.add(Books(R.drawable.metro2023,"Metro2033"))
        booklist.add(Books(R.drawable.hitleri,"ჩემი ბრძოლა"))
        booklist.add(Books(R.drawable.snowman,"თოვლის კაცი"))
        booklist.add(Books(R.drawable.nigbisaxsareba,"ნიღბის აღსარება"))
        booklist.add(Books(R.drawable.danashauli,"დანაშაული და სასჯელი"))
        booklist.add(Books(R.drawable.gtafimonte,"გრაფი მონტე კრისტო"))
        booklist.add(Books(R.drawable.vefxistyaos1,"ვეფხისტყაოსანი"))
        booklist.add(Books(R.drawable.metro2023,"Metro2033"))
        booklist.add(Books(R.drawable.hitleri,"ჩემი ბრძოლა"))
        booklist.add(Books(R.drawable.snowman,"თოვლის კაცი"))
        booklist.add(Books(R.drawable.nigbisaxsareba,"ნიღბის აღსარება"))
        booklist.add(Books(R.drawable.danashauli,"დანაშაული და სასჯელი"))
        booklist.add(Books(R.drawable.gtafimonte,"გრაფი მონტე კრისტო"))
        booklist.add(Books(R.drawable.vefxistyaos1,"ვეფხისტყაოსანი"))
        BookAdapter=BookAdapter(booklist)
        recyclerview.adapter=BookAdapter



        return view


    }


}