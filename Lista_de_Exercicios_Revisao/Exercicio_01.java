import javax.swing.JOptionPane;

public class Exercicio_01 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        String[] cargos = new String[3];
        double[] salarios = new double[3];

        for (int i = 0; i < 3; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do funcionário " + (i + 1));
            cargos[i] = JOptionPane.showInputDialog("Digite o cargo do funcionário " + (i + 1));
            salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário " + (i + 1)));
        }

        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "Funcionário: " + nomes[i] + "\nCargo: " + cargos[i] + "\nSalário: R$ " + salarios[i]);
        }
    }
}