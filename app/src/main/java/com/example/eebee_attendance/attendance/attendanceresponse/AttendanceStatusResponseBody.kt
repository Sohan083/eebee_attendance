package com.example.eebee_attendance.attendance.attendanceresponse

import com.example.eebee_attendance.attendance.attendanceresponse.Result

data class AttendanceStatusResponseBody(
    val message: String,
    val resultList: List<Result>,
    val success: Boolean
)