package org.commonmark.ast.block.leaf;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericCodeBlockTest{
	private GenericCodeBlock genericCodeBlock;

	@Before
	public void setUp() throws Exception{
		genericCodeBlock = new GenericCodeBlock("code");
	}

	@Test
	public void containsExpectedContent(){
		assertThat(genericCodeBlock.getContent()).isEqualTo("code");
	}

	@Test
	public void canAppendContent(){
		genericCodeBlock.appendContent("appended");
		assertThat(genericCodeBlock.getContent()).isEqualTo("codeappended");
	}
}