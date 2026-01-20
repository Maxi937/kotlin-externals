package vscode

import seskar.js.JsRawValue

/**
 * A symbol kind.
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
sealed external interface SymbolKind {
  companion object {
    /**
     * The `File` symbol kind.
     */
    @JsRawValue("0")
    val File: SymbolKind

    /**
     * The `Module` symbol kind.
     */
    @JsRawValue("1")
    val Module: SymbolKind

    /**
     * The `Namespace` symbol kind.
     */
    @JsRawValue("2")
    val Namespace: SymbolKind

    /**
     * The `Package` symbol kind.
     */
    @JsRawValue("3")
    val Package: SymbolKind

    /**
     * The `Class` symbol kind.
     */
    @JsRawValue("4")
    val Class: SymbolKind

    /**
     * The `Method` symbol kind.
     */
    @JsRawValue("5")
    val Method: SymbolKind

    /**
     * The `Property` symbol kind.
     */
    @JsRawValue("6")
    val Property: SymbolKind

    /**
     * The `Field` symbol kind.
     */
    @JsRawValue("7")
    val Field: SymbolKind

    /**
     * The `Constructor` symbol kind.
     */
    @JsRawValue("8")
    val Constructor: SymbolKind

    /**
     * The `Enum` symbol kind.
     */
    @JsRawValue("9")
    val Enum: SymbolKind

    /**
     * The `Interface` symbol kind.
     */
    @JsRawValue("10")
    val Interface: SymbolKind

    /**
     * The `Function` symbol kind.
     */
    @JsRawValue("11")
    val Function: SymbolKind

    /**
     * The `Variable` symbol kind.
     */
    @JsRawValue("12")
    val Variable: SymbolKind

    /**
     * The `Constant` symbol kind.
     */
    @JsRawValue("13")
    val Constant: SymbolKind

    /**
     * The `String` symbol kind.
     */
    @JsRawValue("14")
    val String: SymbolKind

    /**
     * The `Number` symbol kind.
     */
    @JsRawValue("15")
    val Number: SymbolKind

    /**
     * The `Boolean` symbol kind.
     */
    @JsRawValue("16")
    val Boolean: SymbolKind

    /**
     * The `Array` symbol kind.
     */
    @JsRawValue("17")
    val Array: SymbolKind

    /**
     * The `Object` symbol kind.
     */
    @JsRawValue("18")
    val Object: SymbolKind

    /**
     * The `Key` symbol kind.
     */
    @JsRawValue("19")
    val Key: SymbolKind

    /**
     * The `Null` symbol kind.
     */
    @JsRawValue("20")
    val Null: SymbolKind

    /**
     * The `EnumMember` symbol kind.
     */
    @JsRawValue("21")
    val EnumMember: SymbolKind

    /**
     * The `Struct` symbol kind.
     */
    @JsRawValue("22")
    val Struct: SymbolKind

    /**
     * The `Event` symbol kind.
     */
    @JsRawValue("23")
    val Event: SymbolKind

    /**
     * The `Operator` symbol kind.
     */
    @JsRawValue("24")
    val Operator: SymbolKind

    /**
     * The `TypeParameter` symbol kind.
     */
    @JsRawValue("25")
    val TypeParameter: SymbolKind
  }
}
