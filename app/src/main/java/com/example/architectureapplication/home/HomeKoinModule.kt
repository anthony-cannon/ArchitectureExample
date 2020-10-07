package com.example.architectureapplication.home

import com.example.architectureapplication.data.MyAppData
import com.example.architectureapplication.data.MyAppDataImpl
import org.koin.dsl.module

// Koin modules that are only allowed to be used by the app module
internal val homeKoinModule = module {
    factory<MyAppData> { MyAppDataImpl() }
}