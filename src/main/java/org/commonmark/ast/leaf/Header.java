package org.commonmark.ast.leaf;

import org.commonmark.ast.inline.IInlineContent;

abstract class Header extends InlineContentLeaf {
	public Header(final IInlineContent content){
		super(content);
	}
}
