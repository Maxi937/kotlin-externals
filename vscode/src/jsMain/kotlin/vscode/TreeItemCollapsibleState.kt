package vscode

import seskar.js.JsRawValue

/**
 * Collapsible state of the tree item
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface TreeItemCollapsibleState {
  companion object {
    /**
     * Determines an item can be neither collapsed nor expanded. Implies it has no children.
     */
    @JsRawValue("0")
    val None: TreeItemCollapsibleState

    /**
     * Determines an item is collapsed
     */
    @JsRawValue("1")
    val Collapsed: TreeItemCollapsibleState

    /**
     * Determines an item is expanded
     */
    @JsRawValue("2")
    val Expanded: TreeItemCollapsibleState
  }
}
