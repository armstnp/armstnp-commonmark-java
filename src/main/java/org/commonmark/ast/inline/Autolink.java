package org.commonmark.ast.inline;

public class Autolink implements InlineContent{
	private final AutolinkScheme scheme;
	private final String uri;

	public Autolink(AutolinkScheme scheme, String uri){
		this.scheme = scheme;
		this.uri = uri;
	}

	public AutolinkScheme getScheme(){
		return scheme;
	}

	public String getUri(){
		return uri;
	}
}
