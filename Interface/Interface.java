package Interface;

public interface Interface {
	
	static void staticMethod() {
		System.out.println("This is a static method and cannot be overidden");
	}
	
	default void defaultMethod() {
		System.out.println("This is the dafault method, can be overidden.");
	}
	
	void method();

}
