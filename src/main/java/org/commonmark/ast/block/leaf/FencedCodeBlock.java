package org.commonmark.ast.block.leaf;

public class FencedCodeBlock extends CodeBlock {
	private final String fence;

	public FencedCodeBlock(final String content, final String fence){
		super(content);

		this.fence = fence;
	}

	public boolean matchesFence(String otherFence){
		return fence.equals(otherFence);
	}
}
