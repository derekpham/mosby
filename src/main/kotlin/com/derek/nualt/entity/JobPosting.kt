package com.derek.nualt.entity

data class JobPosting(
        val nuCareersId: Int,
        val minWage: Int = 0,
        val maxWage: Int = 0,
        val title: String,
        val company: String
)