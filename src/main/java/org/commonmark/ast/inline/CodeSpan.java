package org.commonmark.ast.inline;

public class CodeSpan implements InlineContent{
	private final String content;

	public CodeSpan(final String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}
}
