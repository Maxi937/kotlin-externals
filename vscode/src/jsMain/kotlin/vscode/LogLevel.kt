package vscode

import seskar.js.JsRawValue

/**
 * Log levels
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface LogLevel {
  companion object {
    /**
     * No messages are logged with this level.
     */
    @JsRawValue("0")
    val Off: LogLevel

    /**
     * All messages are logged with this level.
     */
    @JsRawValue("1")
    val Trace: LogLevel

    /**
     * Messages with debug and higher log level are logged with this level.
     */
    @JsRawValue("2")
    val Debug: LogLevel

    /**
     * Messages with info and higher log level are logged with this level.
     */
    @JsRawValue("3")
    val Info: LogLevel

    /**
     * Messages with warning and higher log level are logged with this level.
     */
    @JsRawValue("4")
    val Warning: LogLevel

    /**
     * Only error messages are logged with this level.
     */
    @JsRawValue("5")
    val Error: LogLevel
  }
}
