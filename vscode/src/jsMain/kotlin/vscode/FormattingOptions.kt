package vscode

import ts.Union3

/**
 * Value-object describing what options formatting should use.
 */
external interface FormattingOptions {
  /**
   * Size of a tab in spaces.
   */
  var tabSize: Int

  /**
   * Prefer spaces over tabs.
   */
  var insertSpaces: Boolean

  /**
   * Signature for further properties.
   */

  operator fun get(key: String): Union3<Boolean, Number, String>? // boolean | number | string
  
  operator fun set(key: String, value: Union3<Boolean, Number, String>? /* boolean | number | string */)
}
