package org.commonmark.ast.inline;

public abstract class InlineContainer {
	private InlineContent content;

	public InlineContainer(final InlineContent content){
		this.content = content;
	}

	public InlineContent getInlineContent(){
		return content;
	}

	public void rewriteContent(InlineContent content){
		this.content = content;
	}
}
