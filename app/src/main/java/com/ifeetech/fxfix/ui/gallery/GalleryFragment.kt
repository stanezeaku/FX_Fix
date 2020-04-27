package com.ifeetech.fxfix.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ifeetech.fxfix.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private val model: GalleryViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val binding  = FragmentGalleryBinding.inflate(inflater, container, false)

        binding.galleryViewModel = model
        binding.lifecycleOwner = this


        return binding.root
    }
}