package org.commonmark.ast.block.container.list;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MarkerTest{
	private Marker marker;

	@Before
	public void setUp() throws Exception{
		marker = new Marker('.');
	}

	@Test
	public void hasExpectedMarker(){
		assertThat(marker.getMarker() == '.').isTrue();
	}

	@Test
	public void canMatchMarkers(){
		Marker matchingMarker = new Marker('.');
		Marker nonMatchingMarker = new Marker('-');
		assertThat(marker.matches(matchingMarker)).isTrue();
		assertThat(marker.matches(nonMatchingMarker)).isFalse();
	}
}