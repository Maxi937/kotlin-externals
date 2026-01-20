@file:JsModule("@zowe/imperative")

package zowe.imperative.cmd.help

import js.JsString
import zowe.imperative.cmd.doc.*
import zowe.imperative.cmd.help.abstract.*
import zowe.imperative.cmd.help.doc.*

/**
 * Imperative default help generator. Accepts the command definitions and constructs the full help
 * text for the command node.
 *
 * TODO - Consider removing word wrap on a fixed with and apply dynamically based on terminal sizes
 */
external class DefaultHelpGenerator : AbstractHelpGenerator {
  /**
   * Creates an instance of DefaultHelpGenerator.
   *
   * @param defaultParms Imperative config parameters for help
   *   generation - See interface for details
   * @param commandParms The command definitions for generating help - See
   *   interface for details
   */
  constructor(defaultParms: IHelpGeneratorFactoryParms, commandParms: IHelpGeneratorParms)

  /**
   * Construct the full help text for display.
   *
   * @return The full help text
   */
  override fun buildHelp(): String

  /**
   * Build the help text for a "group" - a group has a set of children The help text contains the
   * standard description/usage/etc., but unlike a command only displays the next set of "commands"
   * or "groups" that can be issued after the current node.
   *
   * @return the full group help text
   */
  fun buildFullGroupHelpText(): String

  /**
   * Returns the help text for the command definition - the help text contains the standard items
   * such as description/usage/etc. and also contains the full option descriptions for the command.
   *
   * @param includeGlobalOptions Include the global options in the help text
   * @return The help text for --help or markdown.
   */
  override fun buildFullCommandHelpText(includeGlobalOptions: Boolean): String

  /**
   * Returns the help text for the command definition - the help text contains the standard items
   * such as description/usage/etc. and also contains the full option descriptions for the command.
   *
   * @return The help text for --help or markdown.
   */
  // Note(Edoardo): this is an added overload as I can't specify a default value in this interface
  fun buildFullCommandHelpText(): String

  /**
   * Build a string containing the command name and aliases separated by the vertical bar:
   * command | c
   *
   * @param commandDefinition The definition for the command
   * @return Contains the command name followed by the aliases (e.g. command | c)
   */
  fun buildCommandAndAliases(commandDefinition: ICommandDefinition): String

  /**
   * Builds a table of commands/groups for display in the help:
   *
   * GROUPS
   * ------
   * group1 hello this is group1 group2 hello this is group2
   *
   * @return Returns the table for display.
   */
  fun buildChildrenSummaryTables(): String

  /**
   * Build the usage diagram for the command.
   *
   * TODO - very simple at the moment, should be enhanced with a "better" diagram
   */
  fun buildUsageDiagram(): String

  /**
   * Build the usage section of the help text:
   *
   * USAGE
   * -----
   * command blah [options]
   *
   * @return The usage help text section
   */
  fun buildUsageSection(): String

  /**
   * Build the global options section of the command help text.
   *
   * GLOBAL OPTIONS
   * --------------
   * ...
   *
   * @return The global options help text section
   */
  fun buildGlobalOptionsSection(): String

  /**
   * Build the command description section of the help text:
   *
   * DESCRIPTION
   * -----------
   * This command is great.
   *
   * @return The command description text
   */
  fun buildDescriptionSection(): String

  /**
   * Return the help text format for positional parameters - includes the parameter itself, the
   * optional regex, and the full description.
   *
   * @return The help text for each positional parameter.
   */
  fun buildPositionalArgumentsSection(): String

  /**
   * From the map of options (group to option), formulate the group and options in the form of:
   *
   * OPTION GROUP
   * ------------
   * option1
   *
   * Description of option1
   *
   * option2
   *
   * Description of option2
   */
  fun buildCommandOptionsSection(): String

  /**
   * Build the text for option:
   *
   * --option
   *
   * The description for this option
   *
   * @param optionString The option string (-- form or positional, etc.)
   * @param description The description for the option
   * @return The option text
   */
  fun buildOptionText(
    optionString: String,
    description: String,
  ): String

  /**
   * Produces a header for the current section in help:
   *
   * COMMANDS
   * --------
   * @param header the header text (e.g. COMMANDS)
   * @return The header
   */
  fun buildHeader(header: String): String

  /**
   * Build the examples text for the command. Examples include the command example (which normally
   * is able to be copy/pasted verbatim) and the description for the example.
   *
   * TODO - we should remove wordwrap from this
   *
   * @return The example text
   */
  fun buildExamplesSection(): String

  /**
   * Get a blurb explaining experimental commands if this command is experimental
   *
   * @return If this command is experimental, returns the experimental command
   *   explanation block
   */
  fun getExperimentalCommandSection(): String

  companion object {
    /**
     * The help indent for spacing/alignment
     */
    @JsString("   ")
    val HELP_INDENT: String
  }
}
