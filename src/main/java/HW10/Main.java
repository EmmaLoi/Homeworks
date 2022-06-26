package HW10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Example1");
        list.add("Example2");
        list.add("Example3");
        list.add("Example4");
        list.add("Example1");
        list.add("Example4");

        for(String s :list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Collection without duplicates: " + Collection.getUnique(list));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        ServiceForCalculation.calculateRootsOfQuadraticEquation(a, b, c);

    }
}
