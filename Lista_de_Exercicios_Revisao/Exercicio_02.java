import javax.swing.JOptionPane;

public class Exercicio_02 {
    public static void main(String[] args) {
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de m�dicos que deseja cadastrar: "));

        String[] nomes    = new String[quantidade]; // Nova Array que receber� NOMES (String), repeti��o de acordo com o informado
        String[] especialidades   = new String[quantidade]; // Nova Array que receber� CARGOS (String), repeti��o de acordo com o informado

        for (int i = 0; i < quantidade; i++) { // Repeti��o de acordo com a QUANTIDADE digitada
            nomes[i]          = JOptionPane.showInputDialog("Digite o nome do m�dico " + (i + 1) + ":"      );
            especialidades[i] = JOptionPane.showInputDialog("Digite o nome da sua especialidade " + (i + 1) + ":");
        }

        JOptionPane.showMessageDialog(null, "M�dicos Cadastrados: ");

        for (int i = 0; i < quantidade; i++) { // Repeti��o de acordo com a QUANTIDADE digitada
        	JOptionPane.showMessageDialog(null, "Nome do m�dico " + (i + 1) + ": " + nomes[i]);
        }
        for (int i = 0; i < quantidade; i++) { // Repeti��o de acordo com a QUANTIDADE digitada
        	JOptionPane.showMessageDialog(null, "Especialidade do m�dico " + (i + 1) + ": " + especialidades[i]);
        
        }
    }
}