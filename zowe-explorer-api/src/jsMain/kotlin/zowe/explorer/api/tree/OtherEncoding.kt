package zowe.explorer.api.tree

import js.JsString
import ts.Readonly

external interface OtherEncoding : ZosEncoding {
  @JsString("other")
  @Readonly
  override var kind: String

  var codepage: String
}
