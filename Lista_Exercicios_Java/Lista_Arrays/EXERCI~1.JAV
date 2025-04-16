package Lista_Arrays;
import javax.swing.JOptionPane;

// Exercicio 01 - Ler as temperaturas de cada dia do ano e armazená-las em um vetor.
// O programa deve solicitar ao usuário que insira a temperatura de cada dia e, em seguida, exibir todas as temperaturas registradas.

public class Exercicio_01 {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];
        
        // Lendo as temperaturas para cada dia do ano
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a temperatura do dia " + (i + 1) + ":")
            );
        }
        
        // Exibindo as temperaturas registradas
        String resultado = "Temperaturas registradas:\n";
        for (int i = 0; i < temperaturas.length; i++) {
            resultado += "Dia " + (i + 1) + ": " + temperaturas[i] + "°C\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}