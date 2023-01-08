package com.mtjin.ai_drawing_picture.views.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavDirections
import com.mtjin.ai_drawing_picture.base.BaseViewModel

class MainViewModel : BaseViewModel() {

    private val _navDirection = MutableLiveData<NavDirections>()
    val navDirection: LiveData<NavDirections> get() = _navDirection
}