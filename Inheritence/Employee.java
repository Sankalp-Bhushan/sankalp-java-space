package Inheritence;

public class Employee extends Person{
	private double salary;
	public void print1() {
		System.out.println("This is Employee1 Class");
		super.print1();
	}
	public String getter()
	{
		return super.getChange();
	}
	public void print2(String change[]) {
		change[0]="Employee2";
		System.out.println(change[0]+ " " +"This is Employee2 Class");
	}
}
