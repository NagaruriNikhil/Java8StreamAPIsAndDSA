package JavaStreamApis;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionalDemo {
	
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hi Nikhil"; 
		System.out.println(supplier.get());
		
		 List<String> l= Arrays.asList();
		 System.out.println(l.stream().findAny().orElseGet(()-> "No data"));
		 

	}
	
}
