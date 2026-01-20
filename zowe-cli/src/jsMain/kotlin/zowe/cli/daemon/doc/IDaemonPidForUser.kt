package zowe.cli.daemon.doc

import js.plain.JsPlainObject

/**
 * Represents the content of the JSON file into which the Zowe Daemon
 * stores the process ID for a given user.
 */
@JsPlainObject
external interface IDaemonPidForUser {
  var user: String
  var pid: Int
}
