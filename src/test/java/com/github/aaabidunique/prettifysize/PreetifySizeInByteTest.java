package com.github.aaabidunique.prettifysize;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.github.aaabidunique.prettifysize.PrettifySize.PrettifySizeUnit;

public class PreetifySizeInByteTest {

	@Test
	public void testPrettifyZeroByteShort() {
		assertNotNull(PrettifySize.prettify(0L));
	}

	@Test
	public void testPrettifyZeroByteFull() {
		assertNotNull(PrettifySize.prettify(0L, PrettifySizeUnit.BYTE, false));
	}

	@Test
	public void testPrettifyByteShort() {
		assertNotNull(PrettifySize.prettify(1L));
	}

	@Test
	public void testPrettifyByteFull() {
		assertNotNull(PrettifySize.prettify(1L, PrettifySizeUnit.BYTE, false));
	}

	@Test
	public void testPrettifyKiloByteShort() {
		assertNotNull(PrettifySize.prettify(1024L));
	}

	@Test
	public void testPrettifyKiloByteFull() {
		assertNotNull(PrettifySize.prettify(1024L, PrettifySizeUnit.BYTE, false));
	}

	@Test
	public void testPrettifyMegaByteShort() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L));
	}

	@Test
	public void testPrettifyMegaByteFull() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L, PrettifySizeUnit.BYTE, false));
	}

	@Test
	public void testPrettifyGigaByteShort() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L));
	}

	@Test
	public void testPrettifyGigaByteFull() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L, PrettifySizeUnit.BYTE, false));
	}

	@Test
	public void testPrettifyTeraByteShort() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L * 1024L));
	}

	@Test
	public void testPrettifyPetaByteFull() {
		assertNotNull(PrettifySize.prettify(1024L * 1024L * 1024L * 1024L * 1024L, PrettifySizeUnit.BYTE, false));
	}

	@Test
	public void testPrettifyExaByteShort() {
		assertNotNull(PrettifySize.prettify(Long.MAX_VALUE));
	}

	@Test
	public void testPrettifyExaByteFull() {
		assertNotNull(PrettifySize.prettify(Long.MAX_VALUE, PrettifySizeUnit.BYTE, false));
	}
}