package vscode

import seskar.js.JsRawValue

/**
 * Represents the severity of diagnostics.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface DiagnosticSeverity {
  companion object {
    /**
     * Something not allowed by the rules of a language or other means.
     */
    @JsRawValue("0")
    val Error: DiagnosticSeverity

    /**
     * Something suspicious but allowed.
     */
    @JsRawValue("1")
    val Warning: DiagnosticSeverity

    /**
     * Something to inform about but not a problem.
     */
    @JsRawValue("2")
    val Information: DiagnosticSeverity

    /**
     * Something to hint to a better way of doing it, like proposing
     * a refactoring.
     */
    @JsRawValue("3")
    val Hint: DiagnosticSeverity
  }
}
