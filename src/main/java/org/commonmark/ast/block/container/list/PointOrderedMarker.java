package org.commonmark.ast.block.container.list;

public final class PointOrderedMarker extends Marker {
	private static final PointOrderedMarker instance = new PointOrderedMarker();
	public static PointOrderedMarker getInstance(){ return instance; }

	private PointOrderedMarker(){ super('.'); }
}
