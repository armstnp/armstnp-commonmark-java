package org.commonmark.ast.container;

import com.google.common.collect.ImmutableList;
import org.commonmark.ast.IBlock;

import java.util.List;
import java.util.function.Supplier;

abstract class ContainerBlock{
	protected final List<IBlock> innerBlocks;

	public ContainerBlock(Supplier<? extends List<IBlock>> innerBlockListProvider){
		innerBlocks = innerBlockListProvider.get();
	}

	public void addInnerBlock(IBlock block){
		innerBlocks.add(block);
	}

	public ImmutableList<IBlock> getInnerBlocks(){
		return ImmutableList.copyOf(innerBlocks);
	}
}
