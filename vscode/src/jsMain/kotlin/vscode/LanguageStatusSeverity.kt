package vscode

import seskar.js.JsRawValue

/**
 * Represents the severity level of a language status.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface LanguageStatusSeverity {
  companion object {
    /**
     * Informational severity level.
     */
    @JsRawValue("0")
    val Information: LanguageStatusSeverity

    /**
     * Warning severity level.
     */
    @JsRawValue("1")
    val Warning: LanguageStatusSeverity

    /**
     * Error severity level.
     */
    @JsRawValue("2")
    val Error: LanguageStatusSeverity
  }
}
