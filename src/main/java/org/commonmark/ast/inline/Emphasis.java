package org.commonmark.ast.inline;

import java.util.List;
import java.util.function.Supplier;

public class Emphasis extends InlineContentSequence{
	public Emphasis(Supplier<? extends List<IInlineContent>> contentSequenceListProvider){
		super(contentSequenceListProvider);
	}
}
