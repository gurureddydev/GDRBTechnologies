package com.guru.gdrbtechnologies.data.network

import com.guru.gdrbtechnologies.data.LoginRequest
import com.guru.gdrbtechnologies.data.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("login")
    suspend fun login(@Body request: LoginRequest): LoginResponse
}
