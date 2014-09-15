package org.commonmark.ast.block.leaf;

import org.commonmark.ast.inline.InlineContainer;
import org.commonmark.ast.inline.InlineContent;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LevelTwoHeaderTest{
	private LevelTwoHeader levelTwoHeader;
	private InlineContainer headerContentContainer = new InlineContainer(new InlineContent(){}){};

	@Before
	public void setUp() throws Exception{
		levelTwoHeader = new LevelTwoHeader(headerContentContainer);
	}

	@Test
	public void containsExpectedContentContainer(){
		assertThat(levelTwoHeader.getContent()).isSameAs(headerContentContainer);
	}
}