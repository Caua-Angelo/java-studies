import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor;

        System.out.println("Digite um valor e veremos se ele é par ou impar");
        valor = leitor.nextInt();
        if (valor % 2 == 0){
            System.out.println("O número é PAR ");
    }
        else{
            System.out.println("O número é impar");
        }
}}