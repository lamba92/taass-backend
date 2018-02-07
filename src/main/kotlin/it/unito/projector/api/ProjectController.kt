package it.unito.projector.api

import it.unito.projector.data.repositories.ProjectRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/project")
class ProjectController (val repository: ProjectRepository) {

    @GetMapping("/title/{projectTitle}")
    fun findProjectByTitle(@PathVariable projectTitle: String)
            = repository.findByTitle(projectTitle)
}