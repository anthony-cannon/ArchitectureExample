package com.example.architectureapplication

import android.app.Application
import com.example.myinjection.MyInjection
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            // send koin all component module, koin modules that are created by myinjection.
            // All these are available to the app module and all the feature modules
            modules(MyInjection.getKoinComponentModules())
        }
    }
}