package vscode

import js.JsInt


/**
 * The reason why code actions were requested.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface CodeActionTriggerKind {
  companion object {
    /**
     * Code actions were explicitly requested by the user or by an extension.
     */
    @JsInt(1)
    val Invoke: CodeActionTriggerKind

    /**
     * Code actions were requested automatically.
     *
     * This typically happens when current selection in a file changes, but can
     * also be triggered when file content changes.
     */
    @JsInt(2)
    val Automatic: CodeActionTriggerKind
  }
}
