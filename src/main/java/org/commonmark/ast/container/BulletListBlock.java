package org.commonmark.ast.container;

import org.commonmark.ast.container.list.BulletMarker;

import java.util.List;
import java.util.function.Supplier;

public final class BulletListBlock extends ListBlock {
	public BulletListBlock(Supplier<? extends List<ListItem>> listItemListProvider, BulletMarker marker){
		super(listItemListProvider, marker);
	}
}
