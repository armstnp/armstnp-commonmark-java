package org.commonmark.ast.block.leaf;

import org.commonmark.ast.inline.InlineContainer;
import org.commonmark.ast.inline.InlineContent;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LevelOneHeaderTest{
	private LevelOneHeader levelOneHeader;
	private InlineContainer headerContentContainer = new InlineContainer(new InlineContent(){}){};

	@Before
	public void setUp() throws Exception{
		levelOneHeader = new LevelOneHeader(headerContentContainer);
	}

	@Test
	public void containsExpectedContentContainer(){
		assertThat(levelOneHeader.getContent()).isSameAs(headerContentContainer);
	}
}