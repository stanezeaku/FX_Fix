package com.ifeetech.fxfix.ui.send

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ifeetech.fxfix.databinding.FragmentSendBinding

class SendFragment : Fragment() {

    private val model: SendViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding  = FragmentSendBinding.inflate(inflater, container, false)

        binding.sendViewModel = model
        binding.lifecycleOwner = this


        return binding.root
    }
}