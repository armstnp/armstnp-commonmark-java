package org.commonmark.ast.block.leaf;

import org.commonmark.ast.inline.InlineContainer;

public abstract class InlineContentLeaf extends LeafBlock {
	private final InlineContainer content;

	public InlineContentLeaf(final InlineContainer content){
		this.content = content;
	}

	public InlineContainer getContent(){
		return content;
	}
}
