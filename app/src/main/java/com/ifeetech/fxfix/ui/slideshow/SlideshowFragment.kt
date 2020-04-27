package com.ifeetech.fxfix.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ifeetech.fxfix.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private val model: SlideshowViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentSlideshowBinding.inflate(inflater, container, false)

        binding.slidesHowViewModel = model
        binding.lifecycleOwner = this

        return binding.root
    }
}