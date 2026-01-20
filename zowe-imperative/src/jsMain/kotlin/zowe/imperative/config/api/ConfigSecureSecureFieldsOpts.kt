package zowe.imperative.config.api

import js.plain.JsPlainObject

@JsPlainObject
external interface ConfigSecureSecureFieldsOpts {
  var user: Boolean
  var global: Boolean
}
