import javax.swing.JOptionPane;

public class Exercicio_06 {
    public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] R = new int[5];

        for (int i = 0; i < 5; i++) {
            A[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A[" + i + "]"));
            B[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B[" + i + "]"));
            R[i] = A[i] + B[i];
        }

        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "Soma R[" + i + "] = " + R[i]);
        }
    }
}
