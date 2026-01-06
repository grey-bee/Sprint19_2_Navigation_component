package com.example.sprint19_2_navigation_component

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sprint19_2_navigation_component.databinding.FragmentImageBinding

class ImageFragment : Fragment() {

    private lateinit var binding: FragmentImageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentImageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goToStartButton.setOnClickListener { }

        binding.back.setOnClickListener { }

    }

}