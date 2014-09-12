package org.commonmark.ast.container;

import com.google.common.collect.ImmutableList;
import org.commonmark.ast.IBlock;
import org.commonmark.ast.container.list.BlockWrappingStrategy;
import org.commonmark.ast.container.list.Marker;

import java.util.List;
import java.util.function.Supplier;

abstract class ListBlock implements IBlock{
	private final List<ListItem> listItems;
	private final Marker marker;
	private BlockWrappingStrategy blockWrappingStrategy;

	public ListBlock(final Supplier<? extends List<ListItem>> listItemListProvider, final Marker marker, final BlockWrappingStrategy blockWrappingStrategy){
		this.listItems = listItemListProvider.get();
		this.marker = marker;
		this.blockWrappingStrategy = blockWrappingStrategy;
	}

	public void addListItem(ListItem listItem){
		listItems.add(listItem);
	}

	public ImmutableList<ListItem> getListItems(){
		return ImmutableList.copyOf(listItems);
	}

	public boolean matches(Marker marker){
		return marker == null ? this.marker == null : marker.matches(this.marker);
	}

	public BlockWrappingStrategy getBlockWrappingStrategy(){
		return blockWrappingStrategy;
	}

	public void loosen(){
		blockWrappingStrategy = blockWrappingStrategy.loosen();
	}
}
