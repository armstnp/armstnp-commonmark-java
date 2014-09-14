package org.commonmark.ast.block.container.list;

public final class DashBulletMarker extends Marker {
	private static final DashBulletMarker instance = new DashBulletMarker();
	public static DashBulletMarker getInstance(){ return instance; }

	private DashBulletMarker(){ super('-'); }
}
