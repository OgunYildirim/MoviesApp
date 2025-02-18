package com.example.filmapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.filmapp.data.entity.Filmler
import com.example.filmapp.databinding.CardTasarimBinding
import com.example.filmapp.databinding.FragmentAnasayfaBinding
import com.example.filmapp.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class FilmlerAdapter(var mContext: Context,var  filmlerListesi:List<Filmler>) :RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {


        val binding= CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)

        return CardTasarimTutucu(binding)

    }



    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film=filmlerListesi.get(position)
        val t=holder.tasarim

        t.imageViewFilm.setImageResource(mContext.resources.getIdentifier(film.resim,"drawable",mContext.packageName))

        t.textViewFiyat.text= "${film.fiyat} $"


        t.CardViewFilm.setOnClickListener {

            val gecis=AnasayfaFragmentDirections.detaygecis(film)
            Navigation.findNavController(it).navigate(gecis)




        }






        t.buttonSepet.setOnClickListener {

            Snackbar.make(it,"${film.ad} Sepete Eklendi ",Snackbar.LENGTH_SHORT).show()


        }


    }



    override fun getItemCount(): Int {
        return filmlerListesi.size

    }


}