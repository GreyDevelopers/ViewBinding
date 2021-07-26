package com.example.viewbinding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.viewbinding.databinding.FragmentHelloBinding

class FragmentHello :Fragment(R.layout.fragment_hello) {

    private lateinit var binding: FragmentHelloBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHelloBinding.bind(view)

        binding.tvHello
    }
}