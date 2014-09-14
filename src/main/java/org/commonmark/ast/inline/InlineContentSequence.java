package org.commonmark.ast.inline;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.function.Supplier;

public class InlineContentSequence implements InlineContent{
	private final List<InlineContent> contentSequence;

	public InlineContentSequence(final Supplier<? extends List<InlineContent>> contentSequenceListProvider){
		this.contentSequence = contentSequenceListProvider.get();
	}

	public ImmutableList<InlineContent> getInlineContent(){
		return ImmutableList.copyOf(contentSequence);
	}

	public void addInlineContent(InlineContent content){
		contentSequence.add(content);
	}
}
