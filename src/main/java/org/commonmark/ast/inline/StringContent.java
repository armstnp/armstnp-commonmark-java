package org.commonmark.ast.inline;

public class StringContent implements InlineContent{
	private String content;

	public StringContent(final String content){
		this.content = content;
	}

	public void concat(String text){
		content += text;
	}

	public String getContent(){
		return content;
	}
}
