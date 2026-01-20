package vscode

import seskar.js.JsRawValue

/**
 * A type of mutation that can be applied to an environment variable.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface EnvironmentVariableMutatorType {
  companion object {
    /**
     * Replace the variable's existing value.
     */
    @JsRawValue("1")
    val Replace: EnvironmentVariableMutatorType

    /**
     * Append to the end of the variable's existing value.
     */
    @JsRawValue("2")
    val Append: EnvironmentVariableMutatorType

    /**
     * Prepend to the start of the variable's existing value.
     */
    @JsRawValue("3")
    val Prepend: EnvironmentVariableMutatorType
  }
}
