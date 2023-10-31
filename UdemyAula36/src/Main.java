import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int valor1;
        System.out.println("Digite o primeiro valor");
        valor1 = Scan.nextInt();
        if (valor1 < 0){
            System.out.println("Negativo");
        }
        else{
            System.out.println("Positivo");
            Scan.close();
        }

    }
}