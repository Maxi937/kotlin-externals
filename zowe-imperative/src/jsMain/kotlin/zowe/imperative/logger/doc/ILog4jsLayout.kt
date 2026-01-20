package zowe.imperative.logger.doc

import js.plain.JsPlainObject

@JsPlainObject
external interface ILog4jsLayout {
  var type: String
  var pattern: String
}
