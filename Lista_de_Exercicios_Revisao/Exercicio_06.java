import javax.swing.JOptionPane;

public class Exercicio_06 {

    public static int[] lerArray(String nomeArray) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog(null,
                    "Digite o elemento " + (i + 1) + " do array " + nomeArray + ":");
            array[i] = Integer.parseInt(input);
        }
        return array;
    }

    public static int[] somarArrays(int[] A, int[] B) {
        int[] C = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }
        return C;
    }

    public static void main(String[] args) {
        int[] A = lerArray("A");
        int[] B = lerArray("B");

        int[] C = somarArrays(A, B);

        StringBuilder resultado = new StringBuilder("Os elementos do array C são:\n");
        for (int i = 0; i < C.length; i++) {
            resultado.append(C[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
