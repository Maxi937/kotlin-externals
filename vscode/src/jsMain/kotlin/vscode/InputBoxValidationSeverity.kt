package vscode

import seskar.js.JsRawValue

/**
 * The severity level for input box validation.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface InputBoxValidationSeverity {
  companion object {
    /**
     * Informational severity level.
     */
    @JsRawValue("1")
    val Info: InputBoxValidationSeverity

    /**
     * Warning severity level.
     */
    @JsRawValue("2")
    val Warning: InputBoxValidationSeverity

    /**
     * Error severity level.
     */
    @JsRawValue("3")
    val Error: InputBoxValidationSeverity
  }
}
