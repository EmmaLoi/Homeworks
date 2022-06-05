package HW4;

import java.util.Arrays;
import java.util.List;

public class Route {
    public static void main(String[] args) {
        double distance = 476;
        double start = 0;
        double zhashkov = 150;
        double krivoyeOzero = 302;

        List<Double> pitStop = Arrays.asList(start, krivoyeOzero, zhashkov);

        Car car = new Car(50, 7.2);
        double gasPrice = 50;
        double recipe = 0;

        for (double kilometr = 0; kilometr <= distance; kilometr++) {
            if (pitStop.contains(kilometr)) {
                recipe += gasPrice * car.getToUpdateBalance();
                System.out.printf("Top up gas: %.2f ", car.getToUpdateBalance());
                System.out.printf("Refueling cost: %.2f \n", gasPrice * car.getToUpdateBalance());

                car.updateBalance();
            }
            car.drive();
        }

        System.out.printf("Full refueling cost: %.2f ", recipe);
        System.out.printf("Gas residue: %.2f", car.getGasBalance());
    }
}