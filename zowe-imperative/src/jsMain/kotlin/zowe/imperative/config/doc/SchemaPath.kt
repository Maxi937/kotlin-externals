package zowe.imperative.config.doc

import js.plain.JsPlainObject

@JsPlainObject
external interface SchemaPath {
  var schema: String
  var updated: Boolean
}
