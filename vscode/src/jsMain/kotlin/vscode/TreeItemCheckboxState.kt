package vscode

import seskar.js.JsRawValue

/**
 * Checkbox state of the tree item
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface TreeItemCheckboxState {
  companion object {
    /**
     * Determines an item is unchecked
     */
    @JsRawValue("0")
    val Unchecked: TreeItemCheckboxState

    /**
     * Determines an item is checked
     */
    @JsRawValue("1")
    val Checked: TreeItemCheckboxState
  }
}
