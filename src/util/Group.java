package util;

import java.util.ArrayList;
import java.util.Comparator;

public class Group {
    private ArrayList<Student> students;

    public Group() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
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

    public ArrayList<Student> getStudents() {
        return students;
    }
}
