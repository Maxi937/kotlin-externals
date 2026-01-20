package vscode

import seskar.js.JsRawValue

/**
 * The kind of executions that [TestRunProfile]s control.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface TestRunProfileKind {
  companion object {
    /**
     * The `Run` test profile kind.
     */
    @JsRawValue("1")
    val Run: TestRunProfileKind

    /**
     * The `Debug` test profile kind.
     */
    @JsRawValue("2")
    val Debug: TestRunProfileKind

    /**
     * The `Coverage` test profile kind.
     */
    @JsRawValue("3")
    val Coverage: TestRunProfileKind
  }
}
