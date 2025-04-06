import javax.swing.JOptionPane;

public class Exercicio_01 {
    public static void main(String[] args) {
        // Criar um array para armazenar 10 temperaturas
        double[] temperaturas = new double[10];

        // Armazenar as temperaturas no array usando JOptionPane
        for (int i = 0; i < 10; i++) {
            String entrada = JOptionPane.showInputDialog("Digite a Temperatura para o dia " + (i + 1) + ": ");
            temperaturas[i] = Double.parseDouble(entrada);  
        }

        // Exibindo as temperaturas digitadas com JOptionPane
        StringBuilder resultado = new StringBuilder("Temperaturas Registradas:\n");
        for (int i = 0; i < 10; i++) {
            resultado.append("Dia " + (i + 1) + ": " + temperaturas[i] + "°C\n");
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}