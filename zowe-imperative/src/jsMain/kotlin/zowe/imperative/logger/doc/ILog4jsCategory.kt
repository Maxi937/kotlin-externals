package zowe.imperative.logger.doc

import js.plain.JsPlainObject

@JsPlainObject
external interface ILog4jsCategory {
  var appenders: Array<String>
  var level: String
}
