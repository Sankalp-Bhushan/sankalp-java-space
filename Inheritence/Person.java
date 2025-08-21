package Inheritence;

public class Person extends AbstractClass{
	protected int id;
	protected String name, email, phone;
	private String change[];
	Person()
	{
		change=new String[5];
		change[0] = "AA";
	}
	
	public String getChange() {
		return change[0];
	}

	public void print1() {
		System.out.println("This is Person 1 Class");
		print2(change);
	}
	public void print2(String change[]) {
		change[0]="Person2";
		System.out.println("This is Person 2 Class");
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("This is method 1 of the Class AbstractClass.");
		
	}

	@Override
	public void method2() {
		System.out.println("This is method 2 of the Class AbstractClass.");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("This is method 3 of the Class AbstractClass.");
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("This is method 4 of the Class AbstractClass.");
		
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		System.out.println("This is method 5 of the Class AbstractClass.");
		
	}
	
}
