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

private const val TIME_CLOCK_FORMAT = "hh:mm:ss a \nEE d MMM yyyy \nzz"

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
        binding.includeSydneySession.apply {
            image_one.setImageResource(R.drawable.ic_aus_flag)
            text_clock.apply {
                timeZone = "Australia/Sydney"
                format12Hour = TIME_CLOCK_FORMAT
            }

        }

    }

    private fun setTokyoSession(binding: FragmentTradeSessionsBinding) {
        binding.includeTokyoSession.apply {
            image_one.setImageResource(R.drawable.ic_japan_flag)
            text_clock.apply {
                timeZone = "Asia/Tokyo"
                format12Hour = TIME_CLOCK_FORMAT
            }

        }

    }

    private fun setLondonSession(binding: FragmentTradeSessionsBinding) {
        binding.includeLondonSession.apply {
            image_one.setImageResource(R.drawable.ic_uk_flag)
            text_clock.apply {
                timeZone = "Europe/London"
                format12Hour = TIME_CLOCK_FORMAT
            }
        }

    }

    private fun setNewYorkSession(binding: FragmentTradeSessionsBinding) {
        binding.includeNewyorkSession.apply {
            image_one.setImageResource(R.drawable.ic_usa_flag)
            text_clock.apply {
                timeZone = "America/New_York"
                format12Hour = TIME_CLOCK_FORMAT
            }

        }

    }
}