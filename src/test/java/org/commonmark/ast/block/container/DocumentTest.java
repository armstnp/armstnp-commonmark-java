package org.commonmark.ast.block.container;

import org.commonmark.ast.block.Block;
import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class DocumentTest{
	private static final Supplier<Block> blockSupplier = () -> new Block(){};

	private Document document;

	@org.junit.Before
	public void setUp() throws Exception{
		document = new Document(ArrayList::new);
	}

	@Test
	public void isInitiallyEmpty(){
		assertThat(document.getInnerBlocks())
				.isNotNull()
				.isEmpty();
	}

	@Test
	public void canAddBlocks(){
		Block[] blocks = { blockSupplier.get(), blockSupplier.get(), blockSupplier.get() };
		Stream.of(blocks).forEach(document::addInnerBlock);
		assertThat(document.getInnerBlocks())
				.containsExactly(blocks);
	}
}