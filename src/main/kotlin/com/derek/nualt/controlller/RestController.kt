package com.derek.nualt.controlller

import com.derek.nualt.entity.JobPosting
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = ["https://nucareers.northeastern.edu"])
class RestController {

    @GetMapping("/test")
    fun getTest(): String = "Hello, world"

    @GetMapping("/jobs")
    fun retrieveJobs(): List<JobPosting> = listOf(
            JobPosting(nuCareersId = 1, title = "Software Developer Coop", company = "Google"),
            JobPosting(nuCareersId = 2, title = "Software Developer Coop", company = "Facebook")
    )
}