package vscode


import seskar.js.JsRawValue

/**
 * How a [CompletionItemProvider] was triggered
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface CompletionTriggerKind {
  companion object {
    /**
     * Completion was triggered normally.
     */
    @JsRawValue("0")
    val Invoke: CompletionTriggerKind

    /**
     * Completion was triggered by a trigger character.
     */
    @JsRawValue("1")
    val TriggerCharacter: CompletionTriggerKind

    /**
     * Completion was re-triggered as current completion list is incomplete
     */
    @JsRawValue("2")
    val TriggerForIncompleteCompletions: CompletionTriggerKind
  }
}
