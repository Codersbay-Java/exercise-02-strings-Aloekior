package application;

import java.util.Arrays;

public class PlayWithStrings {
	public static void main(String[] args) {
		System.out.println("Hello String World");
		printInitials("Alexander", "Frisch");
		System.out.println(areAnagrams("parliament", "partial men"));
		System.out.println(isPalindrome("Eva can I see bees in a cave?"));
	}

	/**
	 * TODO: print initials
	 * 
	 * This method should print out the initials of a name to standard out.
	 * 
	 * @param firstname
	 * @param lastname
	 */
	public static void printInitials(String firstname, String lastname) {
		System.out.println(firstname.charAt(0) + "" + lastname.charAt(0));
	}

	/**
	 * TODO: check for anagrams
	 * 
	 * This method should determine if two strings are anagrams or not. An anagram
	 * is a word or a phrase made by transposing the letters of another word or
	 * phrase. For example, "parliament" is an anagram of "partial men," and
	 * "software" is an anagram of "swear oft." The program should ignore white
	 * space and punctuation.
	 * 
	 * @param value1
	 * @param value2
	 * @return true if the values are anagrams, false otherwise.
	 */
	public static boolean areAnagrams(String value1, String value2) {
		/*
		 * String word1 = value1.replaceAll("[^a-zA-Z0-9äöüÄÖÜ]", ""); String word2 =
		 * value2.replaceAll("[^a-zA-Z0-9äöüÄÖÜ]", "");
		 */

		/*
		 * if (value1.length() != value2.length()) { return false; }
		 * 
		 * 
		 * char[] value1Chars = value1.toCharArray(); char[] value2Chars =
		 * value2.toCharArray();
		 */

		char[] value1Chars = removeJunk(value1).toCharArray();
		char[] value2Chars = removeJunk(value2).toCharArray();

		Arrays.sort(value1Chars);
		Arrays.sort(value2Chars);

		return Arrays.equals(value1Chars, value2Chars);
	}

	/**
	 * TODO: palindrone checker
	 * 
	 * This method should find out if a string value is a palindrome or not. A
	 * palindrome is a sequence of characters (can also be a number) which reads the
	 * same backwards as forwards. Some palindromes are: Anna; wow; Eva can I see
	 * bees in a cave?
	 * 
	 * Upper or lower case should not matter, but keep the white spaces, tabs and
	 * punctuation in mind.
	 * 
	 * @param value
	 * @return true if it is a palindrome, false otherwise.
	 */
	public static boolean isPalindrome(String value) {
		String myString = removeJunk(value);

		/*
		 * StringBuilder builder = new StringBuilder(); builder.append(myString);
		 * builder.reverse(); String reverse = builder.toString();
		 */

		String reverse = new StringBuilder(myString).reverse().toString();

		return myString.equalsIgnoreCase(reverse);
	}

	// input teacher: use method to remove special characters
	private static String removeJunk(String input) {
		StringBuilder builder = new StringBuilder();
		char[] chars = input.toCharArray();

		for (char c : chars) {
			if (c > 56 && c != 59 && c != 63) {
				builder.append(c);
			}
		}
		return builder.toString();
	}
}
