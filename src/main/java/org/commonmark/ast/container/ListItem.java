package org.commonmark.ast.container;

import org.commonmark.ast.IBlock;

import java.util.List;
import java.util.function.Supplier;

public final class ListItem extends ContainerBlock {
	public ListItem(Supplier<? extends List<IBlock>> innerBlockListProvider){ super(innerBlockListProvider); }
}
