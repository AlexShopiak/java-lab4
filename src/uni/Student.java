/*
 * Student
 *
 * Version 1.0
 *
 * (c) 2023 Oleksii Shopiak
 * All rights reserved.
 *
 * Student class describes student object with id, name, surname, course and GPA
 */
package uni;

public class Student {
    private int    id;
    private String name;
    private String surname;
    private int    course;
    private int    gpa;

    public Student(int id, String name, String surname, int course, int gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    public int getGPA() {
        return gpa;
    }
}
