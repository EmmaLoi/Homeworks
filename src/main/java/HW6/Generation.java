package HW6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generation {
    public ArrayList<Subscriber> subscriber() {
        List<String> surname = Arrays.asList("Li", "Williams", "Peters", "Gibson", "Jordan");
        List<String> name = Arrays.asList("Thom", "Alisa", "Vanya", "Marya", "Patric", "Eva", "Jack");
        List<String> patronymic = Arrays.asList("Mikhaylovich", "Victorovich", "Valeryevich");
        List<String> city = Arrays.asList("Kyiv", "Lviv", "Mariupol");
        List<String> phoneNumber = Arrays.asList("0639564312", "0679564322", "0979515322", "0509467322", "0939515322");
        List<Integer> agreementNumber = Arrays.asList(100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110);
        List<Integer> balance = Arrays.asList(250, 70, -55, 0, -37, 550);
        List<Integer> callTimeCity = Arrays.asList(12, 15, 0, 7, 55, 100, 2, 250);
        List<Integer> callTimeIntercity = Arrays.asList(2, 10, 0, 47);
        List<Integer> internetTraffic = Arrays.asList(1, 8, 10, 50);

        ArrayList<Subscriber> subscribers = new ArrayList<>();
        for (double i = 0; i < 10; i++) {
            subscribers.add(new Subscriber(
                    this.randomString(surname),
                    this.randomString(name),
                    this.randomString(patronymic),
                    this.randomString(city),
                    this.randomString(phoneNumber),
                    this.randomInt(agreementNumber),
                    this.randomInt(balance),
                    this.randomInt(callTimeCity),
                    this.randomInt(callTimeIntercity),
                    this.randomInt(internetTraffic)
            ));
        }
        return subscribers;
    }

    private Integer randomInt(List<Integer> list) {
        Random rand = new Random();

        return list.get(rand.nextInt(list.size()));
    }

    private String randomString(List<String> list) {
        Random rand = new Random();

        return list.get(rand.nextInt(list.size()));
    }
}
