package zowe.sdk.core.apiml.doc

import js.plain.JsPlainObject

@JsPlainObject
external interface IApimlServiceAuthentication {
  var scheme: String
  var applid: String
  var supportsSso: Boolean
}
