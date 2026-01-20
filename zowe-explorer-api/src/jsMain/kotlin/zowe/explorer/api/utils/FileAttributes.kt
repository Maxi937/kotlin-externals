package zowe.explorer.api.utils

import js.plain.JsPlainObject

@JsPlainObject
external interface FileAttributes {
  var gid: Int
  var group: String
  var owner: String
  var uid: Int
  var perms: String
  var tag: String?
}
