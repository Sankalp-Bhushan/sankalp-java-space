package FunctionalProgramming;
import java.util.*;
import java.util.function.Predicate;

public class PlayingWithOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = List.of("Apple","banana","mango");
		
		Predicate<? super String > predicate = fruit -> fruit.startsWith("b");
		//Optional is used to avoid problems faced due to NULL Pointer Exception
		Optional<String> optional = fruits.stream().filter(predicate).findFirst();
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
		//Optional can be created very easily
		Optional<String> fruit = Optional.of("Grapes");
		Optional<String> empty = Optional.empty();
		
	}
}
