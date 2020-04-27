package com.ifeetech.fxfix.ui.tools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ifeetech.fxfix.databinding.FragmentToolsBinding

class ToolsFragment : Fragment() {

    private val model: ToolsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentToolsBinding.inflate(inflater, container, false)

        binding.toolsViewModel = model
        binding.lifecycleOwner = this

        return binding.root
    }
}