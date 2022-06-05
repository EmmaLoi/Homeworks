package HW5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class University {

    public ArrayList<Student> getStudentsByFacultet(String facultet) {
        ArrayList<Student> students = new Generation().students();
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(facultet)) {
                result.add(student);
            }
        }
        return result;
    }

    public ArrayList<Student> getStudentsByFacultetAndCourse(String facultet, Integer course) {
        ArrayList<Student> students = new Generation().students();
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(facultet) && student.getCourse() == course) {
                result.add(student);
            }
        }
        return result;
    }

    public ArrayList<Student> getStudentsByGroup(String group) {
        ArrayList<Student> students = new Generation().students();
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                result.add(student);
            }
        }
        return result;
    }

    public ArrayList<Student> getStudentsByBirthYear(Integer year) {
        GregorianCalendar checkYear = new GregorianCalendar(year, 1, 1);
        ArrayList<Student> students = new Generation().students();
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getBirthDate().get(Calendar.YEAR) > checkYear.get(Calendar.YEAR)) {
                result.add(student);
            }
        }
        return result;
    }
}