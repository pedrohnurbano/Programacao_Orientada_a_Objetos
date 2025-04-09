import javax.swing.JOptionPane;

public class Exercicio_01 {
    public static void main(String[] args) {
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de funcion�rios que deseja cadastrar: "));

        String[] nomes    = new String[quantidade]; // Nova Array que receber� NOMES (String), repeti��o de acordo com o informado
        String[] cargos   = new String[quantidade]; // Nova Array que receber� CARGOS (String), repeti��o de acordo com o informado
        double[] salarios = new double[quantidade]; // Nova Array que receber� SALARIOS (Double), repeti��o de acordo com o informado

        for (int i = 0; i < quantidade; i++) { // Repeti��o de acordo com a QUANTIDADE digitada
            nomes[i]    = JOptionPane.showInputDialog("Digite o nome do funcion�rio " + (i + 1) + ":"                          );
            cargos[i]   = JOptionPane.showInputDialog("Digite o nome de seu cargo " + (i + 1) + ":"                            );
            salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do funcion�rio " + (i + 1) + ": R$"));
        }

        JOptionPane.showMessageDialog(null, "Funcion�rios Cadastrados: ");

        for (int i = 0; i < quantidade; i++) { // Repeti��o de acordo com a QUANTIDADE digitada
        	JOptionPane.showMessageDialog(null, "Nome do funcion�rio " + (i + 1) + ": " + nomes[i]);
        
        }
        for (int i = 0; i < quantidade; i++) { // Repeti��o de acordo com a QUANTIDADE digitada
        	JOptionPane.showMessageDialog(null, "Cargo do funcion�rio " + (i + 1) + ": " + cargos[i]);
        
        }
        for (int i = 0; i < quantidade; i++) { // Repeti��o de acordo com a QUANTIDADE digitada
        	JOptionPane.showMessageDialog(null, "Sal�rio do funcion�rio " + (i + 1) + ": " + salarios[i]);
        
        }
    }
}