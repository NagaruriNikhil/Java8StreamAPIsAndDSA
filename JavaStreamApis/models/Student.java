package JavaStreamApis.models;

public class Student {
    public int id;
    public String name;
    public int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return name + "(" + marks + ")";
    }
}
