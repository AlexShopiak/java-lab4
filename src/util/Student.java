package util;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int course;
    private int gpa;

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
