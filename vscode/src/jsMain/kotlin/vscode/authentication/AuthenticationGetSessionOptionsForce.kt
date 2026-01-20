package vscode.authentication

import js.`true`
import vscode.AuthenticationForceNewSessionOptions
import vscode.AuthenticationGetSessionOptions
import ts.Union

external interface AuthenticationGetSessionOptionsForce : AuthenticationGetSessionOptions {
  override var forceNewSession: Union<`true`, AuthenticationForceNewSessionOptions>? // true | AuthenticationForceNewSessionOptions
}
