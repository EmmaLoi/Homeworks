package HW6;

import java.util.UUID;

public class Subscriber {
    private UUID id;
    private String surname;
    private String name;
    private String patronymic;
    private String city;
    private String phoneNumber;
    private int agreementNumber;
    private int balance;
    private int callTimeInCity;
    private int callTimeIntercity;
    private int internetTrafficGb;

    public Subscriber(String surname, String name, String patronymic, String city, String phoneNumber,
                      int agreementNumber, int balance, int callTimeCity, int callTimeIntercity, int internetTraffic) {
        this.id = UUID.randomUUID();
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.agreementNumber = agreementNumber;
        this.balance = balance;
        this.callTimeInCity = callTimeCity;
        this.callTimeIntercity = callTimeIntercity;
        this.internetTrafficGb = internetTraffic;
    }

    public int getCallTimeInCity() {
        return callTimeInCity;
    }

    public int getCallTimeIntercity() {
        return callTimeIntercity;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public int getInternetTrafficGb() {
        return internetTrafficGb;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", balance=" + balance +
                '}' + System.lineSeparator();
    }
}
