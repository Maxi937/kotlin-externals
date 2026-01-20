package vscode

import seskar.js.JsRawValue

/**
 * The kind of [QuickPickItem].
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface QuickPickItemKind {
  companion object {
    /**
     * When a [QuickPickItem] has a kind of [Separator], the item is just a visual separator and does not represent a real item.
     * The only property that applies is [QuickPickItem.label]. All other properties on [QuickPickItem] will be ignored and have no effect.
     */
    @JsRawValue("-1")
    val Separator: QuickPickItemKind

    /**
     * The default [QuickPickItem.kind] is an item that can be selected in the quick pick.
     */
    @JsRawValue("0")
    val Default: QuickPickItemKind
  }
}
