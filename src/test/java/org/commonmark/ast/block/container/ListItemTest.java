package org.commonmark.ast.block.container;

import org.commonmark.ast.block.Block;
import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

public class ListItemTest{
	private static final Supplier<Block> blockSupplier = () -> new Block(){};

	private ListItem listItem;

	@org.junit.Before
	public void setUp() throws Exception{
		listItem = new ListItem(ArrayList::new);
	}

	@Test
	public void isInitiallyEmpty(){
		assertThat(listItem.getInnerBlocks())
				.isNotNull()
				.isEmpty();
	}

	@Test
	public void canAddBlocks(){
		Block[] blocks = { blockSupplier.get(), blockSupplier.get(), blockSupplier.get() };
		Stream.of(blocks).forEach(listItem::addInnerBlock);
		assertThat(listItem.getInnerBlocks())
				.containsExactly(blocks);
	}
}