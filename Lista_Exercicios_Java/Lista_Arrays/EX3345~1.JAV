package Lista_Arrays;
import javax.swing.JOptionPane;

// Exercicio 05 - Ler 10 números inteiros e determinar o maior número entre eles.
// Este programa lê 10 números inteiros e determina o maior número entre eles.

public class Exercicio_05 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        // Lendo os números fornecidos pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":")
            );
        }

        // Chamando o método para encontrar o maior número
        int maior = encontrarMaior(numeros);

        // Exibindo o maior número
        JOptionPane.showMessageDialog(null, "O maior número do array é: " + maior);
    }

    // Método para encontrar o maior número em um array
    public static int encontrarMaior(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
}