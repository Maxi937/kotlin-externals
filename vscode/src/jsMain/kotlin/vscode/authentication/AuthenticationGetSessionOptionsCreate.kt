package vscode.authentication

import js.`true`
import vscode.AuthenticationGetSessionOptions

external interface AuthenticationGetSessionOptionsCreate : AuthenticationGetSessionOptions {
  override var createIfNone: `true`?
}
