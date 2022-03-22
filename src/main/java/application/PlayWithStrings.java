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
		System.out.println(firstname.charAt(0));
		System.out.println(lastname.charAt(0));
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
		String word1 = value1.replaceAll("[^a-zA-Z0-9äöüÄÖÜ]", "");
		String word2 = value2.replaceAll("[^a-zA-Z0-9äöüÄÖÜ]", "");

		if (word1.length() != word2.length()) {
			return false;
		}

		char[] arr1 = word1.toCharArray();
		char[] arr2 = word2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			return true;
		}

		return false;
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
		String myString = value.replaceAll("[^a-zA-Z0-9äöüÄÖÜ]", "");

		StringBuilder builder = new StringBuilder();
		builder.append(myString);
		builder.reverse();
		String myStringReverse = builder.toString();

		if (myString.equalsIgnoreCase(myStringReverse)) {
			return true;
		}
		return false;
	}
}
