package vscode

import seskar.js.JsRawValue

/**
 * Inlay hint kinds.
 *
 * The kind of an inline hint defines its appearance, e.g the corresponding foreground and background colors are being
 * used.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface InlayHintKind {
  companion object {
    /**
     * An inlay hint that for a type annotation.
     */
    @JsRawValue("1")
    val Type: InlayHintKind

    /**
     * An inlay hint that is for a parameter.
     */
    @JsRawValue("2")
    val Parameter: InlayHintKind
  }
}
