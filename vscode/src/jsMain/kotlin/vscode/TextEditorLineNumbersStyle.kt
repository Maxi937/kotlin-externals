package vscode

import seskar.js.JsRawValue

/**
 * Rendering style of the line numbers.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface TextEditorLineNumbersStyle {
  companion object {
    /**
     * Do not render the line numbers.
     */
    @JsRawValue("0")
    val Off: TextEditorLineNumbersStyle

    /**
     * Render the line numbers.
     */
    @JsRawValue("1")
    val On: TextEditorLineNumbersStyle

    /**
     * Render the line numbers with values relative to the primary cursor location.
     */
    @JsRawValue("2")
    val Relative: TextEditorLineNumbersStyle

    /**
     * Render the line numbers on every 10th line number.
     */
    @JsRawValue("3")
    val Interval: TextEditorLineNumbersStyle
  }
}
