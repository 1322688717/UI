package com.guard.androidui.viewmodel

import android.app.Activity
import android.content.Context
import android.util.Log
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.MutableLiveData
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel
import kotlin.concurrent.thread

class ProgressbarFragmentViewModel : BaseViewModel() {

    var p = MutableLiveData<Int>()

    init {
        p.value = 0
    }

    fun start(context: FragmentActivity) {
        Thread(Runnable {
            try {
                var i = 0
                    while(true){
                        i++
                        Thread.sleep(75)
                        Log.e("TAG","i==$i")
                        context.runOnUiThread {  p.value = i }
                        if (i == 100){
                            break
                        }
                    }
            }catch (e: InterruptedException){
                    e.printStackTrace()
                }

        }).start()
    }

    fun pause(){



    }
}