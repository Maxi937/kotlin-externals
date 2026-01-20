package zowe.imperative.config.api

import js.plain.JsPlainObject

@JsPlainObject
external interface ConfigLayersFindResult {
  var user: Boolean
  var global: Boolean
}
