package JavaStreamApis;


import JavaStreamApis.models.*;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApis {
    public static void main(String[] args){

        List<Employee> employees= getEmployees();
        List<User> users = getUsers();
        List<Order> orders= getOrders();
        List<Product> products = getProducts();

        List<String> highEarners = employees.stream()
                .filter(e->e.getSalary()>100000)
                .map(Employee::getName)
                .toList();
        highEarners.forEach(System.out::println);

        List<UserDTO> userDTOs= users.stream()
                .map(user-> new UserDTO(user.getId(), user.getName()))
                .toList();
        userDTOs.forEach(System.out::println);

        List<String> ordersSorted = orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .map(Order::getStatus)
                .toList();
        ordersSorted.forEach(System.out::println);

        long activeUserCount = users.stream()
                .filter(User::isActive)
                .count();
        System.out.println("Active User Count"+activeUserCount);

        List<Product> SkippedProducts= products.stream()
                .skip(2)
                .limit(4)
                .toList();
        SkippedProducts.forEach(System.out::println);

        boolean isInStock = products.stream()
                .anyMatch(Product::isInStock);

        Optional<Employee> maxEmp= employees.stream()
                .max(Comparator.comparing(e->e.getName().length()));

        List<Employee> sortedEmp = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .toList();
        Map<String, Long> depCount= employees.stream()
                .collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
        System.out.println(depCount);

        Map<String, Double> avgSalary= employees.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalary);
        boolean salaryGreater = employees.stream()
                .allMatch(e->e.getSalary()>100000);
        System.out.println(salaryGreater);

        Set<String> allSkills = employees.stream()
                .flatMap(e->e.getSkills().stream())
                .collect(Collectors.toSet());
        allSkills.forEach(System.out::println);


    }
    // Sample Data Providers
    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Alice", "Engineering", 120000, Arrays.asList("Java", "Spring")),
                new Employee(2, "Bob", "HR", 80000, Arrays.asList("Recruitment")),
                new Employee(3, "Charlie", "Engineering", 110000, Arrays.asList("Java", "Docker")),
                new Employee(4, "Diana", "Sales", 95000, Arrays.asList("Negotiation", "Communication")),
                new Employee(5, "Eve", "Engineering", 105000, Arrays.asList("Kotlin", "Spring")),
                new Employee(6, "Frank", "Sales", 99000, Arrays.asList("Communication"))
        );
    }

    private static List<User> getUsers() {
        return Arrays.asList(
                new User(1, "John", true),
                new User(2, "Jane", false),
                new User(3, "Jake", true)
        );
    }

    private static List<Order> getOrders() {
        return Arrays.asList(
                new Order(1, "CONFIRMED", new Date(System.currentTimeMillis() - 100000)),
                new Order(2, "DELIVERED", new Date(System.currentTimeMillis() - 50000)),
                new Order(3, "CANCELLED", new Date(System.currentTimeMillis()))
        );
    }

    private static List<Product> getProducts() {
        return Arrays.asList(
                new Product(1, "Laptop", 1200, true),
                new Product(2, "Mouse", 25, true),
                new Product(3, "Keyboard", 70, false),
                new Product(4, "Laptop", 120, true),
                new Product(5, "Mouse", 256, true),
                new Product(6, "Keyboard", 770, false),
                new Product(7, "Laptop", 1260, true),
                new Product(8, "Mouse", 250, true),
                new Product(9, "Keyboard", 670, false)
        );
    }

    private static List<Student> getStudents() {
        return Arrays.asList(
                new Student(1, "Ram", 80),
                new Student(2, "Shyam", 30),
                new Student(3, "Mohan", 60)
        );
    }

}
