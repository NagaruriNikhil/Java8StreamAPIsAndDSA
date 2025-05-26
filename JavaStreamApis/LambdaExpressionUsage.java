package JavaStreamApis;

import JavaStreamApis.models.Person;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaExpressionUsage {

public static void main(String[] args) {
    List<Integer> a = Arrays.asList(10,15,15,8,49,25,98,32);

    List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 30));

    List<Integer> even = a.stream().filter(i -> i % 2 == 0).peek(z-> System.out.println(z)).collect(Collectors.toList());

    List<String> names = people.stream()
            .map(Person::getName)
            .collect(Collectors.toList());


    Map<String, Long> m = people.stream()
            .collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
    System.out.println(m);
    Map<Integer, List<Person>> m2 = people.stream()
            .collect(Collectors.groupingBy(Person::getAge));
    System.out.println(m2);

    a.stream()
            .map(s->s+"")
            .filter(s->s.startsWith("1"))
            .forEach(System.out::println)
            ;
    HashSet<Integer> hs= new HashSet<>();
    a.stream()
            .filter(p-> !hs.add(p))
            .forEach(System.out::println);

    String input = "Java articles are Awesome";
    input.chars().mapToObj(ch->(char) ch).
            filter(c-> input.indexOf(c)== input.lastIndexOf(c))
                    .findFirst().ifPresent(System.out::println);
    Set<Character> set= new HashSet<>();

    input.chars().mapToObj(c->(char) c).filter(v-> !set.add(v)).findFirst().ifPresent(System.out::println);
    a.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);




}

}
