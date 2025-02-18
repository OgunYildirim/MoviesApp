package com.example.filmapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.filmapp.R
import com.example.filmapp.data.entity.Filmler
import com.example.filmapp.databinding.FragmentAnasayfaBinding
import com.example.filmapp.ui.adapter.FilmlerAdapter


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentAnasayfaBinding.inflate(inflater, container, false)


        binding.toolbarAnasayfa.title="Movies"

        binding.filmRw.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)



        val filmlerListesi=ArrayList<Filmler>()
        val f1 =Filmler(1,"Django","django",2)
        val f2 =Filmler(2,"Interstellar","interstellar",9)
        val f3 =Filmler(3,"Inception","inception",1)
        val f4 =Filmler(4,"The Hateful Eight","thehatefuleight",7)
        val f5 =Filmler(5,"The Pianist","thepianist",4)
        val f6 =Filmler(6,"Anadoluda","anadoluda",5)

        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)


        val filmlerAdapter=FilmlerAdapter(requireContext(),filmlerListesi)
        binding.filmRw.adapter=filmlerAdapter




        return binding.root

    }



}




