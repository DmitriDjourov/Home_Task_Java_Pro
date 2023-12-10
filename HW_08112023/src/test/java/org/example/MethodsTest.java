package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MethodsTest {

		@ParameterizedTest
		@CsvSource(value = {
				"aaa,aaa",
				"a#aa,aa",
				"a#a#a,a",
				"aa#a#a,aa",
		})
		void countTest(String s, String expected) {
				assertEquals(expected, Methods.count(s));
		}

		@ParameterizedTest
		@CsvSource(value = {
				"aaa,aaa###aaa, true",
				"aaa,a#aa,false"
		})
		@Test
		void twoStringEqualsTest(String s1,String s2, boolean expected) {
				String sLat1 = Methods.count(s1);
				String sLat2 = Methods.count(s2);
				assertEquals(expected,Methods.twoStringEquals(sLat1,sLat2));
		}

		@Test
		public void testSomeDashLowerStart() {
				String input = "the-Stealth-Warrior";
				System.out.println("input: "+input);
				assertEquals("theStealthWarrior", Methods.toCamelCase(input));
		}
		@Test
		public void testSomeUnderscoreLowerStart() {
				String input = "the_Stealth_Warrior";
				System.out.println("input: "+input);
				assertEquals("theStealthWarrior", Methods.toCamelCase(input));
		}

		@Test
		public void Test1() {
				assertEquals( 7, Methods.digital_root(16));
		}
		@Test
		public void Test2() {
				assertEquals( 6, Methods.digital_root(456));
		}

		@Test
		public void test() {
				assertEquals(")()())()(()()(",
						Methods.encode("Prespecialized"));
				assertEquals("))))())))",Methods.encode("   ()(   "));
		}
		@Test
		void order_shouldReturnEmptyString_whenInputIsNull() {
				assertThrows(IllegalArgumentException.class, () -> Methods.order(null));
		}

		@Test
		void order_shouldReturnEmptyString_whenInputIsEmpty() {
				assertEquals("", Methods.order(""));
		}

		@Test
		void order_shouldReturnOrderedString_whenInputContainsWordsWithNumbers() {
				String input = "4 This is 1 a 3 test 2 sentence";
				String expectedOutput = "This is a test sentence";
				assertEquals(expectedOutput, Methods.order(input));
		}

		@Test
		void order_shouldReturnOrderedString_whenInputContainsWordsWithLeadingZeros() {
				String input = "002 This is 001 a 003 test 004 sentence";
				String expectedOutput = "This is a test sentence";
				assertEquals(expectedOutput, Methods.order(input));
		}

		@Test
		void order_shouldReturnOrderedString_whenInputContainsSpecialCharacters() {
				String input = "4 @This is 1 a $3 test 2 sentence";
				String expectedOutput = "@This is a $test sentence";
				assertEquals(expectedOutput, Methods.order(input));
		}
		@Test
		public void shouldConvertToRoman() {
				assertEquals("I", Methods.solution(1));
				assertEquals( "IV", Methods.solution(4));
				assertEquals( "VI", Methods.solution(6));
		}
}