package Arrays;

import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		isPalindromeByReverseNumber(n);
		isPalindromeByString(n);

	}

	public static void isPalindromeByReverseNumber(int n) {
		int temp = n;
		int reverseNumber = 0;
		while (temp > 0) {
			int lastDigit = temp % 10;
			temp /= 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
		}

		if (n == reverseNumber) {
			System.out.println("Number is palindrome.");
		} else {
			System.out.println("Number is not a palindrome.");
		}
	}

	public static void isPalindromeByString(int n) {
		String s = Integer.toString(n);
		String reverseNumber = "";
		int len = s.length();
		while (len-- > 0) {
			reverseNumber += s.charAt(len);
		}
		if (s.equals(reverseNumber)) {
			System.out.println("Number is palindrome.");
		} else {
			System.out.println("Number is not a palindrome.");
		}
	}
}
