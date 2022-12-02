package com.example.eebee_attendance.login

import com.example.eebee_attendance.login.loginResponse.LoginResponseBody
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginApiInterface {
    @FormUrlEncoded
    @POST("login/login.php")
    fun login(
       @Field("LoginId") id: String,
       @Field("LoginPassword") pass: String
   ): retrofit2.Call<LoginResponseBody>



}