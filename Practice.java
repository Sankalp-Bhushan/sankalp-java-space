import java.util.*;

public class Practice {
	static String ans = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(writeSomething(""));
	}

	public static String printBinaryNubmer(int n) {
		if (n == 1)
			return "1";
		if (n == 0)
			return "0";
		;
		return printBinaryNubmer(n / 2) + String.valueOf(n % 2);
	}

	public static void printString(String s, int n) {
		if (n == s.length()) {
			return;
		}
		char c = s.charAt(n);
		printString(s, n + 1);
		ans += "" + c;
	}

	public static String writeSomething(String topic) {
		// Enhanced Switch Statement
		String response = switch (topic) {
		case "computer" -> {
			yield "Computer changed the life of all human beings.";
		}
		case "Technology" -> {
			yield "Technoly has both effects based on the intensions of the user.";
		}
		default -> {
			yield "We all should work hard as much as we can to achieve our goals.";
		}
		};
		return response;
	}
}
