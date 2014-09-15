package org.commonmark.ast.block.leaf;

public class InfoCodeBlock extends FencedCodeBlock {
	private final String info;

	public InfoCodeBlock(final String content, final String fence, final String info){
		super(content, fence);

		this.info = info;
	}

	public String getInfo(){
		return info;
	}
}
