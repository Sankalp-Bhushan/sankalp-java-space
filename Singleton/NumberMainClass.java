package Singleton;
import java.util.*;

public class NumberMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberDataBase instance = NumberDataBase.getInstance();
		instance.saveNumber(3, 1);
		instance.printNumbers();
		sc.close();
	}
}