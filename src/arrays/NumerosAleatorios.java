/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
package arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        /* Gera números aleatórioos */
        Random random = new Random();
        /* cria array com 20 posições de inteiros */
        int[] numerosAleatorios = new int[20];
        /*
         * percorre o for de zero até 19 gerando 20 números entre zero e 100 e
         * adicionando em um array: numerosAleatorios[i]
         */
        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        /* Imprime o array. Para cada numero do array, no for, impreime este numero. */
        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        /* Imprime o antecessor: numero - 1 */
        System.out.print("\nAntecessore: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
        }
        /* Imprime o sucecessor: numero + 1 */
        System.out.print("\nSucessores: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
        /* pula uma linha */
        System.out.print("\n");
    }
}
