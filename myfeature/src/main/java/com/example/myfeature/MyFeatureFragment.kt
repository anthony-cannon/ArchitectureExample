package com.example.myfeature

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.architectureapplication.BaseFragment
import com.example.myfeature.data.MyFeatureInfo
import com.example.mylibrary.TestLib
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.module.Module

class MyFeatureFragment : BaseFragment() {

    // injected by local koin module and is only available to the myfeature module
    private val myInfo: MyFeatureInfo by inject()

    // injected by a myinjection module koin module which is available to be injected in any app or feature modules
    private val testLib: TestLib by inject()

    // injected by local koin module and is only available to the myfeature module
    private val myViewModel: MyFeatureViewModel by viewModel()

    // Koin modules needed within this fragment
    override fun getKoinModules(): List<Module> =
        listOf(featureKoinModule)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_myfeature, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e("MyFeatureFragment", "myInfo: ${myInfo.getBoolean()}")
        Log.e("MyFeatureFragment", "testLib: ${testLib.testMe()}")
        Log.e("MyFeatureFragment", "myViewModel: ${myViewModel.welcomeString}")
    }
}