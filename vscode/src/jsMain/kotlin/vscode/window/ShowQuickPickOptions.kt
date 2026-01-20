package vscode.window

import js.`true`
import vscode.QuickPickOptions

external interface ShowQuickPickOptions : QuickPickOptions {
  override var canPickMany: `true`?
}
