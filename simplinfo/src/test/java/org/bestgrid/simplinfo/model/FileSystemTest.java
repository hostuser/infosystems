package org.bestgrid.simplinfo.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FileSystemTest {

	@Test
	public void testFileSystemFullUrl() {
		FileSystem fs = new FileSystem("gsiftp://ng2.auckland.ac.nz:2811");
		assertEquals(fs.getHost(), "ng2.auckland.ac.nz");
		assertEquals(fs.getPort(), 2811);
		assertEquals(fs.getProtocol(), "gsiftp");
	}

	@Test
	public void testFileSystemOnlyHost() {
		FileSystem fs = new FileSystem("ng2.auckland.ac.nz");

		assertEquals(fs.getHost(), "ng2.auckland.ac.nz");
		assertEquals(fs.getPort(), FileSystem.DEFAULT_PORT);
		assertEquals(fs.getProtocol(), FileSystem.DEFAULT_PROTOCOL);
	}

	@Test
	public void testFileSystemOnlyProtocolAndHost() {
		FileSystem fs = new FileSystem("gsiftp://ng2.auckland.ac.nz");
		assertEquals(fs.getHost(), "ng2.auckland.ac.nz");
		assertEquals(fs.getPort(), FileSystem.DEFAULT_PORT);
		assertEquals(fs.getProtocol(), "gsiftp");
	}

	public void testCompareTo()
	{
	
	}

}
