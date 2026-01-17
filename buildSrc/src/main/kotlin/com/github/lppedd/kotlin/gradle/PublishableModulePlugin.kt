package com.github.lppedd.kotlin.gradle

import com.vanniktech.maven.publish.MavenPublishPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

class PublishableModulePlugin : Plugin<Project> {

  override fun apply(project: Project) {
    project.apply<MavenPublishPlugin>()

    project.afterEvaluate {
      configureGithubPublishing(project)
    }
  }

  private fun configureGithubPublishing(project: Project) {
    val owner = project.findProperty("github.owner")?.toString()
      ?: System.getenv("GITHUB_OWNER")
      ?: error("Missing github.owner")

    val repo = project.findProperty("github.repo")?.toString()
      ?: System.getenv("GITHUB_REPO")
      ?: error("Missing github.repo")

    val username = project.findProperty("github.username")?.toString()
      ?: System.getenv("GITHUB_ACTOR")
      ?: error("Missing github.username")

    val token = project.findProperty("github.token")?.toString()
      ?: System.getenv("GITHUB_TOKEN")
      ?: error("Missing github.token")

    project.extensions.configure<PublishingExtension> {
      repositories {
        maven {
          name = "GitHubPackages"
          url = project.uri("https://maven.pkg.github.com/$owner/$repo")

          credentials {
            this.username = username
            this.password = token
          }
        }
      }
    }
  }
}
