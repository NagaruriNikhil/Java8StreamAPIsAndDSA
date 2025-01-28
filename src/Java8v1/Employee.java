package Java8v1;

import java.util.List;

public class Employee {

    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", projects=" + projects + ", salary="
				+ salary + ", gender=" + gender + "]";
	}

	private int id;
    private String name;
    private String dept;
    private List<Project> projects;
    private double salary;
    private String gender;

    // No-args constructor
    public Employee() {
    }

    // All-args constructor
    public Employee(int id, String name, String dept, List<Project> projects, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.projects = projects;
        this.salary = salary;
        this.gender = gender;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Builder Pattern
    public static class Builder {
        private int id;
        private String name;
        private String dept;
        private List<Project> projects;
        private double salary;
        private String gender;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder dept(String dept) {
            this.dept = dept;
            return this;
        }

        public Builder projects(List<Project> projects) {
            this.projects = projects;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Employee build() {
            return new Employee(id, name, dept, projects, salary, gender);
        }
    }

    // Static method to initiate the builder
    public static Builder builder() {
        return new Builder();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example Project object (for testing)
        Project project1 = new Project("P001", "Project A", "Client X", "John Doe");
        Project project2 = new Project("P002", "Project B", "Client Y", "Jane Doe");

        Employee employee = Employee.builder()
                .id(101)
                .name("Alice")
                .dept("IT")
                .projects(List.of(project1, project2)) // Using List.of() to create a sample list
                .salary(75000)
                .gender("Female")
                .build();

        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDept());
        System.out.println("Projects: " + employee.getProjects());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Gender: " + employee.getGender());
    }
}

