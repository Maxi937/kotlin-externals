enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
  @Suppress("UnstableApiUsage")
  repositories {
    mavenCentral()
  }

  versionCatalogs {
    create("kotlinWrappers") {
      val wrappersVersion = "2025.7.11"
      from("org.jetbrains.kotlin-wrappers:kotlin-wrappers-catalog:$wrappersVersion")
    }
  }
}

rootProject.name = "kotlin-externals"

include("common")

include("vscode")
include("vscode-test-electron")
include("vscode-extension-tester")

// Examples
include("vscode-extension")

project(":vscode-extension").projectDir = file("examples/vscode-extension")
