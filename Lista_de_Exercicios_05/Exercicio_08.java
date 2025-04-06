import javax.swing.JOptionPane;
public class Exercicio_08 {

	public static void main(String[] args) {
		Verificacao_Estudantes();
		System.exit(0);
	}
	
	public static void Verificacao_Estudantes() {
		
		int    numero_estudantes, total_alunos_ef = 0, total_alunos_em = 0, total_alunos_et = 0, operacao;
		String nome;
		
		numero_estudantes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de estudantes: "));
		
		for (int i = 1; i<= numero_estudantes; i++) {
			
			nome    = JOptionPane.showInputDialog                   ("Digite seu nome: "   );
			operacao = Integer.parseInt(JOptionPane.showInputDialog("Categorias - Formação Escolar" + "\n" +
					   							                    "-> 1 - Ensino Fundamental;"    + "\n" + 
					                                                "-> 2 - Ensino Médio;"          + "\n" +
					                                                "-> 3 - Ensino Técnico."        + "\n" +
					                                                "Digite a opção que diz respeito a sua formação: "));

			if (operacao == 1)
			{
				JOptionPane.showMessageDialog(null, "O indivíduo " + nome + " está no Ensino Fundamental.");   
				total_alunos_ef = total_alunos_ef + 1;
			}
			else if (operacao == 2)
			{
				JOptionPane.showMessageDialog(null, "O indivíduo " + nome + " está no Ensino Médio.");   
				total_alunos_em = total_alunos_em + 1;
			}
			else if (operacao == 3)
			{
				JOptionPane.showMessageDialog(null, "O indivíduo " + nome + " está no Ensino Técnico.");   
				total_alunos_et = total_alunos_et + 1;
			}
		}
		
		JOptionPane.showMessageDialog(null, 
				"Número de estudantes do Ensino Fundamental: " + total_alunos_ef + "\n" +
				"Número de estudantes do Ensino Médio: "       + total_alunos_em + "\n" +
				"Número de estudantes do Ensino Técnico: "     + total_alunos_et);
	}
}