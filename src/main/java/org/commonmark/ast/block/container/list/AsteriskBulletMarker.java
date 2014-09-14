package org.commonmark.ast.block.container.list;

public final class AsteriskBulletMarker extends Marker {
	private static final AsteriskBulletMarker instance = new AsteriskBulletMarker();
	public static AsteriskBulletMarker getInstance(){ return instance; }

	private AsteriskBulletMarker(){ super('*'); }
}
