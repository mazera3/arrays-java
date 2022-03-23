/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
package arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = { -5, -6, 15, 50, 8, 4 };

        // mostra o tamanho do vetor
        /* System.out.println(vetor.length); */

        // imprime o vetor
        /*
         * enquanto o contador for menor que o tamanho do vetor imprime o valor na
         * posição vetor[count] e incrementa o count.
         */
        System.out.print("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        // imprime o vetor na ordem in versa
        /*
         * para i igual ao tamanho do vetor menos 1 , enquanto i maior ou igual a zero,
         * decrememnta i, imprime o valor na posição vetor[i] e decrementa o i.
         */
        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.print("\n");
    }
}