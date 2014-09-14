package org.commonmark.ast.block.leaf;

import org.commonmark.ast.inline.InlineContent;

public class LinkReferenceDefinition extends LeafBlock {
	private final InlineContent label;
	private final String destination;
	private final String title;

	public LinkReferenceDefinition(final InlineContent label, final String destination, final String title){
		this.label = label;
		this.destination = destination;
		this.title = title;
	}

	public InlineContent getLabel(){
		return label;
	}

	public String getDestination(){
		return destination;
	}

	public String getTitle(){
		return title;
	}
}
