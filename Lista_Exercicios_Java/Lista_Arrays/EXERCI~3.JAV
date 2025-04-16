package Lista_Arrays;
import javax.swing.JOptionPane;

// Exercicio 03 - Faça um programa que leia 10 números inteiros e armazene-os em um vetor.
// Em seguida, mostre a quantidade de números positivos e negativos digitados.

public class Exercicio_03 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int positivos = 0;
        int negativos = 0;

        // Lendo os valores fornecidos pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o número " + (i + 1) + " (positivo ou negativo):")
            );
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            }
        }

        // Exibindo os resultados
        String resultado = "Números fornecidos:\n";
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + " ";
        }
        resultado += "\nQuantidade de números positivos: " + positivos;
        resultado += "\nQuantidade de números negativos: " + negativos;

        JOptionPane.showMessageDialog(null, resultado);
    }
}