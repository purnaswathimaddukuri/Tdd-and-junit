package com.project.tddjunittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * 1. ABCD => BCD
 * 2. AACD => CD
 * 3. BACD => BCD
 * 4. BBAA => BBAA
 * 5. AABAA => BAA
 * 6. " " => " "
 */
class FirstTwoCharactersTest {
	
    FirstTwoChars  first2chars;
    @BeforeEach
    void setup() {
    first2chars = new FirstTwoChars();
    }
    @Test
    void testFirstChar() {
   assertEquals("BCD",first2chars.delete("ABCD"));
    }
@Test
void test2Chars() {
      assertEquals("CD",first2chars.delete("AACD"));
}
@Test
    void testSecondChar() {
   assertEquals("BCD",first2chars.delete("BACD"));
    }
@Test
void test1() {
   assertEquals("BBAA",first2chars.delete("BBAA"));
}
@Test
void Test2() {
   assertEquals("BAA",first2chars.delete("AABAA"));
}
@Test
void Emptystring() {
   assertEquals(" ",first2chars.delete(" "));
}
@Test
void Test3() {
   assertEquals(" ",first2chars.delete("A"));
}
@Test
void Test4() {
   assertEquals("B",first2chars.delete("BA"));
}
@Test
void Test5() {
   assertEquals("B",first2chars.delete("B"));
}
}