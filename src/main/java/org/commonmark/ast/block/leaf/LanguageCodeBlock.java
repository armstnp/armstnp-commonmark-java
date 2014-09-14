package org.commonmark.ast.block.leaf;

import org.commonmark.ast.inline.InlineContainer;

public class LanguageCodeBlock extends CodeBlock {
	private final String language;

	public LanguageCodeBlock(final InlineContainer content, final String language){
		super(content);

		this.language = language;
	}

	public String getLanguage(){
		return language;
	}
}
