package com.derek.nualt.entity

import java.sql.Date
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Application (
        @Id var companyName: String = "",
        var dateApplied: Date = Date.valueOf(LocalDate.MAX),
        var applicationSite: String = "",
        var process: String? = null,
        var status: String = "pending",
        var type: String  = "internship"
)