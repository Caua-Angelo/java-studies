public class Main {
    public static void main(String[] args) {
        String str = "a";

        for(int i = 1; i <= 2; i++){
            str = str + str + i;
            System.out.println(str);
        }

    }
}