package com.github.tokiii.armstemplate.services

import com.intellij.openapi.project.Project
import com.github.tokiii.armstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
