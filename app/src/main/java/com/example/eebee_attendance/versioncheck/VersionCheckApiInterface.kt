package com.example.eebee_attendance.versioncheck


import com.example.eebee_attendance.attendance.attendanceresponse.AttendanceStatusResponseBody
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface VersionCheckApiInterface {
    @FormUrlEncoded
    @POST("app_version/version_check.php")
    fun checkVersion(
        @Field("UserId") UserId: String,
        @Field("CurrentVersion") CurrentVersion: String,
        @Field("AppName") AppName: String
    ): retrofit2.Call<VersionCheckApiResponse>
}