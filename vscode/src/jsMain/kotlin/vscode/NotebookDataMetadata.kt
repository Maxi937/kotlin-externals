package vscode

external interface NotebookDataMetadata {

  operator fun get(key: String): Any?


  operator fun set(
    key: String,
    value: Any?,
  )
}
