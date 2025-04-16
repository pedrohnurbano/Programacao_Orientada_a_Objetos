package Lista_Arrays;
import javax.swing.JOptionPane;

// Exercicio 06 - Ler 10 números inteiros e gerar um novo array com a soma dos elementos correspondentes de dois arrays.
// Faça um programa que leia dois arrays de 10 posições e armazene a soma dos elementos correspondentes em um terceiro array.

public class Exercicio_06 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        // Lendo os valores do array A
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o valor " + (i + 1) + " do array A:")
            );
        }

        // Lendo os valores do array B
        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o valor " + (i + 1) + " do array B:")
            );
        }

        // Gerando o array C como a soma de A e B
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Exibindo os valores do array C
        String resultado = "Valores do array C (A + B):\n";
        for (int i = 0; i < C.length; i++) {
            resultado += "C[" + i + "] = " + C[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}