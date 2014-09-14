package org.commonmark.ast.block.container;

import org.commonmark.ast.block.Block;
import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

public class BlockContainerTest{
	private static final Supplier<Block> blockSupplier = () -> new Block(){};

	private BlockContainer container;

	@org.junit.Before
	public void setUp() throws Exception{
		container = new BlockContainer(ArrayList::new);
	}

	@Test
	public void isInitiallyEmpty(){
		assertThat(container.getInnerBlocks())
				.isNotNull()
				.isEmpty();
	}

	@Test
	public void canAddBlocks(){
		Block[] blocks = { blockSupplier.get(), blockSupplier.get(), blockSupplier.get() };
		Stream.of(blocks).forEach(container::addInnerBlock);
		assertThat(container.getInnerBlocks())
				.containsExactly(blocks);
	}
}