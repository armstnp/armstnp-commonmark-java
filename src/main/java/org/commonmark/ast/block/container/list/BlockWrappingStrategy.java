package org.commonmark.ast.block.container.list;

import org.commonmark.ast.block.Block;

// Used to manage tight vs. loose lists.
public interface BlockWrappingStrategy{
	default Block wrapBlock(Block block){ return block; }
	default BlockWrappingStrategy loosen(){ return this; };
}
