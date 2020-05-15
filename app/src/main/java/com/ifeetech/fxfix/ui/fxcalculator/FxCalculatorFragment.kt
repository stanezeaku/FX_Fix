package com.ifeetech.fxfix.ui.fxcalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ifeetech.fxfix.databinding.FragmentFxCalculatorBinding

class FxCalculatorFragment : Fragment() {

    private val model: FxCalculatorViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val binding  = FragmentFxCalculatorBinding.inflate(inflater, container, false)

        binding.galleryViewModel = model
        binding.lifecycleOwner = this


        return binding.root
    }
}