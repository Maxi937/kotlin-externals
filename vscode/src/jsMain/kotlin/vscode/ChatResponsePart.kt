package vscode

import ts.Union6

/**
 * Represents the different chat response types.
 */
typealias ChatResponsePart = Union6<ChatResponseMarkdownPart, ChatResponseFileTreePart, ChatResponseAnchorPart, ChatResponseProgressPart, ChatResponseReferencePart, ChatResponseCommandButtonPart>
