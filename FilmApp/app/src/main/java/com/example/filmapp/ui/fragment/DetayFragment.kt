package com.example.filmapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.filmapp.R
import com.example.filmapp.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding=FragmentDetayBinding.inflate(inflater, container, false)

        val bundle:DetayFragmentArgs by navArgs()
        val film=bundle.film


        binding.toolbarDetay.title=film.ad

        binding.iwfilm.setImageResource(resources.getIdentifier(film.resim,"drawable",requireContext().packageName))

        binding.tvFiyat.text = "${film.fiyat} $"




        return binding.root

    }


}
