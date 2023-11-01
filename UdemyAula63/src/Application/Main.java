package Application;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double XA, XB, XC, YA, YB, YC;

        System.out.println("Enter the measures of the triangle X");
        XA = leitor.nextDouble();
        XB = leitor.nextDouble();
        XC = leitor.nextDouble();
        System.out.println("Enter the measures of the triangle Y");
        YA = leitor.nextDouble();
        YB = leitor.nextDouble();
        YC = leitor.nextDouble();

        double p = (XA + XB + XC) / 2.0;
        double areaX = Math.sqrt(p * (p - XA) * (p - XB) * (p - XC));

        p = (YA + YB + YC) / 2.0;
        double areaY = Math.sqrt(p * (p - YA) * (p - YB) * (p - YC));

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