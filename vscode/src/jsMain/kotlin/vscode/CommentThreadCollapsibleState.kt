package vscode

import js.JsInt

/**
 * Collapsible state of a [CommentThread]
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface CommentThreadCollapsibleState {
  companion object {
    /**
     * Determines an item is collapsed
     */
    @JsInt(0)
    val Collapsed: CommentThreadCollapsibleState

    /**
     * Determines an item is expanded
     */
    @JsInt(1)
    val Expanded: CommentThreadCollapsibleState
  }
}
