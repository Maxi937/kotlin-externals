package vscode

import seskar.js.JsRawValue

/**
 * A document highlight kind.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface DocumentHighlightKind {
  companion object {
    /**
     * A textual occurrence.
     */
    @JsRawValue("0")
    val Text: DocumentHighlightKind

    /**
     * Read-access of a symbol, like reading a variable.
     */
    @JsRawValue("1")
    val Read: DocumentHighlightKind

    /**
     * Write-access of a symbol, like writing to a variable.
     */
    @JsRawValue("2")
    val Write: DocumentHighlightKind
  }
}
