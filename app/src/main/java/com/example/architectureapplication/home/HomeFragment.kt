package com.example.architectureapplication.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.architectureapplication.BaseFragment
import com.example.architectureapplication.R
import com.example.architectureapplication.data.MyAppData
import com.example.mylibrary.TestLib
import org.koin.android.ext.android.inject
import org.koin.core.module.Module

class HomeFragment : BaseFragment() {

    // injected by local koin module which is only available to the app module
    private val myData: MyAppData by inject()

    // injected by a myinjection module koin module which is available to be injected in an app or feature module
    private val testLib: TestLib by inject()

    override fun getKoinModules(): List<Module> = listOf(homeKoinModule)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("MainActivity", "myData: ${myData.getNumber()}")
        Log.e("MainActivity", "testLib: ${testLib.testMe()}")
        findNavController().navigate(R.id.action_navigation_main_to_navigation_my_feature)
    }
}