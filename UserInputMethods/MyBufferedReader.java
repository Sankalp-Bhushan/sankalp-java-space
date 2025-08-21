package UserInputMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

// Fast way to take input from user
public class MyBufferedReader extends BufferedReader {

	public MyBufferedReader(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	public int nextInt() throws NumberFormatException, IOException {
		return Integer.parseInt(super.readLine());
	}

	public String nextLine() throws NumberFormatException, IOException {
		return super.readLine();
	}

	public boolean nextBoolean() throws NumberFormatException, IOException {
		String str = super.readLine();
		return str.equals("True") || str.equals("true");
	}

	public long nextLong() throws NumberFormatException, IOException {
		return Long.parseLong(super.readLine());
	}

	public char nextChar() throws NumberFormatException, IOException {
		return super.readLine().charAt(0);
	}

}
