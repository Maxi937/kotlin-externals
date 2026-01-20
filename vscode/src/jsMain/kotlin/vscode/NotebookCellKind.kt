package vscode

import seskar.js.JsRawValue

/**
 * A notebook cell kind.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface NotebookCellKind {
  companion object {
    /**
     * A markup-cell is formatted source that is used for display.
     */
    @JsRawValue("1")
    val Markup: NotebookCellKind

    /**
     * A code-cell is source that can be executed ([NotebookController]) and that
     * produces output ([NotebookCellOutput]).
     */
    @JsRawValue("2")
    val Code: NotebookCellKind
  }
}
