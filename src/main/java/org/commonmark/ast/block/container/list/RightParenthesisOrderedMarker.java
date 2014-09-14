package org.commonmark.ast.block.container.list;

public final class RightParenthesisOrderedMarker extends Marker {
	private static final RightParenthesisOrderedMarker instance = new RightParenthesisOrderedMarker();
	public static RightParenthesisOrderedMarker getInstance(){ return instance; }

	private RightParenthesisOrderedMarker(){ super(')'); }
}
