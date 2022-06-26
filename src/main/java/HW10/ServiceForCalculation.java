package HW10;

public class ServiceForCalculation {
    public static void calculateRootsOfQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Equation roots: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("The equation has only one root: x = " + x);
        } else {
            System.out.println("The equation hasn't roots");
        }
    }
}
