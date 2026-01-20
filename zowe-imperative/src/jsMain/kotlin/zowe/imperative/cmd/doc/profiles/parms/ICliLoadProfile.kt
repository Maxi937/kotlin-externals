package zowe.imperative.cmd.doc.profiles.parms

import zowe.imperative.profiles.doc.parms.ILoadProfile
import js.plain.JsPlainObject

/**
 * Profile Manager "loadProfile" input parameters. Indicates which profile to load (named or
 * default) and if not finding the profile should be considered and error, etc.
 */
@JsPlainObject
external interface ICliLoadProfile : ILoadProfile
