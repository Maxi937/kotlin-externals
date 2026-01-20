package zowe.imperative.config.doc

import js.plain.JsPlainObject

@JsPlainObject
external interface IConfigUpdateSchemaPaths {
  @seskar.js.JsNative
  operator fun get(key: String): SchemaPath?

  @seskar.js.JsNative
  operator fun set(
    key: String,
    value: SchemaPath?,
  )
}
