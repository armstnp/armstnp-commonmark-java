package org.commonmark.ast.block.leaf;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class InfoFencedCodeBlockTest{
	private InfoCodeBlock infoCodeBlock;

	@Before
	public void setUp() throws Exception{
		infoCodeBlock = new InfoCodeBlock("code", "```", "info");
	}

	@Test
	public void containsExpectedContent(){
		assertThat(infoCodeBlock.getContent()).isEqualTo("code");
	}

	@Test
	public void canAppendContent(){
		infoCodeBlock.appendContent("appended");
		assertThat(infoCodeBlock.getContent()).isEqualTo("codeappended");
	}

	@Test
	public void matchesIdenticalFences(){
		String identicalFence = "```";
		assertThat(infoCodeBlock.matchesFence(identicalFence)).isTrue();
	}

	@Test
	public void doesNotMatchDifferingFence(){
		String differingFence = "~~~";
		assertThat(infoCodeBlock.matchesFence(differingFence)).isFalse();
	}

	@Test
	public void containsExpectedInfo(){
		assertThat(infoCodeBlock.getInfo()).isEqualTo("info");
	}
}