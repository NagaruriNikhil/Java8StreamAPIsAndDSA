package PreFunctionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import Java8v1.Employee;

public class ConsumerDemo {

	public static void main(String[] args) {
//		Consumer<Integer> consume= t-> System.out.println("Printing "+t); 
//		consume.accept(3);
		
		List<Integer> list1= Arrays.asList(1,2,3,4,5);
		
		list1.stream().forEach(t -> System.out.println("Printing int"+ t));
	}
}
