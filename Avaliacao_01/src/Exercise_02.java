import javax.swing.JOptionPane;
public class Exercise_02 {

	public static void main(String[] args) {
		/* DEFINI��O DE VARI�VEIS E SUAS CARACTER�STICAS: */
		int idade, quantidade_cadastros;
		int total_bercario = 0, total_infantil = 0, total_fundamental1 = 0, total_fundamental2 = 0, total_ensinomedio = 0;
		String nome, categoria;

		/* SOLICITA��O E DEFINI��O DO N�MERO DE CADASTROS: */
		quantidade_cadastros = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero alunos que deseja cadastrar: "));

		/* REPETI��O DE ACORDO COM O N�MERO DE CADASTROS DIGITADO: */
		for (int i = 1; i<= quantidade_cadastros; i++) {
			
			/* SOLICITA��O E DEFINI��O DE DADOS REFERENTES AO USU�RIO: */
			nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do mesmo:: "));
			
			/* DEFINI��O E SEPARA��O DE CATEGORIAS DE ACORDO COM PAR�METROS ESPEC�FICOS, ENTRE DOIS DADOS: */
			if ((idade >= 0) && (idade <= 3)) {
				categoria = "Ber��rio";
				System.out.println("Voc� " + nome + ", possui " + idade + " anos de idade, e est� na categoria: " + categoria);
				total_bercario = total_bercario + 1;
			}
			else if ((idade >= 4) && (idade <= 7)) {
				categoria = "Infantil";
				System.out.println("Voc� " + nome + ", possui " + idade + " anos de idade, e est� na categoria: " + categoria);
				total_infantil = total_infantil + 1;
			}
			else if ((idade >= 8) && (idade <= 10)) {
				categoria = "Fundamental I";
				System.out.println("Voc� " + nome + ", possui " + idade + " anos de idade, e est� na categoria: " + categoria);
				total_fundamental1 = total_fundamental1 + 1;
			}
			else if ((idade >= 11) && (idade <= 14)) {
				categoria = "Fundamental II";
				System.out.println("Voc� " + nome + ", possui " + idade + " anos de idade, e est� na categoria: " + categoria);
				total_fundamental2 = total_fundamental2 + 1;
			}
			else if (idade >= 15) {
				categoria = "Ensino M�dio";
				System.out.println("Voc� " + nome + ", possui " + idade + " anos de idade, e est� na categoria: " + categoria);
				total_bercario = total_bercario + 1;
			}
			else if (idade < 0) {
				System.out.println("Idade inv�lida!");
			}
		}

		JOptionPane.showMessageDialog(null,
		"Total de alunos no Ber��rio: " + total_bercario + "\n" + 
		"Total de alunos no Infantil: " + total_infantil + "\n" + 
		"Total de alunos no Ensino Fundamental I: " + total_fundamental1 + "\n" +
		"Total de alunos no Fundamental II: " + total_fundamental2 + "\n" + 
		"Total de alunos no Ensino M�dio: " + total_ensinomedio);
		System.exit(0);
}
}