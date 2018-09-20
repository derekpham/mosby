package com.derek.nualt.controlller

import com.derek.nualt.entity.JobPosting
import com.derek.nualt.repository.JobPostingRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/JobPostings")
@CrossOrigin(origins = ["https://nucareers.northeastern.edu", "moz-extension://a8e660b0-0ba3-4337-8250-5ed7607687f0"])
class JobPostingController (val repository: JobPostingRepository) {

    @GetMapping("/")
    fun findAll(): Iterable<JobPosting> = repository.findAll()

    @PostMapping("/save")
    fun saveJobPosting(@RequestBody jobPosting: JobPosting) = repository.save(jobPosting)
}