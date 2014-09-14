package org.commonmark.ast.block.container;

import org.commonmark.ast.block.container.list.BlockWrappingStrategy;
import org.commonmark.ast.block.container.list.Marker;

import java.math.BigInteger;
import java.util.List;
import java.util.function.Supplier;

public class OrderedListBlock extends ListBlock{
	private final BigInteger startIndex;

	public OrderedListBlock(
			Supplier<? extends List<ListItem>> listItemListProvider,
			Marker marker,
			BlockWrappingStrategy blockWrappingStrategy,
			BigInteger startIndex
	){
		super(listItemListProvider, marker, blockWrappingStrategy);

		this.startIndex = startIndex;
	}

	public BigInteger getStartIndex(){
		return startIndex;
	}
}
