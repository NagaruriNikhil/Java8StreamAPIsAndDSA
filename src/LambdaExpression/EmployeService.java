//package LambdaExpression;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//import Java8v1.Employee;
//import Java8v1.EmployeeDataBase;
//
//public class EmployeService {
//	//usage of lambda expression for functional interface
//
//	public List<Employee> getEmploye(){
//		List<Employee> emp= new EmployeeDataBase().getAllEmployees();
//
////		Collections.sort(emp, new Comparator<Employee>() {
////			public int compare(Employee o1, Employee o2) {
////				return o2.getName().compareTo(o1.getName());
////			};
////		});
////
//		Collections.sort(emp, (a,b)-> b.getName().compareTo(a.getName()));
//		return emp;
//	}
//
//	public static void main(String[] args) {
//		System.out.println(new EmployeService().getEmploye());
//	}
//}
