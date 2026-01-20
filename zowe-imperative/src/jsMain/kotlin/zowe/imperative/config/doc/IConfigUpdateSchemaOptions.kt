package zowe.imperative.config.doc

import js.plain.JsPlainObject

@JsPlainObject
external interface IConfigUpdateSchemaOptions {
  var layer: IConfigUpdateSchemaOptionsLayer?
  var schema: IConfigSchema?
  var depth: Int?
}
