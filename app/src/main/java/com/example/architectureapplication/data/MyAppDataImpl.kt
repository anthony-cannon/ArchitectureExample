package com.example.architectureapplication.data

// class is only allowed to be used in the app module. And is to be created by koin
internal class MyAppDataImpl : MyAppData {
    override fun getNumber(): Int {
        return 3
    }
}