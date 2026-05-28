package com.github.aakumykov.qwerty

import android.util.Log

class Qwerty {
    fun work() {
        Log.d(TAG, "work(v0.0.0)")
    }
    companion object {
        val TAG: String = Qwerty::class.java.simpleName
    }
}