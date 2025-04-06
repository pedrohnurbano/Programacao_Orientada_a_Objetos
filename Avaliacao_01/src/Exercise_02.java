import javax.swing.JOptionPane;
public class Exercise_02 {

	public static void main(String[] args) {
		/* DEFINIÇÃO DE VARIÁVEIS E SUAS CARACTERÍSTICAS: */
		int idade, quantidade_cadastros;
		int total_bercario = 0, total_infantil = 0, total_fundamental1 = 0, total_fundamental2 = 0, total_ensinomedio = 0;
		String nome, categoria;

		/* SOLICITAÇÃO E DEFINIÇÃO DO NÚMERO DE CADASTROS: */
		quantidade_cadastros = Integer.parseInt(JOptionPane.showInputDialog("Digite o número alunos que deseja cadastrar: "));

		/* REPETIÇÃO DE ACORDO COM O NÚMERO DE CADASTROS DIGITADO: */
		for (int i = 1; i<= quantidade_cadastros; i++) {
			
			/* SOLICITAÇÃO E DEFINIÇÃO DE DADOS REFERENTES AO USUÁRIO: */
			nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do mesmo:: "));
			
			/* DEFINIÇÃO E SEPARAÇÃO DE CATEGORIAS DE ACORDO COM PARÂMETROS ESPECÍFICOS, ENTRE DOIS DADOS: */
			if ((idade >= 0) && (idade <= 3)) {
				categoria = "Berçário";
				System.out.println("Você " + nome + ", possui " + idade + " anos de idade, e está na categoria: " + categoria);
				total_bercario = total_bercario + 1;
			}
			else if ((idade >= 4) && (idade <= 7)) {
				categoria = "Infantil";
				System.out.println("Você " + nome + ", possui " + idade + " anos de idade, e está na categoria: " + categoria);
				total_infantil = total_infantil + 1;
			}
			else if ((idade >= 8) && (idade <= 10)) {
				categoria = "Fundamental I";
				System.out.println("Você " + nome + ", possui " + idade + " anos de idade, e está na categoria: " + categoria);
				total_fundamental1 = total_fundamental1 + 1;
			}
			else if ((idade >= 11) && (idade <= 14)) {
				categoria = "Fundamental II";
				System.out.println("Você " + nome + ", possui " + idade + " anos de idade, e está na categoria: " + categoria);
				total_fundamental2 = total_fundamental2 + 1;
			}
			else if (idade >= 15) {
				categoria = "Ensino Médio";
				System.out.println("Você " + nome + ", possui " + idade + " anos de idade, e está na categoria: " + categoria);
				total_bercario = total_bercario + 1;
			}
			else if (idade < 0) {
				System.out.println("Idade inválida!");
			}
		}

		JOptionPane.showMessageDialog(null,
		"Total de alunos no Berçário: " + total_bercario + "\n" + 
		"Total de alunos no Infantil: " + total_infantil + "\n" + 
		"Total de alunos no Ensino Fundamental I: " + total_fundamental1 + "\n" +
		"Total de alunos no Fundamental II: " + total_fundamental2 + "\n" + 
		"Total de alunos no Ensino Médio: " + total_ensinomedio);
		System.exit(0);
}
}