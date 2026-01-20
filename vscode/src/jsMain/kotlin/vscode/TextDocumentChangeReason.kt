package vscode

import seskar.js.JsRawValue

/**
 * Reasons for why a text document has changed.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface TextDocumentChangeReason {
  companion object {
    /** The text change is caused by an undo operation. */
    @JsRawValue("1")
    val Undo: TextDocumentChangeReason

    /** The text change is caused by an redo operation. */
    @JsRawValue("2")
    val Redo: TextDocumentChangeReason
  }
}
