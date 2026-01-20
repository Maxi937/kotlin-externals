package vscode

import seskar.js.JsRawValue

/**
 * How a [SignatureHelpProvider] was triggered.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface SignatureHelpTriggerKind {
  companion object {
    /**
     * Signature help was invoked manually by the user or by a command.
     */
    @JsRawValue("1")
    val Invoke: SignatureHelpTriggerKind

    /**
     * Signature help was triggered by a trigger character.
     */
    @JsRawValue("2")
    val TriggerCharacter: SignatureHelpTriggerKind

    /**
     * Signature help was triggered by the cursor moving or by the document content changing.
     */
    @JsRawValue("3")
    val ContentChange: SignatureHelpTriggerKind
  }
}
