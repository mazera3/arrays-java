/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-100.
Pergunta: com não ter repetição de números?
Set<Integer> numeros = new HashSet<>();
*/
package arrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        /* Gera números aleatórioos */
        Random random = new Random();
        /* Cria um matriz chamada Matriz [][] multidimencional 4x4 */
        int[][] Matriz = new int[4][4];
        /* percorre o for de i igual a zero até o tamanho da matriz e incremente i */
        for (int i = 0; i < Matriz.length; i++) {
            /* percorre o for de j igual a zero até o tamanho da matriz[i] e incremente j */
            for (int j = 0; j < Matriz[i].length; j++) {
                /* para cada posição da matriz[i][j] insere um número aleatório de 0 a 9 */
                Matriz[i][j] = random.nextInt(100);
            }
        }
        /* Imprime a matriz 4x4 */
        System.out.println("Matriz: ");
        for (int[] linha : Matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
