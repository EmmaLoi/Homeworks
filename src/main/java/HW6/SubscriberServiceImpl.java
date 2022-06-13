package HW6;

import java.util.ArrayList;
import java.util.Objects;

public class SubscriberServiceImpl implements SubscriberService {
    ArrayList<Subscriber> subscriber;

    public SubscriberServiceImpl(ArrayList<Subscriber> subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public ArrayList<Subscriber> findLocalCallTimesMoreThan(int min) {
        ArrayList<Subscriber> result = new ArrayList<>();
        for (Subscriber subs : subscriber) {
            if (min > subs.getCallTimeInCity()) {
                result.add(subs);
            }
        }

        return result;
    }

    @Override
    public ArrayList<Subscriber> findIntercityCallers() {
        ArrayList<Subscriber> result = new ArrayList<>();
        for (Subscriber subs : subscriber) {
            if (subs.getCallTimeIntercity() > 0) {
                result.add(subs);
            }
        }

        return result;
    }

    @Override
    public ArrayList<Subscriber> findByFirstSurnameLetter(char firstSurnameLetter) {
        ArrayList<Subscriber> result = new ArrayList<>();
        for (Subscriber subs : subscriber) {
            char firstChar = subs.getSurname().charAt(0);
            if (firstChar == firstSurnameLetter) {
                result.add(subs);
            }
        }

        return result;
    }

    @Override
    public int sumTrafficByCity(String city) {
        int result = 0;
        for (Subscriber subs : subscriber) {

            if (Objects.equals(subs.getCity(), city)) {
                result += subs.getInternetTrafficGb();
            }
        }

        return result;
    }

    @Override
    public int countWithNegativeBalance() {
        int result = 0;
        for (Subscriber subs : subscriber) {
            if (subs.getBalance() < 0) {
                result++;
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "SubscriberServiceImpl{" +
                "subscriber=" + subscriber +
                '}';
    }
}
