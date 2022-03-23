package interruptores;

public class Return {
    int x = 0;
    int y = 0;

    public static int soma(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 20; i = i + 5) {
            int A = soma(i, 10);
            System.out.println("Soma: " + A + "; i = " + i);
        }
    }

}
