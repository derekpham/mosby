package com.derek.nualt.repository

import com.derek.nualt.entity.JobPosting
import org.springframework.data.repository.CrudRepository

interface JobPostingRepository : CrudRepository<JobPosting, Long> {
}