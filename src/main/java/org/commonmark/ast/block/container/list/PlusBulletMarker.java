package org.commonmark.ast.block.container.list;

public final class PlusBulletMarker extends Marker {
	private static final PlusBulletMarker instance = new PlusBulletMarker();
	public static PlusBulletMarker getInstance(){ return instance; }

	private PlusBulletMarker(){ super('+'); }
}
