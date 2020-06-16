package com.ifeetech.fxfix.ui.tradesessions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ifeetech.fxfix.R
import com.ifeetech.fxfix.databinding.FragmentTradeSessionsBinding
import com.ifeetech.fxfix.ui.RepeatableTaskHandler
import kotlinx.android.synthetic.main.board_trade_session.view.*
import kotlinx.android.synthetic.main.main_board_trade_session.view.*
import java.util.*
import java.util.Calendar.AM
import java.util.Calendar.PM


private const val TIME_CLOCK_FORMAT = "hh:mm:ss a \nEE d MMM yyyy \nzz"

class TradeSessionsFragment : Fragment() {

    val repeatableRepeatableTaskHandler: RepeatableTaskHandler = RepeatableTaskHandler(
        this,
        1 // do action every 1 Millisecond seconds
    ) {
        // the action to perform
        // show current date in textView

        openCloseSydney()
        openCloseTokyo()
        openCloseLondon()
        openCloseNewYork()


    }


    private fun openCloseSydney() {
        val eightAm = Calendar.getInstance(Locale("Australia/Sydney")).apply {
            set(Calendar.HOUR, 8)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
            set(Calendar.AM_PM, AM)
        }


        val fourPm = Calendar.getInstance(Locale("Australia/Sydney")).apply {
            set(Calendar.HOUR, 4)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
            set(Calendar.AM_PM, PM)
        }

        val isTimeAfterEight = Calendar.getInstance(
            Locale("Australia/Sydney")
        ).after(eightAm)

        val isTimeBeforeFour = Calendar.getInstance(Locale("Australia/Sydney")).before(fourPm)

        if (isTimeAfterEight && Calendar.getInstance(Locale("Australia/Sydney"))
                .get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && Calendar.getInstance(
                Locale("Australia/Sydney")
            ).get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
        ) {
            binding.includeSydneySession.text_one.text = "Open"
            binding.includeSydneySession.text_one.setBackgroundResource(R.drawable.green_background)
            binding.includeMainBoardSession.text_sydney_open.isVisible = true
        }

    }

    private fun openCloseTokyo() {
        val eightAm = Calendar.getInstance(Locale.JAPAN).apply {
            set(Calendar.HOUR, 8)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
            set(Calendar.AM_PM, AM)
        }

//        val fourPm = Calendar.getInstance(Locale.JAPAN).apply {
//            set(Calendar.HOUR, 4)
//            set(Calendar.MINUTE, 0)
//            set(Calendar.SECOND, 0)
//            set(Calendar.MILLISECOND, 0)
//        }

        val isTimeAfterEight = Calendar.getInstance(
            Locale.JAPAN
        ).after(eightAm)

//        val isTimeBeforeFour = Calendar.getInstance(Locale.JAPAN).before(fourPm)

        if (isTimeAfterEight && Calendar.getInstance(Locale.JAPAN)
                .get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && Calendar.getInstance(
                Locale.JAPAN
            ).get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
        ) {
            binding.includeTokyoSession.text_one.text = "Open"
            binding.includeTokyoSession.text_one.setBackgroundResource(R.drawable.green_background)
            binding.includeMainBoardSession.text_tokyo_open.isVisible = true
        }
    }


    private fun openCloseLondon() {
        val eightAm = Calendar.getInstance(Locale("Europe/London")).apply {
            set(Calendar.HOUR, 8)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
            set(Calendar.AM_PM, AM)
        }

        val fourPm = Calendar.getInstance(Locale("Europe/London")).apply {
            set(Calendar.HOUR, 4)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
            set(Calendar.AM_PM, PM)
        }

        val isTimeAfterEight = Calendar.getInstance(
            Locale("Europe/London")
        ).after(eightAm)

        val isTimeBeforeFour = Calendar.getInstance(Locale("Europe/London")).before(fourPm)

        if (isTimeAfterEight && Calendar.getInstance(Locale("Europe/London"))
                .get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && Calendar.getInstance(
                Locale("Europe/London")
            ).get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
        ) {
            binding.includeLondonSession.text_one.text = "Open"
            binding.includeLondonSession.text_one.setBackgroundResource(R.drawable.green_background)
            binding.includeMainBoardSession.text_london_open.isVisible = true
        }

    }


    private fun openCloseNewYork() {
        val eightAm = Calendar.getInstance(Locale("America/New_York")).apply {
            set(Calendar.HOUR, 8)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
            set(Calendar.AM_PM, AM)
        }

//        val fourPm = Calendar.getInstance(Locale("America/New_York")).apply {
//            set(Calendar.HOUR, 4)
//            set(Calendar.MINUTE, 0)
//            set(Calendar.SECOND, 0)
//            set(Calendar.MILLISECOND, 0)
//        }

        val isTimeAfterEight = Calendar.getInstance(
            Locale("America/New_York")
        ).after(eightAm)

//        val isTimeBeforeFour = Calendar.getInstance(Locale("Europe/London")).before(fourPm)

        if (isTimeAfterEight && Calendar.getInstance(Locale("America/New_York"))
                .get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && Calendar.getInstance(
                Locale("America/New_York")
            ).get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
        ) {
            binding.includeNewyorkSession.text_one.text = "Open"
            binding.includeNewyorkSession.text_one.setBackgroundResource(R.drawable.green_background)
            binding.includeMainBoardSession.text_newyork_open.isVisible = true
        }

    }


    private lateinit var binding: FragmentTradeSessionsBinding
    private val model: TradeSessionsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        lifecycle.addObserver(repeatableRepeatableTaskHandler)

        binding = FragmentTradeSessionsBinding.inflate(inflater, container, false)


        binding.homeViewModel = model

        binding.lifecycleOwner = this

        setSydneySession(binding)
        setTokyoSession(binding)
        setLondonSession(binding)
        setNewYorkSession(binding)


        return binding.root
    }

    override fun onDestroy() {
        lifecycle.removeObserver(repeatableRepeatableTaskHandler)
        super.onDestroy()
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