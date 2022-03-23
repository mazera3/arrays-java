package interruptores;

public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.print(i + " ");
            if (i == 8) {
                break;
            }
            i++;
        }
        System.out.print("\n");
    }
}
