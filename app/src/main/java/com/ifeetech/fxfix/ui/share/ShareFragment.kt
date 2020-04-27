package com.ifeetech.fxfix.ui.share

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ifeetech.fxfix.databinding.FragmentShareBinding

class ShareFragment : Fragment() {

    private val model: ShareViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentShareBinding.inflate(inflater, container, false)

        binding.shareViewModel = model
        binding.lifecycleOwner = this

        return binding.root
    }
}