package Inheritence;

public class MainClass{
	public static void main(String[] args) {
		Employee emp = new Employee();
		Person person = new Person();
		person.method1();
		person.method2();
		person.method3();
		person.method4();
		person.method5();
		AbstractClass.printSum();
//		emp.print1();
//		System.out.println(emp.getter());
//		System.out.println(emp.getChange());
		
		System.out.println("................................");
		
	}
}
