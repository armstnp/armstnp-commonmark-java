package org.commonmark.ast.block.container;

import com.google.common.collect.ImmutableList;
import org.commonmark.ast.block.Block;

import java.util.List;
import java.util.function.Supplier;

public class ListItem{
	private final BlockContainer blockContainer;

	public ListItem(final Supplier<? extends List<Block>> innerBlockListProvider){
		blockContainer = new BlockContainer(innerBlockListProvider);
	}

	public void addInnerBlock(Block block){
		blockContainer.addInnerBlock(block);
	}

	public ImmutableList<Block> getInnerBlocks(){
		return blockContainer.getInnerBlocks();
	}
}
