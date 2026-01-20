package zowe.imperative.config

import js.plain.JsPlainObject

@JsPlainObject
external interface ConfigSetOpts {
  var parseString: Boolean?
  var secure: Boolean?
}
