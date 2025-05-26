package JavaStreamApis.models;

import java.util.List;

public class Employee {int id;
    String name;
    String department;
    double salary;
    List<String> skills;

    public Employee(int id, String name, String department, double salary, List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.skills = skills;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public List<String> getSkills() { return skills; }

    @Override
    public String toString() {
        return name + " (" + department + ", $" + salary + ")";
    }
}
