package com.github.aaabidunique.prettifysize;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.github.aaabidunique.prettifysize.PrettifySize.PrettifySizeUnit;

public class PrettifySizeInBitTest {

	@Test
	public void testPrettifyZeroBitShort() {
		assertNotNull(PrettifySize.prettify(0L, PrettifySizeUnit.BIT, true));
	}

	@Test
	public void testPrettifyZeroBitFull() {
		assertNotNull(PrettifySize.prettify(0L, PrettifySizeUnit.BIT, true));
	}

	@Test
	public void testPrettifyBitShort() {
		assertNotNull(PrettifySize.prettify(1L, PrettifySizeUnit.BIT, true));
	}

	@Test
	public void testPrettifyBitFull() {
		assertNotNull(PrettifySize.prettify(1L, PrettifySizeUnit.BIT, false));
	}

	@Test
	public void testPrettifyKiloBitShort() {
		assertNotNull(PrettifySize.prettify(1024L, PrettifySizeUnit.BIT, true));
	}

	@Test
	public void testPrettifyKiloBitFull() {
		assertNotNull(PrettifySize.prettify(1024L, PrettifySizeUnit.BIT, false));
	}

	@Test
	public void testPrettifyMegaBitShort() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L, PrettifySizeUnit.BIT, true));
	}

	@Test
	public void testPrettifyMegaBitFull() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L, PrettifySizeUnit.BIT, false));
	}

	@Test
	public void testPrettifyGigaBitSHort() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L, PrettifySizeUnit.BIT, true));
	}

	@Test
	public void testPrettifyGigaBitFull() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L, PrettifySizeUnit.BIT, false));
	}

	@Test
	public void testPrettifyTeraBitShort() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L * 1024L, PrettifySizeUnit.BIT, true));
	}

	@Test
	public void testPrettifyTeraBitFull() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L * 1024L, PrettifySizeUnit.BIT, false));
	}

	@Test
	public void testPrettifyPetaBitShort() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L * 1024L * 1024L, PrettifySizeUnit.BIT, true));
	}

	@Test
	public void testPrettifyPetaBitFull() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L * 1024L * 1024L, PrettifySizeUnit.BIT, false));
	}

	@Test
	public void testPrettifyExaBitShort() {
		assertNotNull(PrettifySize.prettify(Long.MAX_VALUE, PrettifySizeUnit.BIT, true));
	}

	@Test
	public void testPrettifyExaBitFull() {
		assertNotNull(PrettifySize.prettify(Long.MAX_VALUE, PrettifySizeUnit.BIT, false));
	}
}