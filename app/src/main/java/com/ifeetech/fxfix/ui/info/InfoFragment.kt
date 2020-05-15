package com.ifeetech.fxfix.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ifeetech.fxfix.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private val model: InfoViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding  = FragmentInfoBinding.inflate(inflater, container, false)

        binding.sendViewModel = model
        binding.lifecycleOwner = this


        return binding.root
    }
}