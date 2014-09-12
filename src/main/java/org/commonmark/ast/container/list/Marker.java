package org.commonmark.ast.container.list;

public abstract class Marker {
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
