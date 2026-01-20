package vscode.test.electron

import seskar.js.JsValue


sealed external interface Platform {
  companion object {
    @JsValue("darwin")
    val darwin: Platform

    @JsValue("darwin-arm64")
    val darwinArm64: Platform

    @JsValue("win32-x64-archive")
    val win32X64Archive: Platform

    @JsValue("win32-arm64-archive")
    val win32Arm64Archive: Platform

    @JsValue("linux-x64")
    val linuxX64: Platform

    @JsValue("linux-arm64")
    val linuxArm64: Platform

    @JsValue("linux-armhf")
    val linuxArmhf: Platform
  }
}
