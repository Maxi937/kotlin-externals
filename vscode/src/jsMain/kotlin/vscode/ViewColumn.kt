package vscode

import seskar.js.JsRawValue

/**
 * Denotes a location of an editor in the window. Editors can be arranged in a grid
 * and each column represents one editor location in that grid by counting the editors
 * in order of their appearance.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface ViewColumn {
  companion object {
    /**
     * A *symbolic* editor column representing the currently active column. This value
     * can be used when opening editors, but the *resolved* [TextEditor.viewColumn]-value
     * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Active`.
     */
    @JsRawValue("-1")
    val Active: ViewColumn

    /**
     * A *symbolic* editor column representing the column to the side of the active one. This value
     * can be used when opening editors, but the *resolved* [TextEditor.viewColumn]-value
     * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Beside`.
     */
    @JsRawValue("-2")
    val Beside: ViewColumn

    /**
     * The first editor column.
     */
    @JsRawValue("1")
    val One: ViewColumn

    /**
     * The second editor column.
     */
    @JsRawValue("2")
    val Two: ViewColumn

    /**
     * The third editor column.
     */
    @JsRawValue("3")
    val Three: ViewColumn

    /**
     * The fourth editor column.
     */
    @JsRawValue("4")
    val Four: ViewColumn

    /**
     * The fifth editor column.
     */
    @JsRawValue("5")
    val Five: ViewColumn

    /**
     * The sixth editor column.
     */
    @JsRawValue("6")
    val Six: ViewColumn

    /**
     * The seventh editor column.
     */
    @JsRawValue("7")
    val Seven: ViewColumn

    /**
     * The eighth editor column.
     */
    @JsRawValue("8")
    val Eight: ViewColumn

    /**
     * The ninth editor column.
     */
    @JsRawValue("9")
    val Nine: ViewColumn
  }
}
