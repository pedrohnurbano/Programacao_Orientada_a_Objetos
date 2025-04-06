import javax.swing.JOptionPane;
public class Exercicio_08 {

	public static void main(String[] args) {
		Verificacao_Estudantes();
		System.exit(0);
	}
	
	public static void Verificacao_Estudantes() {
		
		int    numero_estudantes, total_alunos_ef = 0, total_alunos_em = 0, total_alunos_et = 0, operacao;
		String nome;
		
		numero_estudantes = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de estudantes: "));
		
		for (int i = 1; i<= numero_estudantes; i++) {
			
			nome    = JOptionPane.showInputDialog                   ("Digite seu nome: "   );
			operacao = Integer.parseInt(JOptionPane.showInputDialog("Categorias - Forma��o Escolar" + "\n" +
					   							                    "-> 1 - Ensino Fundamental;"    + "\n" + 
					                                                "-> 2 - Ensino M�dio;"          + "\n" +
					                                                "-> 3 - Ensino T�cnico."        + "\n" +
					                                                "Digite a op��o que diz respeito a sua forma��o: "));

			if (operacao == 1)
			{
				JOptionPane.showMessageDialog(null, "O indiv�duo " + nome + " est� no Ensino Fundamental.");   
				total_alunos_ef = total_alunos_ef + 1;
			}
			else if (operacao == 2)
			{
				JOptionPane.showMessageDialog(null, "O indiv�duo " + nome + " est� no Ensino M�dio.");   
				total_alunos_em = total_alunos_em + 1;
			}
			else if (operacao == 3)
			{
				JOptionPane.showMessageDialog(null, "O indiv�duo " + nome + " est� no Ensino T�cnico.");   
				total_alunos_et = total_alunos_et + 1;
			}
		}
		
		JOptionPane.showMessageDialog(null, 
				"N�mero de estudantes do Ensino Fundamental: " + total_alunos_ef + "\n" +
				"N�mero de estudantes do Ensino M�dio: "       + total_alunos_em + "\n" +
				"N�mero de estudantes do Ensino T�cnico: "     + total_alunos_et);
	}
}