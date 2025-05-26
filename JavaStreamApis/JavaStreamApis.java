package JavaStreamApis;

import JavaStreamApis.models.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamApis {

	public static void main(String[] args) {

		List<Integer> a= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		List<Integer> b= Arrays.asList(123,54,2,6,32,1,4,2,445);

//		List<Integer> evens=  a.stream().filter(n->n%2==0).collect(Collectors.toList());
//
//		List<Integer> odds = a.stream().filter(n->n%2!=0).collect(Collectors.toList());
//
////		List<Integer> squares = a.stream().map(n->{int b=n*n; b++ ;return b;}).collect(Collectors.toList());
//
//		List<Integer> sub = a.stream().map(c->{
//			int diff=c*c-c;
//			return diff;
//		}).toList();
//		int sum= a.stream().reduce(0,Integer::sum);//how??
//
//		List<Integer> sorted = b.stream().sorted().toList();
//
//		int max= b.stream().max(Integer::compare).get();//how??
//
		List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 30));
//
////		Map<String,List<Person>> groupByAge= people.stream().collect(Collectors.groupingBy(p->p.age));
////
//		Map<String,List<Person>> groupByAge = people.stream().collect(Collectors.groupingBy(p->p.name));
//
//		Map<Integer, Long> count = b.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
//
//		List<List<Integer>> lists= Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6));
//		List<Integer> listoflist= lists.stream().flatMap(List::stream).toList(); //how??
//
//		List<String> strs= Arrays.asList("Nikhil","Kumar","Nagaruri");
//		String name= strs.stream().collect(Collectors.joining(" "));
//
//		int s= b.stream().reduce(Integer::sum).get();
//		int m = b.stream().max(Integer::compare).get();
//
//		boolean bool= b.stream().anyMatch(n->n>100);
//
//		bool= b.stream().allMatch(n->n>0);
//		bool = b.stream().noneMatch(n->n<0);
//
//		List<Integer> three= b.stream().limit(3).toList();
//
//		List<Integer> skip= b.stream().skip(2).toList();
//
		List<Integer> combined= Stream.concat(a.stream(),b.stream()).toList();
//
//		List<Integer> duplicates= combined.stream().distinct().sorted().toList();
//
//		int sumOfSquares = b.stream().map(n->n*2).reduce(0,Integer::sum);
//
//		Set<Integer> set= b.stream().collect(Collectors.toSet());

		List<Integer> parllel = combined.parallelStream().filter(n->n%2==0).collect(Collectors.toList());

		List<Person> p= people.stream().filter(user-> "ADMIN".equals(user.getName())).collect(Collectors.toList());

		List<String> str= people.parallelStream()
				.filter(user-> "ADMIN".equals(user.getName()))
				.map(Person::getName)
				.collect(Collectors.toList());

		str= people.stream()
						.filter(c->"USER".equals(c.getName()))
								.map(Person::getName)
										.collect(Collectors.toList());

		System.out.println(parllel);


	}

	public List<Person> getPaginationProducts(List<Person> per, int page,int size){
		return per.stream()
				.sorted(Comparator.comparing(Person::getAge))
				.skip((page-1)*size)
				.limit(size)
				.collect(Collectors.toList());
	}

	public double getTotalSales(List<Person> p){
		return p.stream().mapToInt(Person::getAge).sum();
	}
	public Map<String,Long> countByName(List<Person> per){
		return per.stream().collect(Collectors.groupingBy(Person::getName,Collectors.counting()));
	}
	List<List<String>> categories = Arrays.asList(
			Arrays.asList("Electronics", "Mobiles"),
			Arrays.asList("Clothing", "Shoes"),
			Arrays.asList("Books", "Fiction")
	);
	List<String> lis= categories.stream().flatMap(List::stream).collect(Collectors.toList());


}
