package zowe.explorer.api.tree

import js.JsString
import ts.Readonly

external interface TextEncoding : ZosEncoding {
  @JsString("text")
  @Readonly
  override var kind: String
}
