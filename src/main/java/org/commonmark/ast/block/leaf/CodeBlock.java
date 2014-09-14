package org.commonmark.ast.block.leaf;

import org.commonmark.ast.inline.InlineContainer;

public abstract class CodeBlock extends InlineContentLeaf {
	public CodeBlock(final InlineContainer content){ super(content); }
}
