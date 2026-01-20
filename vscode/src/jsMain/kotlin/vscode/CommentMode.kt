package vscode

import js.JsInt

/**
 * Comment mode of a [Comment]
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface CommentMode {
  companion object {
    /**
     * Displays the comment editor
     */
    @JsInt(0)
    val Editing: CommentMode

    /**
     * Displays the preview of the comment
     */
    @JsInt(1)
    val Preview: CommentMode
  }
}
