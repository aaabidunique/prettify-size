package com.github.aaabidunique.prettifysize;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PreetifySizeInByteTest {

	@Test
	public void testPrettifyZeroByteShort() {
		assertNotNull(PrettifySize.prettify(0L, true));
	}

	@Test
	public void testPrettifyZeroByteFull() {
		assertNotNull(PrettifySize.prettify(0L, false));
	}

	@Test
	public void testPrettifyByteShort() {
		assertNotNull(PrettifySize.prettify(1L, true));
	}

	@Test
	public void testPrettifyByteFull() {
		assertNotNull(PrettifySize.prettify(1L, false));
	}

	@Test
	public void testPrettifyKiloByteShort() {
		assertNotNull(PrettifySize.prettify(1024L, true));
	}

	@Test
	public void testPrettifyKiloByteFull() {
		assertNotNull(PrettifySize.prettify(1024L, false));
	}

	@Test
	public void testPrettifyMegaByteShort() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L, true));
	}

	@Test
	public void testPrettifyMegaByteFull() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L, false));
	}

	@Test
	public void testPrettifyGigaByteShort() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L, true));
	}

	@Test
	public void testPrettifyGigaByteFull() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L, false));
	}

	@Test
	public void testPrettifyTeraByteShort() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L * 1024L, true));
	}

	@Test
	public void testPrettifyPetaByteFull() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L * 1024L * 1024L, false));
	}

	@Test
	public void testPrettifyExaByteShort() {
		assertNotNull(PrettifySize.prettify(Long.MAX_VALUE, true));
	}

	@Test
	public void testPrettifyExaByteFull() {
		assertNotNull(PrettifySize.prettify(Long.MAX_VALUE, false));
	}
}