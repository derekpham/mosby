package com.derek.nualt.repository

import com.derek.nualt.entity.Application
import org.springframework.data.repository.CrudRepository

interface ApplicationRepository: CrudRepository<Application, Long>