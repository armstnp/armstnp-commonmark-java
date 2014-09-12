package org.commonmark.ast.container;

import org.commonmark.ast.container.list.BulletMarker;

import java.math.BigInteger;
import java.util.List;
import java.util.function.Supplier;

public final class OrderedListBlock extends ListBlock {
	private final BigInteger startIndex;

	public OrderedListBlock(Supplier<? extends List<ListItem>> listItemListProvider, BulletMarker marker, BigInteger startIndex){
		super(listItemListProvider, marker);

		this.startIndex = startIndex;
	}

	public BigInteger getStartIndex(){
		return startIndex;
	}
}
