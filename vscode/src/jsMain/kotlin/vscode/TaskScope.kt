package vscode

import seskar.js.JsRawValue

/**
 * The scope of a task.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface TaskScope {
  companion object {
    /**
     * The task is a global task. Global tasks are currently not supported.
     */
    @JsRawValue("1")
    val Global: TaskScope

    /**
     * The task is a workspace task
     */
    @JsRawValue("2")
    val Workspace: TaskScope
  }
}
