package vscode

import seskar.js.JsRawValue

/**
 * Notebook controller affinity for notebook documents.
 *
 * @see [NotebookController.updateNotebookAffinity]
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface NotebookControllerAffinity {
  companion object {
    /**
     * Default affinity.
     */
    @JsRawValue("1")
    val Default: NotebookControllerAffinity

    /**
     * A controller is preferred for a notebook.
     */
    @JsRawValue("2")
    val Preferred: NotebookControllerAffinity
  }
}
