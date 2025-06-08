package Lambdas;

public class Main {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("Printing from Runnable...")).start();

		String sillyString = doStringStuff(new UpperConcat() {

			@Override
			public String upperAndConcat(String s1, String s2) {
				return s1.toUpperCase() + " " + s2.toUpperCase();
			}

		}, "Sankalp", "Bhushan");

		System.out.println(sillyString);

		String sillyStringLambda = doStringStuff((s1, s2) -> {
			return s1.toUpperCase() + " " + s2.toUpperCase();
		}, "Sankalp", "Bhushan");

		System.out.println(sillyStringLambda + " Using Lambda.");
		
		UpperConcat uc = (s1, s2) -> s1.toUpperCase() + " " + s2.toUpperCase();
		
		String sillyStringLambdaAsVariable = doStringStuff(uc, "Sankalp", "Bhushan");	
		System.out.println(sillyStringLambdaAsVariable + " Using Lambda Variable.");
	}

	public final static String doStringStuff(UpperConcat up, String s1, String s2) {
		return up.upperAndConcat(s1, s2);
	}

}

interface UpperConcat {
	public String upperAndConcat(String s1, String s2);
}
