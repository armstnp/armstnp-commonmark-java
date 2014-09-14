package org.commonmark.ast.block.container;

import org.commonmark.ast.block.Block;
import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

public class BlockQuoteTest{
	private static final Supplier<Block> blockSupplier = () -> new Block(){};

	private BlockQuote blockQuote;

	@org.junit.Before
	public void setUp() throws Exception{
		blockQuote = new BlockQuote(ArrayList::new);
	}

	@Test
	public void isInitiallyEmpty(){
		assertThat(blockQuote.getInnerBlocks())
				.isNotNull()
				.isEmpty();
	}

	@Test
	public void canAddBlocks(){
		Block[] blocks = { blockSupplier.get(), blockSupplier.get(), blockSupplier.get() };
		Stream.of(blocks).forEach(blockQuote::addInnerBlock);
		assertThat(blockQuote.getInnerBlocks())
				.containsExactly(blocks);
	}
}