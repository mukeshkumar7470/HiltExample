package com.innovation.hiltexample

import androidx.lifecycle.ViewModel
import com.innovation.hiltexample.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private var userRepository: UserRepository
) : ViewModel() {

    fun calling() {
        userRepository.printLog()
    }
}