package JavaStreamApis;

import java.util.Arrays;
import java.util.List;

public class PredicateFunctionalDemo {

	public static void main(String[] args) {
//		Predicate<Integer> pred= t-> t%2==0;
//		System.out.println( pred.test(4));
//		
		List<Integer> list= Arrays.asList(1,5,4,6,3,67);
		
		list.stream().filter(t-> t%2==0).forEach(t-> System.out.println("Print Even "+ t));
	}
}
