package org.commonmark.ast.inline;

public class Image implements InlineContent{
	private Link associatedLink;

	public Image(Link associatedLink){
		this.associatedLink = associatedLink;
	}

	public Link getAssociatedLink(){
		return associatedLink;
	}

	//NOTE: May need a rewrite function as a link container...
}
