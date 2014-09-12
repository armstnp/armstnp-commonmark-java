package org.commonmark.ast.inline;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.function.Supplier;

public class InlineContentSequence implements IInlineContent {
	private final List<IInlineContent> contentSequence;

	public InlineContentSequence(final Supplier<? extends List<IInlineContent>> contentSequenceListProvider){
		this.contentSequence = contentSequenceListProvider.get();
	}

	public ImmutableList<IInlineContent> getInlineContent(){
		return ImmutableList.copyOf(contentSequence);
	}

	public void addInlineContent(IInlineContent content){
		contentSequence.add(content);
	}
}
