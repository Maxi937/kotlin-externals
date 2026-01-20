package vscode

import seskar.js.JsRawValue

/**
 * Possible kinds of UI that can use extensions.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface UIKind {
  companion object {
    /**
     * Extensions are accessed from a desktop application.
     */
    @JsRawValue("1")
    val Desktop: UIKind

    /**
     * Extensions are accessed from a web browser.
     */
    @JsRawValue("2")
    val Web: UIKind
  }
}
