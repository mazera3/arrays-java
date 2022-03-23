package arrays;

public class Tipos {
    public static void main(String[] args) {
        System.out.print("Método 1: ");
        int[] idades = new int[] { 3, 5, 9, 12, 57, 81 };
        for (int idade : idades) {
            System.out.print(idade + " ");
        }
        System.out.print("\nMétodo 2: ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.print("\n");
    }
}
