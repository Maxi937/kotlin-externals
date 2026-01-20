package vscode

import seskar.js.JsRawValue

/**
 * Represents different positions for rendering a decoration in an overview ruler ([DecorationRenderOptions.overviewRulerLane]).
 * The overview ruler supports three lanes.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface OverviewRulerLane {
  companion object {
    /**
     * The left lane of the overview ruler.
     */
    @JsRawValue("1")
    val Left: OverviewRulerLane

    /**
     * The center lane of the overview ruler.
     */
    @JsRawValue("2")
    val Center: OverviewRulerLane

    /**
     * The right lane of the overview ruler.
     */
    @JsRawValue("4")
    val Right: OverviewRulerLane

    /**
     * All lanes of the overview ruler.
     */
    @JsRawValue("7")
    val Full: OverviewRulerLane
  }
}
