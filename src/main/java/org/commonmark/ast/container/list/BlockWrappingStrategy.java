package org.commonmark.ast.container.list;

import org.commonmark.ast.IBlock;

public interface BlockWrappingStrategy{
	IBlock wrapBlock(IBlock block);
	BlockWrappingStrategy loosen();
}
