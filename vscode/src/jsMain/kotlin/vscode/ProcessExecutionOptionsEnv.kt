package vscode

external interface ProcessExecutionOptionsEnv {

  operator fun get(key: String): String?


  operator fun set(
    key: String,
    value: String?,
  )
}
