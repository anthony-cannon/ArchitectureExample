package com.example.mylibrary

// Only this module can see this
internal class TestLibImpl : TestLib {

    override fun testMe(): String {
        return "Hello World!"
    }
}