package HW5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

public class Student {
    private UUID id;
    private String surname;
    private String name;
    private String patronymic;
    private GregorianCalendar birthDate;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student(String surname, String name, String patronymic, GregorianCalendar birthDate, String address, String phoneNumber, String faculty, int course, String group) {
        this.id = UUID.randomUUID();
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public GregorianCalendar getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return " Student {" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate=" + birthDate.get(Calendar.DATE) + "." + birthDate.get(Calendar.MONTH) + "." + birthDate.get(Calendar.YEAR) +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}'+ System.lineSeparator();
    }
}