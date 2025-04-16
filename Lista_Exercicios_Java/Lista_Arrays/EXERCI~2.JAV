package Lista_Arrays;
import javax.swing.JOptionPane;

// Exercicio 02 - Ler 10 números inteiros positivos e determinar o maior e o menor número entre eles.
// Este programa lê 10 números inteiros positivos e determina o maior e o menor número entre eles.

public class Exercicio_02 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        // Lendo os números fornecidos pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o número " + (i + 1) + " (positivo):")
            );
        }
        
        // Determinando o maior e o menor número
        int maior = numeros[0];
        int menor = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        // Exibindo o maior e o menor número
        String resultado = "Números fornecidos:\n";
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + " ";
        }
        resultado += "\nMaior número: " + maior + "\nMenor número: " + menor;
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}