package com.mathsena.myfirstapp.service

import com.mathsena.myfirstapp.model.Team
import com.mathsena.myfirstapp.repository.TeamRepository
import org.springframework.stereotype.Service

@Service
class TeamService(private val repository: TeamRepository) {

    fun getAllTeams(): List<Team> = repository.findAll()

    fun getTeamById(id: Long): Team = repository.findById(id).orElseThrow { Exception("Team not found") }

    fun createTeam(team: Team): Team = repository.save(team)

    fun updateTeam(id: Long, updatedTeam: Team): Team {
        val team = getTeamById(id)
        team.name = updatedTeam.name
        team.city = updatedTeam.city
        team.titles = updatedTeam.titles
        return repository.save(team)
    }

    fun deleteTeam(id: Long) = repository.deleteById(id)
}
