package org.commonmark.ast.block.leaf;

import org.commonmark.ast.inline.InlineContainer;
import org.commonmark.ast.inline.InlineContent;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LevelThreeHeaderTest{
	private LevelThreeHeader levelThreeHeader;
	private InlineContainer headerContentContainer = new InlineContainer(new InlineContent(){}){};

	@Before
	public void setUp() throws Exception{
		levelThreeHeader = new LevelThreeHeader(headerContentContainer);
	}

	@Test
	public void containsExpectedContentContainer(){
		assertThat(levelThreeHeader.getContent()).isSameAs(headerContentContainer);
	}
}