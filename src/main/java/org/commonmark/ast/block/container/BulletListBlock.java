package org.commonmark.ast.block.container;

import org.commonmark.ast.block.container.list.BlockWrappingStrategy;
import org.commonmark.ast.block.container.list.Marker;

import java.util.List;
import java.util.function.Supplier;

public class BulletListBlock extends ListBlock{
	public BulletListBlock(
			Supplier<? extends List<ListItem>> listItemListProvider,
			Marker marker,
			BlockWrappingStrategy blockWrappingStrategy
	){
		super(listItemListProvider, marker, blockWrappingStrategy);
	}
}
