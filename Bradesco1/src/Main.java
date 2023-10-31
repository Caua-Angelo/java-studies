import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicação");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JLabel label = new JLabel("Digite seu número preferido");
        frame.add(label);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu número preferido");
        int numero1 = scanner.nextInt();
        System.out.printf("Seu numero preferido é %d%n ", numero1);
    }
}