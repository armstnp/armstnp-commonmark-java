package org.commonmark.ast.inline;

public class ReferenceLink implements InlineContent{
	private final InlineContent label;
	private final InlineContent referenceLabel;

	public ReferenceLink(final InlineContent label, final InlineContent referenceLabel){
		this.label = label;
		this.referenceLabel = referenceLabel;
	}

	public InlineContent getLabel(){
		return label;
	}

	public InlineContent getReferenceLabel(){
		return referenceLabel;
	}
}
