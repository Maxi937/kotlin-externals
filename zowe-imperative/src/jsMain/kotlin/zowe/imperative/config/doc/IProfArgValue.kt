package zowe.imperative.config.doc

import js.objects.Object
import ts.Union5

/**
 * The value for the argument
 */
typealias IProfArgValue = Union5<String, Number, Boolean, Array<String>, Object> // string | number | boolean | string[] | object
