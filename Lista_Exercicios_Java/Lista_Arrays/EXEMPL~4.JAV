package Lista_Arrays;

// Exemplo 04 - Multiplicação de uma matriz por um escalar
// Este programa multiplica cada elemento de uma matriz 3x3 por 3 e imprime a matriz resultante.

public class Exemplo_04 {
    public static void main(String args[]) {
        int a[][] = {{2, 3, 1}, {4, 5, 1}, {2, 4, 8}};
        int mult[][] = new int[3][3];
        int soma = 0;

        // Multiplicando os elementos da matriz 'a' por 3 e salvando em 'mult'
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                mult[i][j] = 3 * a[i][j];
            }
        }

        // Imprimindo a matriz original 'a'
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

        // Imprimindo a matriz resultante 'mult'
        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) {
                System.out.print(" " + mult[i][j]);
            }
            System.out.println();
        }
    }
}