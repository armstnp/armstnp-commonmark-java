package org.commonmark.ast.block.container;

import com.google.common.collect.ImmutableList;
import org.commonmark.ast.block.Block;

import java.util.List;
import java.util.function.Supplier;

public class BlockContainer{
	private final List<Block> innerBlocks;

	public BlockContainer(Supplier<? extends List<Block>> innerBlockListProvider){
		innerBlocks = innerBlockListProvider.get();
	}

	public void addInnerBlock(Block block){
		innerBlocks.add(block);
	}

	public ImmutableList<Block> getInnerBlocks(){
		return ImmutableList.copyOf(innerBlocks);
	}
}
