package HW5;
import java.util.*;

public class Generation {
    public ArrayList<Student> students() {
        List<String> surname = Arrays.asList("Li", "Williams", "Peters", "Gibson", "Jordan");
        List<String> name = Arrays.asList("Thom", "Alisa", "Vanya", "Marya", "Patric", "Eva", "Jack");
        List<String> patronymic = Arrays.asList("Mikhaylovich", "Victorovich", "Valeryevich");
        List<GregorianCalendar> birthDate = Arrays.asList(
                new GregorianCalendar(1990, 11, 10),
                new GregorianCalendar(1978, 5, 28),
                new GregorianCalendar(1978, 3, 7),
                new GregorianCalendar(1998, 10, 15),
                new GregorianCalendar(2000, 7, 21),
                new GregorianCalendar(2004, 1, 22));
        List<String> address = Arrays.asList("Gagarina 5", "Peremoga 7", "Po-12");
        List<String> phoneNumber = Arrays.asList("0639564312", "0679564322", "0979515322", "0509467322", "0939515322");
        List<Integer> course = Arrays.asList(1, 2, 3, 4);
        List<String> faculty = Arrays.asList("IT", "Art");
        List<String> itGroup = Arrays.asList("DevOps", "PM", "Engineer", "QA");
        List<String> artGroup = Arrays.asList("Artist", "Sculptor", "Designer");

        ArrayList<Student> students = new ArrayList<>();

        for (double i = 0; i < 10; i++) {
            String grupyTmp;
            String facultyTmp = randomString(faculty);
            if ("IT".equals(facultyTmp)) {
                grupyTmp = randomString(itGroup);
            } else {
                grupyTmp = randomString(artGroup);
            }

            students.add(new Student(
                    this.randomString(surname),
                    this.randomString(name),
                    this.randomString(patronymic),
                    this.randomDate(birthDate),
                    this.randomString(address),
                    this.randomString(phoneNumber),
                    facultyTmp,
                    this.randomInt(course),
                    grupyTmp
            ));
        }

        return students;
    }

    private String randomString(List<String> list) {
        Random rand = new Random();

        return list.get(rand.nextInt(list.size()));
    }

    private Integer randomInt(List<Integer> list) {
        Random rand = new Random();

        return list.get(rand.nextInt(list.size()));
    }

    private GregorianCalendar randomDate(List<GregorianCalendar> list) {
        Random rand = new Random();

        return list.get(rand.nextInt(list.size()));
    }
}