package com.giuliana.evaluacioncontinuatres.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.giuliana.evaluacioncontinuatres.R
import com.giuliana.evaluacioncontinuatres.databinding.FragmentRickiMortiFavoriteBinding


class RickiMortiFavoriteFragment : Fragment() {
    private lateinit var binding: FragmentRickiMortiFavoriteBinding
    private lateinit var viewModel: RickiMortiFavoriteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel= ViewModelProvider(requireActivity()).get(RickiMortiFavoriteViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentRickiMortiFavoriteBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter= RVRickiMortiListAdapter2(listOf())
        binding.rvRickimortiFavorite.adapter=adapter
        binding.rvRickimortiFavorite.layoutManager=
            GridLayoutManager(requireContext(), 1, RecyclerView.VERTICAL, false)
        viewModel.rickimortiList.observe(requireActivity()) {
            adapter.results=it
            adapter.notifyDataSetChanged()
        }
        viewModel.getRickiFromService()
    }
}