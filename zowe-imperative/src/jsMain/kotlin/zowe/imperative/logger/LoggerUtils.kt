@file:JsModule("@zowe/imperative")

package zowe.imperative.logger

import js.JsString
import zowe.imperative.cmd.doc.args.*
import zowe.imperative.cmd.doc.profiles.definition.*
import zowe.imperative.profiles.doc.definition.*

external class LoggerUtils {
  companion object {
    @JsString("****")
    val CENSOR_RESPONSE: String

    /**
     * NOTE(Kelosky): Ideally we might have a consolidated list for secure fields, but for now we'll
     * just make sure they're collocated within the same class.
     */
    var CENSORED_OPTIONS: Array<String>
    var SECURE_PROMPT_OPTIONS: Array<String>

    /**
     * Copy and censor any sensitive CLI arguments before logging/printing
     */
    fun censorCLIArgs(args: Array<String>): Array<String>

    /**
     * Copy and censor a yargs argument object before logging
     *
     * @param args the args to censor
     * @return a censored copy of the arguments
     */
    fun censorYargsArguments(args: ICommandArguments): ICommandArguments

    val profileSchemas: Array<ICommandProfileTypeConfiguration>

    fun setProfileSchemas(_schemas: Map<String, IProfileSchema>)

    /**
     * Specifies whether a given property path (e.g. "profiles.lpar1.properties.host") is a special
     * value or not. Special value: Refers to any value defined as secure in the schema definition.
     * These values should be already masked by the application (and/or plugin) developer.
     *
     * @param prop Property path to determine if it is a special value
     * @return True - if the given property is to be treated as a special value; False - otherwise
     */
    var isSpecialValue: (prop: String) -> Boolean

    /**
     * Copy and censor any sensitive CLI arguments before logging/printing
     */
    fun censorRawData(
      data: String,
      category: String = definedExternally,
    ): String
  }
}
