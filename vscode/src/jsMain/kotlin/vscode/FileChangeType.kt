package vscode

import seskar.js.JsRawValue

/**
 * Enumeration of file change types.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface FileChangeType {
  companion object {
    /**
     * The contents or metadata of a file have changed.
     */
    @JsRawValue("1")
    val Changed: FileChangeType

    /**
     * A file has been created.
     */
    @JsRawValue("2")
    val Created: FileChangeType

    /**
     * A file has been deleted.
     */
    @JsRawValue("3")
    val Deleted: FileChangeType
  }
}
