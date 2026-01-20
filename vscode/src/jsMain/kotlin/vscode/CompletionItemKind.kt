package vscode

import js.JsInt

/**
 * Completion item kinds.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface CompletionItemKind {
  companion object {
    /**
     * The `Text` completion item kind.
     */
    @JsInt(0)
    val Text: CompletionItemKind

    /**
     * The `Method` completion item kind.
     */
    @JsInt(1)
    val Method: CompletionItemKind

    /**
     * The `Function` completion item kind.
     */
    @JsInt(2)
    val Function: CompletionItemKind

    /**
     * The `Constructor` completion item kind.
     */
    @JsInt(3)
    val Constructor: CompletionItemKind

    /**
     * The `Field` completion item kind.
     */
    @JsInt(4)
    val Field: CompletionItemKind

    /**
     * The `Variable` completion item kind.
     */
    @JsInt(5)
    val Variable: CompletionItemKind

    /**
     * The `Class` completion item kind.
     */
    @JsInt(6)
    val Class: CompletionItemKind

    /**
     * The `Interface` completion item kind.
     */
    @JsInt(7)
    val Interface: CompletionItemKind

    /**
     * The `Module` completion item kind.
     */
    @JsInt(8)
    val Module: CompletionItemKind

    /**
     * The `Property` completion item kind.
     */
    @JsInt(9)
    val Property: CompletionItemKind

    /**
     * The `Unit` completion item kind.
     */
    @JsInt(10)
    val Unit: CompletionItemKind

    /**
     * The `Value` completion item kind.
     */
    @JsInt(11)
    val Value: CompletionItemKind

    /**
     * The `Enum` completion item kind.
     */
    @JsInt(12)
    val Enum: CompletionItemKind

    /**
     * The `Keyword` completion item kind.
     */
    @JsInt(13)
    val Keyword: CompletionItemKind

    /**
     * The `Snippet` completion item kind.
     */
    @JsInt(14)
    val Snippet: CompletionItemKind

    /**
     * The `Color` completion item kind.
     */
    @JsInt(15)
    val Color: CompletionItemKind

    /**
     * The `Reference` completion item kind.
     */
    @JsInt(17)
    val Reference: CompletionItemKind

    /**
     * The `File` completion item kind.
     */
    @JsInt(16)
    val File: CompletionItemKind

    /**
     * The `Folder` completion item kind.
     */
    @JsInt(18)
    val Folder: CompletionItemKind

    /**
     * The `EnumMember` completion item kind.
     */
    @JsInt(19)
    val EnumMember: CompletionItemKind

    /**
     * The `Constant` completion item kind.
     */
    @JsInt(20)
    val Constant: CompletionItemKind

    /**
     * The `Struct` completion item kind.
     */
    @JsInt(21)
    val Struct: CompletionItemKind

    /**
     * The `Event` completion item kind.
     */
    @JsInt(22)
    val Event: CompletionItemKind

    /**
     * The `Operator` completion item kind.
     */
    @JsInt(23)
    val Operator: CompletionItemKind

    /**
     * The `TypeParameter` completion item kind.
     */
    @JsInt(24)
    val TypeParameter: CompletionItemKind

    /**
     * The `User` completion item kind.
     */
    @JsInt(25)
    val User: CompletionItemKind

    /**
     * The `Issue` completion item kind.
     */
    @JsInt(26)
    val Issue: CompletionItemKind
  }
}
