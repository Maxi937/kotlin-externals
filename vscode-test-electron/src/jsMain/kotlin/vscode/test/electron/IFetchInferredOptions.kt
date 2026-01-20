package vscode.test.electron

import ts.Union

external interface IFetchInferredOptions : IFetchStableOptions {
  var extensionsDevelopmentPath: (Union<String, Array<String>> /* string | string[] */)?
}
