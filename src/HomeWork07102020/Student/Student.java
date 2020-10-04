package HomeWork07102020.Student;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirthday;
    private int course;

    public Student(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public static void printStudent(ArrayList<Student> students, int course) {
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name + " trained on the " + course + " course");
            }

        }
    }
}
