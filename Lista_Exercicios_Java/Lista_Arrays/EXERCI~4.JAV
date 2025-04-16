package Lista_Arrays;
import javax.swing.JOptionPane;

// Exercicio 04 - Faça um programa que leia 10 números inteiros e armazene-os em um vetor.
// Em seguida, mostre a quantidade de números pares e ímpares digitados.

public class Exercicio_04 {
    public static void main(String[] args) {
        int[] valores = new int[10];
        int pares = 0;
        int impares = 0;

        // Lendo os valores fornecidos pelo usuário
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":")
            );
            if (valores[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibindo os resultados
        String resultado = "Valores fornecidos:\n";
        for (int i = 0; i < valores.length; i++) {
            resultado += valores[i] + " ";
        }
        resultado += "\nQuantidade de números pares: " + pares;
        resultado += "\nQuantidade de números ímpares: " + impares;

        JOptionPane.showMessageDialog(null, resultado);
    }
}