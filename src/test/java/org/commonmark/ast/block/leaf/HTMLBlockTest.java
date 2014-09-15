package org.commonmark.ast.block.leaf;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HTMLBlockTest{
	private HTMLBlock htmlBlock;

	@Before
	public void setUp(){
		htmlBlock = new HTMLBlock("<body>");
	}

	@Test
	public void containsExpectedContent(){
		assertThat(htmlBlock.getContent()).isEqualTo("<body>");
	}

	@Test
	public void canAppendContent(){
		htmlBlock.appendContent("<ul>");
		assertThat(htmlBlock.getContent()).isEqualTo("<body><ul>");
	}

}