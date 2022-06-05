package HW5;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new Generation().students();
        University university = new University();

        System.out.println("List of random students:" + students.toString());
        System.out.println(university.getStudentsByFacultet("Art"));
        System.out.println(university.getStudentsByFacultetAndCourse("IT", 2));
        System.out.println(university.getStudentsByGroup("QA"));
        System.out.println(university.getStudentsByBirthYear(2000));
    }
}