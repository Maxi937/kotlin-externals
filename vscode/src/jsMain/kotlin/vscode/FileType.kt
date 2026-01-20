package vscode

import seskar.js.JsRawValue

/**
 * Enumeration of file types. The types `File` and `Directory` can also be
 * a symbolic links, in that case use `FileType.File | FileType.SymbolicLink` and
 * `FileType.Directory | FileType.SymbolicLink`.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface FileType {
  companion object {
    /**
     * The file type is unknown.
     */
    @JsRawValue("0")
    val Unknown: FileType

    /**
     * A regular file.
     */
    @JsRawValue("1")
    val File: FileType

    /**
     * A directory.
     */
    @JsRawValue("2")
    val Directory: FileType

    /**
     * A symbolic link to a file.
     */
    @JsRawValue("64")
    val SymbolicLink: FileType
  }
}
