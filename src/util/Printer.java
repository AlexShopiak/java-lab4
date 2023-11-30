package util;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Printer {
    public static void printStudentsTable(String title, ArrayList<Student> students) {
        System.out.println();
        printTitle(title);

        if (students.size() == 0) {
            printEmptyTable();
        } else {
            //Extract headers
            String[] headers = extractHeaders();

            //Print headers
            printSeparator(headers.length);
            printRow(headers);
            printSeparator(headers.length);

            //Print data
            for (Student student : students) {
                String[] values = {
                    String.valueOf(student.getId()),
                    student.getName(),
                    student.getSurname(),
                    String.valueOf(student.getCourse()),
                    String.valueOf(student.getGPA()),
                };

                printRow(values);
            }
            printSeparator(headers.length);
        }

        System.out.println();
    }

    private static void printEmptyTable() {
        printSeparator(2);
        printRow(new String[] {"Empty", "table"});
        printSeparator(2);
        printRow(new String[] {"", ""});
        printSeparator(2);
    }

    private static void printTitle(String title) {
        System.out.println("\u001B[1m" + title + "\u001B[0m");
    }

    private static void printRow(String[] values) {
        for (String value : values) {
            System.out.print(String.format("| %-10s ", value));
        }
        System.out.println("|");
    }

    private static void printSeparator(int numColumns) {
        for (int i = 0; i < numColumns; i++) {
            System.out.print("+------------");
        }
        System.out.println("+");
    }

    private static String[] extractHeaders() {
        Class<Student> studentClass = Student.class;
        Field[] fields = studentClass.getDeclaredFields();
        String[] headers = new String[fields.length];
        
        for (int i = 0; i < fields.length; i++) {
            headers[i] = fields[i].getName();
        } 

        return headers;
    }
}
