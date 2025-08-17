package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int roll;
    String name, address;

    // Constructor
    public Student(int roll, String name, String address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    // toString method for better output
    public String toString() {
        return "Student[rollno: " + roll + ", name: " + name + ", address: " + address + "]";
    }

    // Static nested class for sorting by roll
    static class SortbyRoll implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return a.roll - b.roll;
        }
    }

    // Static nested class for sorting by name
    static class Sortbyname implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return a.name.compareTo(b.name);
        }
    }
}

public class TestSorting2 {

    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(222, "Raj", "Thane"));
        ar.add(new Student(111, "Jay", "Mumbai"));

        // Printing unsorted list
        System.out.println("Unsorted:");
        for (Student s : ar) {
            System.out.println(s);
        }

        // Sorting by roll
        Collections.sort(ar, new Student.SortbyRoll());

        // Printing list sorted by roll
        System.out.println("\nSorted by Roll:");
        for (Student s : ar) {
            System.out.println(s);
        }

        // Sorting by name
        Collections.sort(ar, new Student.Sortbyname());

        // Printing list sorted by name
        System.out.println("\nSorted by Name:");
        for (Student s : ar) {
            System.out.println(s);
        }
    }
}
