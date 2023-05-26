
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el valor de a: ");
        double a = input.nextDouble();

        System.out.println("Ingrese el valor de b: ");
        double b = input.nextDouble();

        System.out.println("Ingrese el valor de c: ");
        double c = input.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("La ecuación no tiene soluciones reales.");
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución única es x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
        }
    }
    
}
