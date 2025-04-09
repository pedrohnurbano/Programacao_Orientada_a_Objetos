import javax.swing.JOptionPane;

public class Exercicio_07 {
    public static void main(String[] args) {
        int[] X = new int[5];
        int[] Y = new int[5];
        int[] R = new int[5];

        for (int i = 0; i < 5; i++) {
            X[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor X[" + i + "]"));
            Y[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor Y[" + i + "]"));
            R[i] = X[i] * Y[i];
        }

        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "Multiplicação R[" + i + "] = " + R[i]);
        }
    }
}
