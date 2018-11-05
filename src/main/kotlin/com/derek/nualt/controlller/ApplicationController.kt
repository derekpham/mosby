package com.derek.nualt.controlller

import com.derek.nualt.entity.Application
import com.derek.nualt.repository.ApplicationRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.time.LocalDate

@Controller
@RequestMapping("/Application")
class ApplicationController (val repository: ApplicationRepository) {

    @GetMapping("/")
    @ResponseBody
    fun findAll(): Iterable<Application> = repository.findAll()
}