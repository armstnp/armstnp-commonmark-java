package org.commonmark.ast.block.container.list;

public class Marker {
	private final char marker;

	public Marker(final char marker){
		this.marker = marker;
	}

	public char getMarker(){
		return marker;
	}

	public boolean matches(Marker other){
		return other != null
		    && other.marker == marker;
	}
}
