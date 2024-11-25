package com.mathsena.myfirstapp.controller

import com.mathsena.myfirstapp.model.Team
import com.mathsena.myfirstapp.service.TeamService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/teams")
class TeamController(private val service: TeamService) {

    @GetMapping
    fun getAllTeams(): List<Team> = service.getAllTeams()

    @GetMapping("/{id}")
    fun getTeamById(@PathVariable id: Long): Team = service.getTeamById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createTeam(@RequestBody team: Team): Team = service.createTeam(team)

    @PutMapping("/{id}")
    fun updateTeam(@PathVariable id: Long, @RequestBody team: Team): Team = service.updateTeam(id, team)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteTeam(@PathVariable id: Long) = service.deleteTeam(id)
}
