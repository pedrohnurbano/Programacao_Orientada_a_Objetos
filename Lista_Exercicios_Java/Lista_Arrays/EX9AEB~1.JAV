package Lista_Arrays;
import javax.swing.JOptionPane;

// Exercicio 09 - Faça um programa que leia 10 números inteiros e armazene-os em um vetor.
// Em seguida, copie os valores desse vetor para outro vetor e mostre os valores do segundo vetor.

public class Exercicio_09 {
    public static void main(String[] args) {
        // Declarando e preenchendo o array 'numeros'
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":")
            );
        }

        // Criando o array 'copia' com o mesmo tamanho de 'numeros'
        int[] copia = new int[numeros.length];

        // Copiando os valores do array 'numeros' para o array 'copia'
        System.arraycopy(numeros, 0, copia, 0, numeros.length);

        // Exibindo os valores do array 'copia'
        String resultado = "Valores do array 'copia':\n";
        for (int i = 0; i < copia.length; i++) {
            resultado += "copia[" + i + "] = " + copia[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}