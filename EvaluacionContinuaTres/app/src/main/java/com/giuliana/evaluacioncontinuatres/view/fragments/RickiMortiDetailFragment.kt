package com.giuliana.evaluacioncontinuatres.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.giuliana.evaluacioncontinuatres.R
import com.giuliana.evaluacioncontinuatres.databinding.FragmentRickiMortiDetailBinding


class RickiMortiDetailFragment : Fragment() {
    private lateinit var binding: FragmentRickiMortiDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentRickiMortiDetailBinding.inflate(inflater,container,false)
        return binding.root
    }


}