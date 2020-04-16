package com.practice.random;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ReverseStringTest {
	private ReverseString revString;
	private String input;
	private String expected;

	@Before
	public void setUp() {
		revString = new ReverseString();
	}

	@Test
	public void reverseStringTest() {
		assertEquals(expected, revString.reverse(input));

	}

	@Parameters
	public static Collection<String[]> getParameters() {
		return Arrays.asList(new String[][] { { "kanika", "akinak" }, { "sharma", "amrahs" }, { "ashu", "uhsa" } });
	}

	public ReverseStringTest(String input, String expected) {
		this.input = input;
		this.expected = expected;
	}
}
