import javax.swing.JOptionPane;
public class Exercise_01 {

	public static void main(String[] args) {
		
		/* DEFINIÇÃO DE VARIÁVEIS E SUAS CARACTERÍSTICAS: */
		int opcao, numero_habitantes;
		int total_jose = 0, total_maria = 0, total_branco = 0, total_nulo = 0;
		String nome;
		
		/* SOLICITAÇÃO E DEFINIÇÃO DO NÚMERO DE HAVITANTES VOTANTES: */
		numero_habitantes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de habitantes: "));
		
		/* REPETIÇÃO DE ACORDO COM O NÚMERO DE HABITANTES DIGITADO: */
		for (int i = 1; i<= numero_habitantes; i++) {
		
		/* SOLICITAÇÃO E DEFINIÇÃO DO NOME DO VOTANTE: */
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		/* MENU DE OPÇÕES: */
		System.out.println("|------------------------------------|");
		System.out.println("| Menu de Opções - Apuração de Votos |");
		System.out.println("|------------------------------------|");
		System.out.println("| 1 - Candidato José;                |");
		System.out.println("| 2 - Candidata Maria;               |");
		System.out.println("| 3 - Branco;                        |");
		System.out.println("| 4 - Nulo;                          |");
		System.out.println("| 5 - Encerrar a Eleição.            |");
		System.out.println("|------------------------------------|");
		
		/* SOLICITAÇÃO DA OPÇÃO DESEJADA: */
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada: "));

		switch (opcao) {
			case 1:
				/* EXIBIÇÃO DE MENSAGEM DE AGRADECIMENTO E CONFIRMAÇÃO DO VOTO: */
				System.out.println("Você " + nome + ", votou no candidato José. Muito obrigado(a)!");
				/* A CADA VOTO PARA ESTA OPÇÃO SERÁ CONTABILIZADO PELA RESPECTIVA VARIÁVEL: */
				total_jose = total_jose + 1;
				break;
			case 2:
				System.out.println("Você " + nome + ", votou na candidata Maria. Muito obrigado(a)!");
				total_maria = total_maria + 1;
				break;
			case 3:
				System.out.println("Você " + nome + ", votou em branco. Muito obrigado(a)!");
				total_branco = total_branco + 1;
				break;
			case 4:
				System.out.println("Você " + nome + ", votou nulo. Muito obrigado(a)!");
				total_nulo = total_nulo + 1;
				break;
			case 5:
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
		}
		}
		/* EXIBIÇÃO DO TOTAL DE VOTOS PARA CADA OPÇÃO DISPONÍVEL, AO FINAL DA EXECUSÃO DO PROGRAMA: */
		JOptionPane.showMessageDialog(null, 
		"Total de votos para o candidato José: " + total_jose + "\n" + 
		"Total de votos para a candidata Maria: " + total_maria + "\n" + 
		"Total de votos em branco: " + total_branco + "\n" + 
		"Total de votos nulos: " + total_nulo);
		System.exit(0);	
}
}