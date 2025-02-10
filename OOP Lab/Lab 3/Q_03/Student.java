package Q_03;

import java.lang.reflect.Array; // todo:
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String name;
    String rollNo;
    String jobRequired;

    ArrayList<String> skills = new ArrayList<>();

    //Constructor
    Student(String name, String rollNo, String jobRequired, ArrayList<String> skills) {
        this.name = name;
        this.rollNo = rollNo;
        this.jobRequired = jobRequired;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.rollNo + ") {Skills: " + this.skills + "}";
    }
}