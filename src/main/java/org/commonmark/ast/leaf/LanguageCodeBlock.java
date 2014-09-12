package org.commonmark.ast.leaf;

import org.commonmark.ast.inline.IInlineContent;

public final class LanguageCodeBlock extends CodeBlock {
	private final String language;

	public LanguageCodeBlock(final IInlineContent content, final String language){
		super(content);

		this.language = language;
	}

	public String getLanguage(){
		return language;
	}
}
