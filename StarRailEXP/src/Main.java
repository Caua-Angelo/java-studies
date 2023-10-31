import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        int pequeno ;
        int médio ;
        int grande ;

        System.out.println("Quantas EXP pequenas você tem?");
        pequeno = Leitor.nextInt();
        if (pequeno % 20 == 0 ) {
            grande = pequeno * 20;
        }
        System.out.println("E quantas médias?");
        médio = Leitor.nextInt();
        grande = médio * 4;

        System.out.println("Você tem " + grande + " Do EXP GRANDE" );

    }
}