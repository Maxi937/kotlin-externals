package zowe.imperative.config

import js.plain.JsPlainObject

@JsPlainObject
external interface ConfigSearchOpts {
  var ignoreDirs: Array<String>?
  var startDir: String?
}
