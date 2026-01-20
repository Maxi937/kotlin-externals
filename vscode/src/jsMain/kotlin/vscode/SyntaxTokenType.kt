package vscode

import seskar.js.JsRawValue

/**
 * Enumeration of commonly encountered syntax token types.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface SyntaxTokenType {
  companion object {
    /**
     * Everything except tokens that are part of comments, string literals and regular expressions.
     */
    @JsRawValue("0")
    val Other: SyntaxTokenType

    /**
     * A comment.
     */
    @JsRawValue("1")
    val Comment: SyntaxTokenType

    /**
     * A string literal.
     */
    @JsRawValue("2")
    val String: SyntaxTokenType

    /**
     * A regular expression.
     */
    @JsRawValue("3")
    val RegEx: SyntaxTokenType
  }
}
