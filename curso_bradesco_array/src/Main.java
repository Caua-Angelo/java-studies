import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        String[] paises = {"BRASIL", "RÚSSIA", "INDIA", "CHINA"};

        System.out.println(paises[0]);
        System.out.println(Arrays.toString(paises));

        int posicao = Arrays.binarySearch(paises, "BRASIL");
        System.out.println(posicao);

        Arrays.sort(paises, 0, paises.length);
        System.out.println(Arrays.toString(paises));
    }
}