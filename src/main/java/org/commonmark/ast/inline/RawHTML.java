package org.commonmark.ast.inline;

public class RawHTML implements InlineContent{
	private String html;

	public RawHTML(final String html){
		this.html = html;
	}

	public void concat(String html){
		this.html += html;
	}

	public String getHTML(){
		return html;
	}
}
