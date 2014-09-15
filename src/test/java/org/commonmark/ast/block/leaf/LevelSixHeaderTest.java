package org.commonmark.ast.block.leaf;

import org.commonmark.ast.inline.InlineContainer;
import org.commonmark.ast.inline.InlineContent;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LevelSixHeaderTest{
	private LevelSixHeader levelSixHeader;
	private InlineContainer headerContentContainer = new InlineContainer(new InlineContent(){}){};

	@Before
	public void setUp() throws Exception{
		levelSixHeader = new LevelSixHeader(headerContentContainer);
	}

	@Test
	public void containsExpectedContentContainer(){
		assertThat(levelSixHeader.getContent()).isSameAs(headerContentContainer);
	}
}