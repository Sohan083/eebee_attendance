package com.example.eebee_attendance.versioncheck

data class VersionCheckApiResponse(
    val appInfo: AppInfo,
    val message: String,
    val success: Boolean
)