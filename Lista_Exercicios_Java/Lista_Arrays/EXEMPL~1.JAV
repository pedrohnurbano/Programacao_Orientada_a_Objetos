package Lista_Arrays;

// Exemplo 01 - Soma dos elementos de um array
// Este programa lê 10 números inteiros e calcula a soma deles.

public class Exemplo_01 {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int soma = 0;

        for (int i = 0; i < a.length; i++) {
            soma += a[i];
        }

        System.out.println("Soma dos elementos: " + soma);
    }
}