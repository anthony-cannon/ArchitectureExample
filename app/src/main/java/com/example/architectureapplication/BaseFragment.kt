package com.example.architectureapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules
import org.koin.core.module.Module

abstract class BaseFragment : Fragment() {

    abstract fun getKoinModules(): List<Module>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadKoinModules(getKoinModules())
    }

    override fun onDestroy() {
        super.onDestroy()
        unloadKoinModules(getKoinModules())
    }
}