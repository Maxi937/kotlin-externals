package vscode

import js.JsInt

/**
 * Represents the type of user feedback received.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface ChatResultFeedbackKind {
  companion object {
    /**
     * The user marked the result as unhelpful.
     */
    @JsInt(0)
    val Unhelpful: ChatResultFeedbackKind

    /**
     * The user marked the result as helpful.
     */
    @JsInt(1)
    val Helpful: ChatResultFeedbackKind
  }
}
