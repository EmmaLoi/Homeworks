package HW6;

import java.util.ArrayList;

public interface SubscriberService {

    ArrayList<Subscriber> findLocalCallTimesMoreThan(int min);

    ArrayList<Subscriber> findIntercityCallers();

    ArrayList<Subscriber> findByFirstSurnameLetter(char firstSurnameLetter);

    int sumTrafficByCity(String city);

    int countWithNegativeBalance();
}
