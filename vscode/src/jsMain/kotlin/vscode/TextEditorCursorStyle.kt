package vscode

import seskar.js.JsRawValue

/**
 * Rendering style of the cursor.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface TextEditorCursorStyle {
  companion object {
    /**
     * Render the cursor as a vertical thick line.
     */
    @JsRawValue("1")
    val Line: TextEditorCursorStyle

    /**
     * Render the cursor as a block filled.
     */
    @JsRawValue("2")
    val Block: TextEditorCursorStyle

    /**
     * Render the cursor as a thick horizontal line.
     */
    @JsRawValue("3")
    val Underline: TextEditorCursorStyle

    /**
     * Render the cursor as a vertical thin line.
     */
    @JsRawValue("4")
    val LineThin: TextEditorCursorStyle

    /**
     * Render the cursor as a block outlined.
     */
    @JsRawValue("5")
    val BlockOutline: TextEditorCursorStyle

    /**
     * Render the cursor as a thin horizontal line.
     */
    @JsRawValue("6")
    val UnderlineThin: TextEditorCursorStyle
  }
}
