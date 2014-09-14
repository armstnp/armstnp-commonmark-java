package org.commonmark.ast.inline;

public abstract class Link implements InlineContent{
	private final InlineContent label;
	private final String destination;
	private final String title;

	public Link(final InlineContent label, final String destination, final String title){
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
