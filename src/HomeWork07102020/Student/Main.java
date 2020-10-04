package HomeWork07102020.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        Student student1;
        students.add(student1 = new Student("Maxim", "Akrakov", "20.01.2000", 1));

        Student student2;
        students.add(student1 = new Student("Valera", "Nemcov", "11.05.1999", 2));

        Student student3;
        students.add(student1 = new Student("Andrei", "Kravec", "23.03.1999", 2));

        Student student4;
        students.add(student1 = new Student("Nikita", "Kosmachev", "23.03.1998", 3));

        System.out.println("Enter the course: ");
        Student.printStudent(students, in.nextInt());

    }
}
