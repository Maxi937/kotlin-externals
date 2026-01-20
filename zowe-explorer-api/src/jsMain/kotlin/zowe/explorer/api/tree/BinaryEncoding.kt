package zowe.explorer.api.tree

import js.JsString
import ts.Readonly

external interface BinaryEncoding : ZosEncoding {
  @JsString("binary")
  @Readonly
  override var kind: String
}
