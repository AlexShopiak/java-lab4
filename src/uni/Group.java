/*
 * Group
 *
 * Version 1.0
 *
 * (c) 2023 Oleksii Shopiak
 * All rights reserved.
 *
 * Group class contains Students array and methods for operating the group.
 */
package uni;

import java.util.ArrayList;
import java.util.Comparator;

public class Group {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(int id, String name, String surname, int course, int gpa) {
        students.add(new Student(id, name, surname, course, gpa));
    }

    public void sortByIdAscending() {
        if (students.size() > 1) {
            students.sort(new Comparator<Student>() {
                @Override
                public int compare(Student student1, Student student2) {
                    return Integer.compare(student1.getId(), student2.getId());
                }
            });
        }
    }

    public void sortByNameDescending() {
        if (students.size() > 1) {
            students.sort(new Comparator<Student>() {
                @Override
                public int compare(Student student1, Student student2) {
                    return student2.getName().compareTo(student1.getName());
                }
            });
        }
    }

    public void printTable(String title) {
        Printer.printStudentsTable(title, students);
    }
}
