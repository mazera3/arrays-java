/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas. Imprima as consoantes.
*/
package arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        /* abre o fluxo de entrada do teclado */
        try (Scanner scan = new Scanner(System.in)) {
            /* inicia um array de strings com o nome 'consoantes' com 6 posições */
            String[] consoantes = new String[6];
            int quantidadeConsoantes = 0;

            /* Laço while enquanto o contador for menor que 6 */
            int count = 0;
            do {
                System.out.println("Letra: ");
                /* entra pelo teclado com um caracter apenas e armazena na variável letra */
                String letra = scan.next();
                /*
                 * Testa se a variável `letra` não for uma consoante ignorando se é maíuscula ou
                 * minuscula e caso não seja, acrescenta no vetor consoantes[count] e incrementa
                 * a variável `quantidadeConsoantes`. Por fim incrementa a variável `count`.
                 */

                if (!letra.matches("[aeiouAEIOU]*")) {
                    consoantes[count] = letra.toLowerCase();
                    quantidadeConsoantes++;
                }

                /* if (!(letra.equalsIgnoreCase("a") |
                        letra.equalsIgnoreCase("e") |
                        letra.equalsIgnoreCase("i") |
                        letra.equalsIgnoreCase("o") |
                        letra.equalsIgnoreCase("u"))) {
                    consoantes[count] = letra;
                    quantidadeConsoantes++;
                } */

                count++;

            } while (count < consoantes.length);

            System.out.print("Consoantes: ");
            /* Para cada elemento dentro do array 'consoantes' imprima o elemento */
            for (String elemento : consoantes) {
                if (elemento != null)
                    System.out.print(elemento + " ");
            }
            System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
            System.out.println("Total de elementos: " + consoantes.length);
        }

    }
}
