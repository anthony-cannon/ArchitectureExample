package com.example.myfeature.data

// class is only allowed to be used in myfeature module. And is to be created by koin
class MyFeatureInfoImpl : MyFeatureInfo {
    override fun getBoolean(): Boolean {
        return false
    }
}