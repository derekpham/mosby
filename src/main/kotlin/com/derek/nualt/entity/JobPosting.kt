package com.derek.nualt.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class JobPosting (
        @Id var id: Int = 0,
        var company: String = "",
        var title: String = "",
        var minWage: Int = 0,
        var maxWage: Int = 0
)