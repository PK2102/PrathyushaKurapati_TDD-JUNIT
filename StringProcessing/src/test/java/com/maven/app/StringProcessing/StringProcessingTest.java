package com.maven.app.StringProcessing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class StringProcessingTest {
	/*
 	1. empty String "" => "" - success
 	2. 1 char with A : A => "" - success
 	3. 1 char without  A : B => B - success
 	4. 4 char where first 2 are A : AACD => CD - success
 	5. 4 char where first char is A : ABCD => BCD - success
 	6. 4 char where second char is A : BACD => BCD - success
 	7.4 char with no A in first 2 characters: BBAA => BBAA - success
 	8. n chars : AABAA => BAA - success
 */
	StringProcessing object;
	@BeforeEach
	void setUp()
	{
		object = new StringProcessing();
	}

	@Test
	void testEmptyString() {		
		assertEquals("",object.process(""));		
	}
	@Test
	void test1CharwithA() {	
		assertEquals("",object.process("A"));		
	}
	@Test
	void test1CharwithoutA() {		
		assertEquals("B",object.process("B"));		
	}
	@Test
	void test4Charfirst2charsA() {
		
		assertEquals("CD",object.process("AACD"));		
	}
	@Test
	void test4Charfirst1charA() {	
		assertEquals("BCD",object.process("ABCD"));		
	}
	@Test
	void test4CharsecondcharA() {		
		assertEquals("BCD",object.process("BACD"));	
	}
	@Test
	void test4CharwithoutA() {		
		assertEquals("BBAA",object.process("BBAA"));		
	}
	@Test
	void testNChars() {	
		assertEquals("BAA",object.process("AABAA"));		
	}
}
