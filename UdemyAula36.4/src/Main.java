import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int duracao;

        System.out.println("Digite a hora Inicial,e após isso,a hora Final");

        int horaInicial = leitor.nextInt();
        int horaFinal = leitor.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
              duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O seu jogo durou " + duracao + " Hora(S)");

        leitor.close();
    }
}