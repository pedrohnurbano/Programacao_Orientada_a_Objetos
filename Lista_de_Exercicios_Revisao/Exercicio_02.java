import javax.swing.JOptionPane;

public class Exercicio_02 {
    public static void main(String[] args) {
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de médicos que deseja cadastrar: "));

        String[] nomes    = new String[quantidade]; // Nova Array que receberá NOMES (String), repetição de acordo com o informado
        String[] especialidades   = new String[quantidade]; // Nova Array que receberá CARGOS (String), repetição de acordo com o informado

        for (int i = 0; i < quantidade; i++) { // Repetição de acordo com a QUANTIDADE digitada
            nomes[i]          = JOptionPane.showInputDialog("Digite o nome do médico " + (i + 1) + ":"      );
            especialidades[i] = JOptionPane.showInputDialog("Digite o nome da sua especialidade " + (i + 1) + ":");
        }

        JOptionPane.showMessageDialog(null, "Médicos Cadastrados: ");

        for (int i = 0; i < quantidade; i++) { // Repetição de acordo com a QUANTIDADE digitada
        	JOptionPane.showMessageDialog(null, "Nome do médico " + (i + 1) + ": " + nomes[i]);
        }
        for (int i = 0; i < quantidade; i++) { // Repetição de acordo com a QUANTIDADE digitada
        	JOptionPane.showMessageDialog(null, "Especialidade do médico " + (i + 1) + ": " + especialidades[i]);
        
        }
    }
}