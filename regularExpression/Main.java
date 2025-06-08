package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String str = "I am a string. Yes I am.";
		System.out.println(str);
		
		//Will replace all the occurance of I with you.
		String yourString = str.replaceAll("I", "You");
		System.out.println(yourString);
		
		String alphaNumeric = "ajnaelkn7ABC8oaeiashFdjv2aeDSG6nas1if4qwe35";
		
		// replaceAll is case sensitive
		// "." indicates all the characters in the character sequence, below will replace all the characters with Y
		System.out.println("\".\" indicates all the characters in the character sequence, below will replace all the characters with Y" + "\n" + alphaNumeric.replaceAll(".", "Y") + "\n");
		// "^" indicates sequence starts with the given sub sequence, so it will replace the starting sequence if matches.
		System.out.println("\"^\" indicates sequence starts with the given sub sequence, so it will replace the starting sequence if matches." + "\n" + alphaNumeric.replaceAll("^ajnl", "XXX") + "\n");
		// "[]" all the characters in the square brackets will be replaced.
		System.out.println("\"[]\" all the characters in the square brackets will be replaced." + "\n" + alphaNumeric.replaceAll("[ae]", "X") + "\n");
		// "[][]" it will replace all the combination that can be created by characters presents in both square brackets.
 		System.out.println("\"[][]\" it will replace all the combination that can be created by characters presents in both square brackets." + "\n" + alphaNumeric.replaceAll("[ae][sl]", "Z") + "\n");
 		// "[^]" will replace all other characters excepts present in the square brackets.
 		System.out.println("\"[^]\" will replace all other characters excepts present in the square brackets." + "\n" + alphaNumeric.replaceAll("[^ae]", "X") + "\n");
 		// "$" indicates that the sequence ends with the given sub sequence, will be replaced if matches in the end.
		System.out.println("\"$\" indicates that the sequence ends with the given sub sequence, will be replaced if matches in the end." + "\n" + alphaNumeric.replaceAll("fqw$", "THE END") + "\n");
		// "[a-f1-4]" indicates that all the characters between a to f and 1 to 4 inclusively will be replaced.
		System.out.println("\"(?i)[a-f1-4]\" is not case sensitive it will replace both lowercase anf uppercase." + "\n" + alphaNumeric.replaceAll("(?i)[a-f1-4]", "*") + "\n");
		// "\\d" will replace all the digits from sequence.
		System.out.println("\"\\\\d\" will replace all the digits from sequence." + "\n" + alphaNumeric.replaceAll("\\d", "Y") + "\n");		
		// "\\D" will replace all the non digits from sequence.
		System.out.println("\"\\\\D\" will replace all the non digits from sequence." + "\n" + alphaNumeric.replaceAll("\\D", "Y") + "\n");		
		// "\\s" will replace all spaces from the string.
		System.out.println("\"\\\\s\" will replace all spaces from the string." + "\n" + str.replaceAll("\\s", "") + "\n");		
		// "\\w" will replace every letter of the words in a string sequence with new sequence.
		System.out.println("\"\\\\w\" will replace every letter of the words in a string sequence with new sequence." + "\n" + str.replaceAll("\\w", "X") + "\n");		
		// "\\b" will surround each word in the string sequence with the given sequence, useful in  creating tags, or html.
		System.out.println("\"\\\\b\" will surround each word in the string sequence with the given sequence, useful in creating tags, or html." + "\n" + str.replaceAll("\\b", "<tag>") + "\n");		
		// "{n}" represents that the last character is repeated n times. in below it will replace a and two occurrence of e.
		String s = "aeeeeeeabbabbbaaaaa";
		System.out.println(s.replaceAll("^ae{2}","Y"));
		System.out.println(s.replaceAll("^ae{2,5}","Y")); // will replace sequence with 2 to 5 es'
		System.out.println(s.replaceAll("^ae+","Y")); // will replace sequence with all number of es' 
		System.out.println(s.replaceAll("^ae*","Y")); // will replace sequence with all number of es' 
		
		String email = "sankalpbhushan@gmail.com";
		String emailPattern = ".*@gmail.com";
		Pattern pattern = Pattern.compile(emailPattern);
		Matcher matcher = pattern.matcher(email);
		System.out.println("\n" + matcher.matches());
		//matcher class can be used only once, so to use it again we need to reset it.
		matcher.reset(); 
		int count = 0;
		// mathcer.find method will give you all the occurrences of the pattern
		while(matcher.find()) {
			count++;
			System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());
		}
		
		String html  = "<h1>Main Heading</h1><p>paragraph</p><h1>End Heading</h1>";
		String tagPattern = "(<h1>.*?</h1>)"; // "()" parenthesis are used to make regular expression a group.
		// ".*" will search in the complete string, even it gets it's first occurrence.
		// ".*?" will search, once it get the pattern, it will mark it complete then look for another.
		Pattern groupPattern = Pattern.compile(tagPattern);
		Matcher groupMatcher = groupPattern.matcher(html);
		System.out.println(groupMatcher.matches());
		
		groupMatcher.reset();

		while(groupMatcher.find()) {
			System.out.println("Occurence : " + groupMatcher.group(0));
		}
		
	}

}
