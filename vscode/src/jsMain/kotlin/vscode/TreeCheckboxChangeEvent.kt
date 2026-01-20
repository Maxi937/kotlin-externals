package vscode

import js.array.Tuple2
import js.array.ReadonlyArray

/**
 * An event describing the change in a tree item's checkbox state.
 */
external interface TreeCheckboxChangeEvent<T> {
  /**
   * The items that were checked or unchecked.
   */
  val items: ReadonlyArray<Tuple2<T, TreeItemCheckboxState>>
}
