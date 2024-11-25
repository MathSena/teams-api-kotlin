package com.mathsena.myfirstapp.repository

import com.mathsena.myfirstapp.model.Team
import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository : JpaRepository<Team, Long> {
}