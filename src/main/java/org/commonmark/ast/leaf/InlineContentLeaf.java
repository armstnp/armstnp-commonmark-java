package org.commonmark.ast.leaf;

import org.commonmark.ast.inline.IInlineContent;

abstract class InlineContentLeaf{
	private final IInlineContent content;

	public InlineContentLeaf(final IInlineContent content){
		this.content = content;
	}

	public IInlineContent getContent(){
		return content;
	}
}
