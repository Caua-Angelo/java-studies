package Application;
import java.util.Locale;
import java.util.Scanner;
import Entities.Triangle;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of the triangle X");
        x.a = leitor.nextDouble();
        x.b = leitor.nextDouble();
        x.c = leitor.nextDouble();
        System.out.println("Enter the measures of the triangle Y");
        y.a = leitor.nextDouble();
        y.b = leitor.nextDouble();
        y.c = leitor.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n ", areaX);
        System.out.printf("Triangle Y area: %.4f%n ", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        leitor.close();
    }
}