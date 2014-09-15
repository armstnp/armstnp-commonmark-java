package org.commonmark.ast.inline;

public class Unparsed implements InlineContent{
	private String text;

	public Unparsed(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}
}
