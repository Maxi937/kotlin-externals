package vscode

import js.JsInt

/**
 * The state of a comment thread.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface CommentThreadState {
  companion object {
    /**
     * Unresolved thread state
     */
    @JsInt(0)
    val Unresolved: CommentThreadState

    /**
     * Resolved thread state
     */
    @JsInt(1)
    val Resolved: CommentThreadState
  }
}
