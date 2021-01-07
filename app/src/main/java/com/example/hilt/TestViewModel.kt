package com.example.hilt

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named

class TestViewModel @ViewModelInject constructor(
    @Named("String 1") str: String
) : ViewModel() {

    init {
        Log.d("View Model", "Test Strings from ViewModel: $str")
    }
}