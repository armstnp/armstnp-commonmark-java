package org.commonmark.ast.inline;

import java.util.List;
import java.util.function.Supplier;

public class StrongEmphasis extends InlineContentSequence{
	public StrongEmphasis(Supplier<? extends List<IInlineContent>> contentSequenceListProvider){
		super(contentSequenceListProvider);
	}
}
