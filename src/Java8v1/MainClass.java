package Java8v1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		
		List<Employee> e = EmployeeDataBase.getAllEmployees();
		//foreach
//		e.forEach(a-> System.out.print(a.getName()));
//		
//		e.stream().forEach(System.out::println) ;
		
		//filter
		List<Employee> employeeList =  e.stream().filter(a->a.getDept().equals("Development")).collect(Collectors.toList());
		Set<Employee> emp = e.stream().filter(a -> a.getSalary()>80000).collect(Collectors.toSet());
		
		Map<Integer, String> map = e.stream().filter(a->a.getDept().equals("Development")).collect(Collectors.toMap(Employee::getId, Employee::getName));
		//System.out.println(map);
		
		//map  -- if we want to extract single attribute from the list map will help and to get unique distinct()
		List<String> depts = e.stream().map(Employee::getDept).distinct().
				collect(Collectors.toList());
		//System.out.println(depts);
		
		//flatMap if we want to get nested class data
		
		List<String> fl = e.stream().flatMap(a->a.getProjects().stream()).map(p-> p.getName()).distinct().collect(Collectors.toList());
		//System.out.println(fl);
		
		
		//sorted
		//asc
		List<Employee> ascsorted =e.stream().sorted(Comparator.comparing(b -> b.getSalary())).collect(Collectors.toList());
		//ascsorted.forEach(System.out::println);
		//System.out.println(sorted);
		
		List<Employee> descSorted = e.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).collect(Collectors.toList());
//		System.out.println(descSorted);
//		descSorted.forEach(System.out::println);
		
		//min and max
		
		Optional<Employee> max= e.stream().max(Comparator.comparingDouble(Employee::getSalary));
		
		Optional<Employee> min= e.stream().min(Comparator.comparingDouble(Employee::getSalary));
		//System.out.println(min+ ","+ max);
		
		//groupingBy
		
		Map<String, List<Employee>> grp=  e.stream().collect(Collectors.groupingBy(Employee::getGender));
		System.out.println(grp);
		
		//Gender -> [name]
		Map<String, List<String>> grpByGender = e.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));
		
		Map<String, Long> empCount = e.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		Employee emp1= e.stream().filter(a->a.getDept().equals("Development")).findFirst().orElseThrow(()-> new IllegalArgumentException("Employee not found")); 
		
		Employee emp2= e.stream().filter(a->a.getDept()
				.equals("Development")).findAny()
				.orElseThrow(()-> new IllegalArgumentException("Employee not found"));
		
		
		boolean b= e.stream().anyMatch(a->a.getDept().equals("Development"));
		
		boolean b2= e.stream().allMatch(a->a.getSalary()>50000);
		
		boolean b3= e.stream().noneMatch(a->a.getDept().equals("abc"));
		
		//System.out.println(b3);
		
		List<Employee> topEmployee= e.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.limit(4)
				.collect(Collectors.toList());
		
		//topEmployee.stream().forEach(System.out::println);
		
		List<Employee> skipEmp= e.stream().skip(5).collect(Collectors.toList());
		System.out.println(skipEmp);
		
	}

}
