package AggregationPractice;

import java.util.ArrayList;

public class Library {
    String name;
    int campusID;
    ArrayList<Books> books;

    Library(String name, int campusID) {
        this.name = name;
        this.campusID = campusID;
        this.books = new ArrayList<>();
    }
}