package com.myapp.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	ReverseString r = new ReverseString();

	@Test
	void TestReverseString_OneWord() {
		
		assertEquals("avaJ",r.ReverseString("Java"),"this string is not reverse");
		
	}
	@Test
	void TestReverseString_ManyWord() {
		assertEquals("em si sihT",r.ReverseString("This is me"),()->"this is not reverse");
	}

}
