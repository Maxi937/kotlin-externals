package vscode

import seskar.js.JsRawValue

/**
 * Represents sources that can cause selection change events ([vscode.window.onDidChangeTextEditorSelection]).
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface TextEditorSelectionChangeKind {
  companion object {
    /**
     * Selection changed due to typing in the editor.
     */
    @JsRawValue("1")
    val Keyboard: TextEditorSelectionChangeKind

    /**
     * Selection change due to clicking in the editor.
     */
    @JsRawValue("2")
    val Mouse: TextEditorSelectionChangeKind

    /**
     * Selection changed because a command ran.
     */
    @JsRawValue("3")
    val Command: TextEditorSelectionChangeKind
  }
}
