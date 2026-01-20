package zowe.imperative.config.doc

import js.plain.JsPlainObject

@JsPlainObject
external interface ProfileType {
  var from: Array<String>
  var version: String?
  var latestFrom: String?
}
