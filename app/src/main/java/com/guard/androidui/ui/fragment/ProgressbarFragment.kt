package com.guard.androidui.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guard.androidui.R
import com.guard.androidui.base.BaseFragment
import com.guard.androidui.databinding.FragmentProgressbarBinding
import com.guard.androidui.viewmodel.ProgressbarFragmentViewModel


class ProgressbarFragment : BaseFragment<ProgressbarFragmentViewModel,FragmentProgressbarBinding>() {
    override fun initView(savedInstanceState: Bundle?) {
        initClick()
    }

    private fun initClick() {
        mViewBind.apply {
            btnStart.setOnClickListener {
                mViewModel.start(requireActivity())
                mViewModel.p.observe(this@ProgressbarFragment) {
                    progressBar.progress = it
                }
            }

        }
    }
}