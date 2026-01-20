package zowe.imperative.logger.doc

import js.plain.JsPlainObject

@JsPlainObject
external interface IQueuedMessage {
  var category: String
  var method: String
  var message: String
}
