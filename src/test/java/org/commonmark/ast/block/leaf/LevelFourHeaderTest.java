package org.commonmark.ast.block.leaf;

import org.commonmark.ast.inline.InlineContainer;
import org.commonmark.ast.inline.InlineContent;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LevelFourHeaderTest{
	private LevelFourHeader levelFourHeader;
	private InlineContainer headerContentContainer = new InlineContainer(new InlineContent(){}){};

	@Before
	public void setUp() throws Exception{
		levelFourHeader = new LevelFourHeader(headerContentContainer);
	}

	@Test
	public void containsExpectedContentContainer(){
		assertThat(levelFourHeader.getContent()).isSameAs(headerContentContainer);
	}
}