package org.commonmark.ast.block.container;

import org.commonmark.ast.block.container.list.BlockWrappingStrategy;
import org.commonmark.ast.block.container.list.Marker;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

public class OrderedListBlockTest{
	private static final Supplier<ListItem> listItemSupplier = () -> new ListItem(ArrayList::new){};

	private static final BlockWrappingStrategy listBlockWrappingStrategyAfter = new BlockWrappingStrategy(){ };
	private static final BlockWrappingStrategy listBlockWrappingStrategyBefore = new BlockWrappingStrategy(){
		@Override
		public BlockWrappingStrategy loosen(){ return listBlockWrappingStrategyAfter; }
	};

	private OrderedListBlock list;

	@org.junit.Before
	public void setUp() throws Exception{
		list = new OrderedListBlock(
				ArrayList::new,
				new Marker('.'){},
				listBlockWrappingStrategyBefore,
				new BigInteger("1"));
	}

	@Test
	public void isInitiallyEmpty(){
		assertThat(list.getListItems())
				.isNotNull()
				.isEmpty();
	}

	@Test
	public void canAddListItems(){
		ListItem[] items = { listItemSupplier.get(), listItemSupplier.get(), listItemSupplier.get() };
		Stream.of(items).forEach(list::addListItem);
		assertThat(list.getListItems())
				.containsExactly(items);
	}

	@Test
	public void canMatchMarkers(){
		Marker matchingMarker = new Marker('.'){};
		Marker nonMatchingMarker = new Marker('-'){};
		assertThat(list.matches(matchingMarker)).isTrue();
		assertThat(list.matches(nonMatchingMarker)).isFalse();
	}

	@Test
	public void containsExpectedWrappingStrategyInitially(){
		assertThat(list.getBlockWrappingStrategy()).isSameAs(listBlockWrappingStrategyBefore);
	}

	@Test
	public void containsLoosenedWrappingStrategyAfterLoosening(){
		list.loosen();
		assertThat(list.getBlockWrappingStrategy()).isSameAs(listBlockWrappingStrategyAfter);
	}

	@Test
	public void containsExpectedStartingIndex(){
		assertThat(list.getStartIndex()).isEqualTo(new BigInteger("1"));
	}
}