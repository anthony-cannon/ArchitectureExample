package com.example.mylibrary

import org.koin.dsl.module

// This will be used by myinjection. By defining it within this module, all implementations are able to be kept internal, increasing module encapsulation.
val libKoinModule = module {
    factory<TestLib> { TestLibImpl() }
}