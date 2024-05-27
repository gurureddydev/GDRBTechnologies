package com.guru.gdrbtechnologies.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.guru.gdrbtechnologies.data.LoginRequest
import com.guru.gdrbtechnologies.data.LoginResponse
import com.guru.gdrbtechnologies.data.network.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

class LoginViewModel : ViewModel() {
    private val _loginState = MutableStateFlow<LoginResponse?>(null)
    val loginState: StateFlow<LoginResponse?> get() = _loginState

    private val apiService = RetrofitInstance.apiService

    fun login(email: String, password: String, deviceId: String) {
        viewModelScope.launch {
            try {
                val response = apiService.login(LoginRequest(email, password, deviceId))
                _loginState.value = response
            } catch (e: HttpException) {
                _loginState.value = LoginResponse(false, "HTTP error: ${e.message()}")
            } catch (e: IOException) {
                _loginState.value = LoginResponse(false, "Network error: ${e.message}")
            } catch (e: Exception) {
                _loginState.value = LoginResponse(false, "Unexpected error: ${e.message}")
            }
        }
    }
}
