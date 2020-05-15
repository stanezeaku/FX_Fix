package com.ifeetech.fxfix.ui.tradesessions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ifeetech.fxfix.R
import com.ifeetech.fxfix.databinding.FragmentTradeSessionsBinding
import kotlinx.android.synthetic.main.board_trade_session.view.*

class TradeSessionsFragment : Fragment() {


    private lateinit var binding: FragmentTradeSessionsBinding
    private val model: TradeSessionsViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentTradeSessionsBinding.inflate(inflater, container, false)


        binding.homeViewModel = model

        binding.lifecycleOwner = this

        setSydneySession(binding)
        setTokyoSession(binding)
        setLondonSession(binding)
        setNewYorkSession(binding)



        return binding.root
    }


    private fun setSydneySession(binding: FragmentTradeSessionsBinding) {
        binding.includeSydneySession.image_one.setImageResource(R.drawable.ic_aus_flag)
    }

    private fun setTokyoSession(binding: FragmentTradeSessionsBinding) {
        binding.includeTokyoSession.image_one.setImageResource(R.drawable.ic_japan_flag)

    }

    private fun setLondonSession(binding: FragmentTradeSessionsBinding) {
        binding.includeLondonSession.image_one.setImageResource(R.drawable.ic_uk_flag)

    }


    private fun setNewYorkSession(binding: FragmentTradeSessionsBinding) {
        binding.includeNewyorkSession.image_one.setImageResource(R.drawable.ic_usa_flag)

    }


}