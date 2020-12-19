package com.example.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //Field Injection
    @Inject
    lateinit var someClass: someClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(someClass.doaThing())
        println(someClass.doSomeOtherThing())
    }
}

class someClass
@Inject constructor(private val someOtherClass: someOtherClass) {

    fun doaThing(): String {
        return "Did A Thing!"
    }

    fun doSomeOtherThing(): String {
        return someOtherClass.doSomeOtherThing()
    }
}

class someOtherClass @Inject constructor() {
    fun doSomeOtherThing(): String {
        return "Did Some Other Thing!"
    }
}