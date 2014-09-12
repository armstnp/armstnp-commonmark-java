package org.commonmark.ast.leaf;

import org.commonmark.ast.inline.IInlineContent;

public final class LinkReferenceDefinition {
	private final IInlineContent label;
	private final String destination;
	private final String title;

	public LinkReferenceDefinition(final IInlineContent label, final String destination, final String title){
		this.label = label;
		this.destination = destination;
		this.title = title;
	}

	public IInlineContent getLabel(){
		return label;
	}

	public String getDestination(){
		return destination;
	}

	public String getTitle(){
		return title;
	}
}
