package vscode

import seskar.js.JsRawValue

/**
 * Represents the alignment of status bar items.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface NotebookCellStatusBarAlignment {
  companion object {
    /**
     * Aligned to the left side.
     */
    @JsRawValue("1")
    val Left: NotebookCellStatusBarAlignment

    /**
     * Aligned to the right side.
     */
    @JsRawValue("2")
    val Right: NotebookCellStatusBarAlignment
  }
}
