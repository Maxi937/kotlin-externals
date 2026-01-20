package zowe.imperative.config.api

import js.plain.JsPlainObject

@JsPlainObject
external interface ConfigLayersWriteOpts {
  var user: Boolean
  var global: Boolean
}
