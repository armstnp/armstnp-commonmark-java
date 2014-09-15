package org.commonmark.ast.block.leaf;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FencedCodeBlockTest{
	private FencedCodeBlock fencedCodeBlock;

	@Before
	public void setUp() throws Exception{
		fencedCodeBlock = new FencedCodeBlock("code", "```");
	}

	@Test
	public void containsExpectedContent(){
		assertThat(fencedCodeBlock.getContent()).isEqualTo("code");
	}

	@Test
	public void canAppendContent(){
		fencedCodeBlock.appendContent("appended");
		assertThat(fencedCodeBlock.getContent()).isEqualTo("codeappended");
	}

	@Test
	public void matchesIdenticalFences(){
		String identicalFence = "```";
		assertThat(fencedCodeBlock.matchesFence(identicalFence)).isTrue();
	}

	@Test
	public void doesNotMatchDifferingFence(){
		String differingFence = "~~~";
		assertThat(fencedCodeBlock.matchesFence(differingFence)).isFalse();
	}
}