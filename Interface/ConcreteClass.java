package Interface;

public class ConcreteClass implements Interface{

	public static void main(String[] args) {
		Interface.staticMethod();
	}

	@Override
	public void method() {
		System.out.println("This need to be implemented.");
	}

	@Override
	public void defaultMethod() {
		Interface.super.defaultMethod();
	}

}
