package com.github.liangxuyuan1.myawesomeplugin.services

import com.intellij.openapi.project.Project
import com.github.liangxuyuan1.myawesomeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
