package zowe.sdk.zos.files.methods.create

import js.plain.JsPlainObject

@JsPlainObject
external interface VSAM {
  var dsorg: String
  var alcunit: String
  var primary: Int
}
