package org.commonmark.ast.block.leaf;

public abstract class StringContentLeaf extends LeafBlock{
	private String content;

	public StringContentLeaf(final String content){ this.content = content; }

	public String getContent(){
		return content;
	}

	public void appendContent(final String content){ this.content += content; }
}
