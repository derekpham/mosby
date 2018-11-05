package com.derek.nualt.controlller

import com.derek.nualt.entity.JobPosting
import com.derek.nualt.repository.JobPostingRepository
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/JobPostings")
@CrossOrigin(origins = ["https://nucareers.northeastern.edu", "moz-extension://a8e660b0-0ba3-4337-8250-5ed7607687f0",
    "http://127.0.0.1:8080", "https://piazza.com"])
class JobPostingController (val repository: JobPostingRepository) {

    @GetMapping("/")
    @ResponseBody
    fun findAll(): Iterable<JobPosting> = repository.findAll()

    @RequestMapping(value = ["/save"], method = [RequestMethod.POST],
            consumes = [MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE],
            produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun saveJobPosting(jobPosting: JobPosting) = repository.save(jobPosting)
}