import javax.swing.JOptionPane;

public class Exercicio_05 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1)));
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                JOptionPane.showMessageDialog(null, "Número negativo: " + numeros[i]);
            }
        }
    }
}
