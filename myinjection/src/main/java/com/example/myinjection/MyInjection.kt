package com.example.myinjection

import com.example.mylibrary.libKoinModule
import org.koin.core.module.Module

// If we made a list of component module koin modules in the app module, then there would have to be multiple dependencies within the app modules gradle
// even though none of them component modules were being used. This removes that problem, by doing all the work here in this module
object MyInjection {

    fun getKoinComponentModules(): List<Module> {
        return listOf(libKoinModule)
    }
}