package vscode

import seskar.js.JsRawValue

/**
 * Represents reasons why a text document is saved.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface TextDocumentSaveReason {
  companion object {
    /**
     * Manually triggered, e.g. by the user pressing save, by starting debugging,
     * or by an API call.
     */
    @JsRawValue("1")
    val Manual: TextDocumentSaveReason

    /**
     * Automatic after a delay.
     */
    @JsRawValue("2")
    val AfterDelay: TextDocumentSaveReason

    /**
     * When the editor lost focus.
     */
    @JsRawValue("3")
    val FocusOut: TextDocumentSaveReason
  }
}
