package HW6;

public class Main {
    public static void main(String[] args) {
        SubscriberServiceImpl subscriber = new SubscriberServiceImpl((new Generation()).subscriber());

        System.out.println("Users that has intercity calls: " + subscriber.findIntercityCallers());
        System.out.println("Count of users that have negative balance is " + subscriber.countWithNegativeBalance());
        System.out.println("Users with first surname letter from parametr: " + subscriber.findByFirstSurnameLetter('J'));
        System.out.println("Traffic by entering city: " + subscriber.sumTrafficByCity("Kyiv"));
        System.out.println("Local time more than entering parametr: " + subscriber.findLocalCallTimesMoreThan(2));
    }
}
