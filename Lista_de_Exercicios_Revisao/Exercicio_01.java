import javax.swing.JOptionPane;

public class Exercicio_01 {
    public static void main(String[] args) {
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de funcionários que deseja cadastrar: "));

        String[] nomes    = new String[quantidade]; // Nova Array que receberá NOMES (String), repetição de acordo com o informado
        String[] cargos   = new String[quantidade]; // Nova Array que receberá CARGOS (String), repetição de acordo com o informado
        double[] salarios = new double[quantidade]; // Nova Array que receberá SALARIOS (Double), repetição de acordo com o informado

        for (int i = 0; i < quantidade; i++) { // Repetição de acordo com a QUANTIDADE digitada
            nomes[i]    = JOptionPane.showInputDialog("Digite o nome do funcionário " + (i + 1) + ":"                          );
            cargos[i]   = JOptionPane.showInputDialog("Digite o nome de seu cargo " + (i + 1) + ":"                            );
            salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário " + (i + 1) + ": R$"));
        }

        JOptionPane.showMessageDialog(null, "Funcionários Cadastrados: ");

        for (int i = 0; i < quantidade; i++) { // Repetição de acordo com a QUANTIDADE digitada
        	JOptionPane.showMessageDialog(null, "Nome do funcionário " + (i + 1) + ": " + nomes[i]);
        
        }
        for (int i = 0; i < quantidade; i++) { // Repetição de acordo com a QUANTIDADE digitada
        	JOptionPane.showMessageDialog(null, "Cargo do funcionário " + (i + 1) + ": " + cargos[i]);
        
        }
        for (int i = 0; i < quantidade; i++) { // Repetição de acordo com a QUANTIDADE digitada
        	JOptionPane.showMessageDialog(null, "Salário do funcionário " + (i + 1) + ": " + salarios[i]);
        
        }
    }
}