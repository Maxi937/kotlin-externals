package vscode

import ts.Union4

typealias ConfigurationScope = Union4<Uri, TextDocument, WorkspaceFolder, Scope>
