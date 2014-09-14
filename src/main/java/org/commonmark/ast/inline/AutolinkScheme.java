package org.commonmark.ast.inline;

public class AutolinkScheme{
	private String scheme;

	public AutolinkScheme(String scheme){
		this.scheme = scheme;
	}

	public String getScheme(){
		return scheme;
	}
}
