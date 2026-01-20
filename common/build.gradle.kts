@file:OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)



plugins {
  kotlin("multiplatform")
  id("module.publishable")
}

version = "1.0.0"

kotlin {
//  @OptIn(ExperimentalKotlinGradlePluginApi::class)
//  compilerOptions {
//    apiVersion.set(KotlinVersion.KOTLIN_2_1)
//    languageVersion.set(KotlinVersion.KOTLIN_2_1)
//    freeCompilerArgs.add("-Xallow-kotlin-package")
//  }

  js {
    nodejs()
    browser()
  }

  wasmJs {
    nodejs()
    browser()
  }
}
