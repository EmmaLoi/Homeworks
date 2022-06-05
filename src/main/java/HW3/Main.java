package HW3;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.");
        odd();

        System.out.println("2. Дано число n при помощи цикла for посчитать факториал n!");
        System.out.println(factorial(12));

        System.out.println("3. Перепишите программы (1 и 2) с использованием цикла while.");
        oddWhile();
        System.out.println();
        factorialWhile(12);

        System.out.println("4. Перепишите программы (1 и 2) с использованием цикла do - while.");
        doWhileOdd(20);
        System.out.println();
        doWhileFactorial(12);

        System.out.println("5. Даны переменные x и n вычислить x^n.");
        exponentiation(2,8);

        System.out.println("6. Вывести 10 первых чисел последовательности 0, -5,-10,-15..");
        stepNumber();
        System.out.println();

        System.out.println("7. Необходимо вывести на экран таблицу умножения на Х (х любое число в диапазоне 0 .. 10)");
        multiplicationTable(8);

        System.out.println("8. Создайте массив, содержащий 10 первых нечетных чисел. " +
                "Выведете элементы массива на консоль в одну строку, разделяя запятой.");
        firstTenOdd();

        System.out.println("9. Дан массив размерности N, найти наименьший элемент массива и вывести на консоль " +
                "(массив заполнить случайными числами из диапазона 0 .. 100)");

        int[] results = new int[10];
        for (int i = 0; i < results.length; i++) {
            results[i] = (new Random()).nextInt(99);
        }
        getMin(results);

        System.out.println("10. В массиве из задания 9. найти наибольший элемент");
        getMax(results);

    }

    private static void getMax(int[] results) {
        int min = results[0];
        for (Integer result : results) {
            if (result > min) {
                min = result;
            }
        }
        System.out.println(min);
    }

    private static void getMin(int[] results) {
        int min = results[0];
        for (Integer result : results) {
            System.out.print(result + " ");
            if (result < min) {
                min = result;
            }
        }

        System.out.println("");
        System.out.println(min);
    }

    private static void firstTenOdd() {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
                result.add(i);
            }
            if (result.size() == 10) {
                break;
            }
        }

        System.out.println(result);
    }

    private static void multiplicationTable(int x) {
        if (x <= 10) {
            for (int i = 0; i <= x; i++) {
                System.out.printf("%s x %s = %s \n", i, x, i * x);
            }
        }
    }

    private static void stepNumber() {
        int step = 5;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 0){
                System.out.print(result + " ");
                continue;
            }
            System.out.print((result -= step) + " ");
        }
    }

    private static void exponentiation(int x, int n) {
        System.out.println(x ^ n);
    }

    private static void doWhileFactorial(int factorial) {
        int result = 1;
        do {
            if (factorial == 1) {
                break;
            }
            result *= factorial--;
        } while (true);

        System.out.println(result);
    }

    private static void doWhileOdd(int odd) {
        do {
            odd++;
            if (odd % 2 == 1) {
                System.out.print(odd + " ");
            }
        } while (odd <= 99);
    }

    private static void factorialWhile(int factorial) {
        int result = 1;
        while (true) {
            if (factorial == 1) {
                break;
            }
            result *= factorial--;
        }
        System.out.println(result);
    }

    private static void oddWhile() {
        int odd = 0;
        while (odd <= 99) {
            odd++;
            if (odd % 2 == 1) {
                System.out.print(odd + " ");
            }
        }
    }

    private static int factorial(int factorial) {
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }

        return result;
    }

    private static void odd() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
