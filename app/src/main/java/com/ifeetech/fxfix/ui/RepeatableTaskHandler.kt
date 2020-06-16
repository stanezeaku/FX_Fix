package com.ifeetech.fxfix.ui


import android.os.Handler
import android.os.Message
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

/**
 * A lifecycle aware handler to perform repeatable task
 */
class RepeatableTaskHandler(
    private val lifecycleOwner: LifecycleOwner,
    private val repeatInterval: Long,
    private val action: (() -> Unit)?
) : Handler(),
    LifecycleObserver {

    override fun handleMessage(msg: Message) {
        action?.invoke()
        this.sendMessageDelayed(Message(), repeatInterval)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        this.sendMessageDelayed(Message(), repeatInterval)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        removeMessages(0)
    }

}