package org.commonmark.ast.block.leaf;

import org.commonmark.ast.inline.InlineContainer;

public abstract class Header extends InlineContentLeaf {
	public Header(final InlineContainer content){
		super(content);
	}
}
