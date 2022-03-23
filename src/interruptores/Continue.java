/* Faça um for de 1 até 14 , sendo que somente multiplos de 2 sejam  listados. Entretanto o 12 deve ser abortado */
package interruptores;

public class Continue {
    public static void main(String[] args) throws Exception {
        System.out.println("For de 1 a 14, menos o 12!");

        for (int i = 1; i <= 14; i++) {
            if (i % 2 == 0) {
                if (i == 12) {
                    continue;
                }
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }
}
