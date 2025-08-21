package Abstraction;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import UserInputMethods.*;

public class MainClass {
	public static void main(String[] args) throws IOException {
//		SavingAccount sAcc = new SavingAccount("Sankalp Bhushan","8630765482",50000);
//		sAcc.withdraw(200);
//		sAcc.deposit(1000);
//		sAcc.getLoan();
		
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

		Reader read = new Reader();
		int i = read.nextInt();
		//String s = read.readLine();
		
		output.write(i);
		output.flush();
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
