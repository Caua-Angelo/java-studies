import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        int valor;
        String dia;

        System.out.println("Digite um número de 1 à 7");
        valor = Leitor.nextInt();
        switch (valor) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Invalido";
                break;

        }
        System.out.println("O dia de hoje é " + dia);

    }
}