import javax.swing.JOptionPane;

public class Exercicio_08 {
    public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] R = new int[10];

        for (int i = 0; i < 5; i++) {
            A[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A[" + i + "]"));
            R[i] = A[i];
        }

        for (int i = 0; i < 5; i++) {
            B[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B[" + i + "]"));
            R[i + 5] = B[i];
        }

        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, "Valor R[" + i + "] = " + R[i]);
        }
    }
}
