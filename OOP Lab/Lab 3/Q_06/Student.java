package Q_06;

public class Student {
    String name;
    int age;
    String course;

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "\nMy name is "+ name + ". I'm " + age + " years old, and I am studying \"" + course + "\".";
    }
}