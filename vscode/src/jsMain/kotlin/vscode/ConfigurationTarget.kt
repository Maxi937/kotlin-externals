package vscode

import js.JsInt
import seskar.js.JsRawValue

/**
 * The configuration target
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface ConfigurationTarget {
  companion object {
    /**
     * Global configuration
     */
    @JsRawValue("1")
    val Global: ConfigurationTarget

    /**
     * Workspace configuration
     */
    @JsRawValue("2")
    val Workspace: ConfigurationTarget

    /**
     * Workspace folder configuration
     */
    @JsRawValue("3")
    val WorkspaceFolder: ConfigurationTarget
  }
}
