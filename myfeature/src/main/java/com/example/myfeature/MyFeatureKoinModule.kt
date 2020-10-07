package com.example.myfeature

import com.example.myfeature.data.MyFeatureInfo
import com.example.myfeature.data.MyFeatureInfoImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

// Koin modules that are only allowed to be used by the myfeature module
internal val featureKoinModule = module {
    factory<MyFeatureInfo> { MyFeatureInfoImpl() }
    viewModel { MyFeatureViewModel() }
}