package vscode

import seskar.js.JsRawValue

/**
 * A location in the editor at which progress information can be shown. It depends on the
 * location how progress is visually represented.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface ProgressLocation {
  companion object {
    /**
     * Show progress for the source control viewlet, as overlay for the icon and as progress bar
     * inside the viewlet (when visible). Neither supports cancellation nor discrete progress nor
     * a label to describe the operation.
     */
    @JsRawValue("1")
    val SourceControl: ProgressLocation

    /**
     * Show progress in the status bar of the editor. Neither supports cancellation nor discrete progress.
     * Supports rendering of [ThemeIcon] via the `$(<name>)`-syntax in the progress label.
     */
    @JsRawValue("10")
    val Window: ProgressLocation

    /**
     * Show progress as notification with an optional cancel button. Supports to show infinite and discrete
     * progress but does not support rendering of icons.
     */
    @JsRawValue("15")
    val Notification: ProgressLocation
  }
}
