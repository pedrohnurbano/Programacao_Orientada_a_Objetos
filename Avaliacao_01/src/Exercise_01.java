import javax.swing.JOptionPane;
public class Exercise_01 {

	public static void main(String[] args) {
		
		/* DEFINI��O DE VARI�VEIS E SUAS CARACTER�STICAS: */
		int opcao, numero_habitantes;
		int total_jose = 0, total_maria = 0, total_branco = 0, total_nulo = 0;
		String nome;
		
		/* SOLICITA��O E DEFINI��O DO N�MERO DE HAVITANTES VOTANTES: */
		numero_habitantes = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de habitantes: "));
		
		/* REPETI��O DE ACORDO COM O N�MERO DE HABITANTES DIGITADO: */
		for (int i = 1; i<= numero_habitantes; i++) {
		
		/* SOLICITA��O E DEFINI��O DO NOME DO VOTANTE: */
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		/* MENU DE OP��ES: */
		System.out.println("|------------------------------------|");
		System.out.println("| Menu de Op��es - Apura��o de Votos |");
		System.out.println("|------------------------------------|");
		System.out.println("| 1 - Candidato Jos�;                |");
		System.out.println("| 2 - Candidata Maria;               |");
		System.out.println("| 3 - Branco;                        |");
		System.out.println("| 4 - Nulo;                          |");
		System.out.println("| 5 - Encerrar a Elei��o.            |");
		System.out.println("|------------------------------------|");
		
		/* SOLICITA��O DA OP��O DESEJADA: */
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a op��o desejada: "));

		switch (opcao) {
			case 1:
				/* EXIBI��O DE MENSAGEM DE AGRADECIMENTO E CONFIRMA��O DO VOTO: */
				System.out.println("Voc� " + nome + ", votou no candidato Jos�. Muito obrigado(a)!");
				/* A CADA VOTO PARA ESTA OP��O SER� CONTABILIZADO PELA RESPECTIVA VARI�VEL: */
				total_jose = total_jose + 1;
				break;
			case 2:
				System.out.println("Voc� " + nome + ", votou na candidata Maria. Muito obrigado(a)!");
				total_maria = total_maria + 1;
				break;
			case 3:
				System.out.println("Voc� " + nome + ", votou em branco. Muito obrigado(a)!");
				total_branco = total_branco + 1;
				break;
			case 4:
				System.out.println("Voc� " + nome + ", votou nulo. Muito obrigado(a)!");
				total_nulo = total_nulo + 1;
				break;
			case 5:
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Op��o inv�lida!");
				break;
		}
		}
		/* EXIBI��O DO TOTAL DE VOTOS PARA CADA OP��O DISPON�VEL, AO FINAL DA EXECUS�O DO PROGRAMA: */
		JOptionPane.showMessageDialog(null, 
		"Total de votos para o candidato Jos�: " + total_jose + "\n" + 
		"Total de votos para a candidata Maria: " + total_maria + "\n" + 
		"Total de votos em branco: " + total_branco + "\n" + 
		"Total de votos nulos: " + total_nulo);
		System.exit(0);	
}
}