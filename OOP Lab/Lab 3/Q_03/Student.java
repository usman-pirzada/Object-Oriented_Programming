package Q_03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String name;
    String jobRequired;

    ArrayList<String> skills = new ArrayList<>();

    //Constructor
    Student(String name, String jobRequired, ArrayList<String> skills) {
        this.name = name;
        this.jobRequired = jobRequired;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", jobRequired='" + jobRequired + '\'' +
                ", skills=" + skills +
                '}';
    }

    // Methods
    static void displayDetails(ArrayList<Student> students) {
        for(Object st: students) {
            System.out.println(st);
        }
    }
}