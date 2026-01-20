package vscode

import seskar.js.JsRawValue

/**
 * Terminal exit reason kind.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface TerminalExitReason {
  companion object {
    /**
     * Unknown reason.
     */
    @JsRawValue("0")
    val Unknown: TerminalExitReason

    /**
     * The window closed/reloaded.
     */
    @JsRawValue("1")
    val Shutdown: TerminalExitReason

    /**
     * The shell process exited.
     */
    @JsRawValue("2")
    val Process: TerminalExitReason

    /**
     * The user closed the terminal.
     */
    @JsRawValue("3")
    val User: TerminalExitReason

    /**
     * An extension disposed the terminal.
     */
    @JsRawValue("4")
    val Extension: TerminalExitReason
  }
}
