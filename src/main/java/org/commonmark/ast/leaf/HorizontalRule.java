package org.commonmark.ast.leaf;

public final class HorizontalRule extends LeafBlock{
	private static final HorizontalRule instance = new HorizontalRule();

	public static HorizontalRule getInstance(){
		return instance;
	}

	private HorizontalRule(){ }
}
