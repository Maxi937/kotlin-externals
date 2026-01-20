package vscode


import js.JsInt


/**
 * Represents a color theme kind.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface ColorThemeKind {
  companion object {
    /**
     * A light color theme.
     */
    @JsInt(1)
    val Light: ColorThemeKind

    /**
     * A dark color theme.
     */
    @JsInt(2)
    val Dark: ColorThemeKind

    /**
     * A dark high contrast color theme.
     */
    @JsInt(3)
    val HighContrast: ColorThemeKind

    /**
     * A light high contrast color theme.
     */
    @JsInt(4)
    val HighContrastLight: ColorThemeKind
  }
}
