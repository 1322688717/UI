package com.guard.androidui.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.guard.androidui.R
import com.guard.androidui.base.BaseFragment
import com.guard.androidui.databinding.FragmentMainBinding
import com.guard.androidui.viewmodel.MainFragmentViewModel

class MainFragment : BaseFragment<MainFragmentViewModel,FragmentMainBinding>() {
    override fun initView(savedInstanceState: Bundle?) {
        initClick()
    }

    private fun initClick() {
        mViewBind.apply {
            btnProgressbar.setOnClickListener {
                NavHostFragment.findNavController(this@MainFragment).navigate(R.id.action_mainFragment_to_progressbarFragment)
            }
        }
    }
}