import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.println("Digite seu primeiro valor");

        double entrada = Leitor.nextDouble();
        String intervalo = null;
        //entrada de 0 até 25//
        if (entrada >= 0 && entrada <= 25) {
            intervalo = "Intervalo [0,25] ";
        }
        //entrada de 25 até 50//
        else if (entrada >= 25 && entrada <= 50) {
            intervalo = "Intervalo [25,50] ";
        }
        //entrada de 50 até 75//
        else if (entrada >= 50 && entrada <= 75) {
            intervalo = "Intervalo [50,75] ";
        }
        //entrada de 75 até 100//
        else if (entrada >= 75 && entrada <= 100) {
            intervalo = "Intervalo [75,100]";
        }
        //fora do intervalo//
        else {
            intervalo = "Fora do intervalo";
        }
        System.out.println(intervalo);
        }

    }


