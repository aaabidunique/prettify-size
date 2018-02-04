package com.github.aaabidunique.prettifysize;

import java.text.DecimalFormat;
import java.util.logging.Logger;

public class PrettifySize {

	private static final Logger LOG = Logger.getLogger(PrettifySize.class.getSimpleName());

	private static final String[] BYTE_UNITS_FULL = new String[] { "byte", "Kilobyte", "Megabyte", "Gigabyte", "Terabyte", "Petabyte", "Exabyte" };
	private static final String[] BYTE_UNITS_SHORT = new String[] { "B", "KB", "MB", "GB", "TB", "PB", "EB" };

	private static final String[] BIT_UNITS_FULL = new String[] { "bit", "Kilobit", "Megabit", "Gigabit", "Terabit", "Petabit", "Exabit" };
	private static final String[] BIT_UNITS_SHORT = new String[] { "b", "KiB", "MiB", "Gib", "TiB", "PiB", "EiB" };

	private PrettifySize() {
	}

	public enum PrettifySizeUnit {
		BIT, BYTE
	}

	public static String prettify(final long size) {
		return prettify(size, PrettifySizeUnit.BYTE, true);
	}

	public static String prettify(final long size, PrettifySizeUnit prettifySizeUnit, boolean prettifyInShortForm) {
		LOG.info("Trying to prettify size for input size : " + size + " with size unit as : " + prettifySizeUnit);
		String result = null;
		String sizeGroup[] = null;
		int unit = 0;
		if (size < 0) {
			throw new IllegalArgumentException("Invalid size less than zero");
		}

		if (size > Long.MAX_VALUE) {
			throw new IllegalArgumentException("Invalid size grater than max value supported : " + Long.MAX_VALUE);
		}

		if (size == 0) {
			result = "0";
		} else {
			unit = getUnits(prettifySizeUnit);
			sizeGroup = getSizeGroup(prettifySizeUnit, prettifyInShortForm);
			int digitGroups = (int) (Math.log10(size) / Math.log10(unit));
			result = new DecimalFormat("#,##0.#").format(size / Math.pow(unit, digitGroups)) + " " + sizeGroup[digitGroups];
		}
		LOG.info("Prettified size for input : " + size + " is : " + result);
		return result;
	}

	private static int getUnits(PrettifySizeUnit prettifySizeUnit) {
		return prettifySizeUnit == PrettifySizeUnit.BIT ? 1000 : 1024;
	}

	private static String[] getSizeGroup(PrettifySizeUnit prettifySizeUnit, boolean prettifyInShortForm) {
		String[] sizeGroup = null;
		if (prettifySizeUnit == PrettifySizeUnit.BIT) {
			if (prettifyInShortForm) {
				sizeGroup = BIT_UNITS_SHORT;
			} else {
				sizeGroup = BIT_UNITS_FULL;
			}
		} else {
			if (prettifyInShortForm) {
				sizeGroup = BYTE_UNITS_SHORT;
			} else {
				sizeGroup = BYTE_UNITS_FULL;
			}
		}
		return sizeGroup;
	}
}