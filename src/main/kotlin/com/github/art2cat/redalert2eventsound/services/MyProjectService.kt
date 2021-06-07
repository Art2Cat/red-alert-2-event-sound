package com.github.art2cat.redalert2eventsound.services

import com.github.art2cat.redalert2eventsound.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
