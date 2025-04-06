import javax.swing.JOptionPane;
public class Exercise_05 {

	public static void main(String[] args) {
		/* DEFINI��O DE VARI�VEIS E SUAS CARACTER�STICAS: */
		int quantidade_calculos, opcao = 0;
		int total_mulheres = 0, total_homens = 0;
		double altura, peso, acumulador = 0, media_peso;
		double altura_maior = 0, altura_menor =  9999;
		String sexo;

		/* DEFINI��O DO N�MERO DE CADASTROS: */
		quantidade_calculos = 20;

		/* REPETI��O DE ACORDO COM O N�MERO DE CADASTROS DIGITADO: */
		for (int i = 1; i<= quantidade_calculos; i++) {
			altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura (cm): "));
			
			/* DEFINI��O DO VALOR DA ALTURA DE ACORDO COM O MAIOR VALOR: */
			if (altura > altura_maior) {
				altura_maior = altura;	}
			
			if (altura < altura_menor) {
				altura_menor = altura;	}
			
	        /* SOLICITA��O E DEFINI��O DO PESO E ACUMULA��O DO MESMO PARA POSTEIOR C�LCULO*/
			peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso (kg): "));
			
			/* MENU DE OP��ES: */
			System.out.println("|---------------------------|");
			System.out.println("| Menu de Defini��o de Sexo |");
			System.out.println("|---------------------------|");
			System.out.println("| 1 - Masculino;            |");
			System.out.println("| 2 - Feminino;             |");
			System.out.println("|---------------------------|");
			
			/* SOLICITA��O DE ESCOLHA PARA DEFINI��O DE SEXO DO INDIV�DUO: */
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a op��o que diz respeito ao seu sexo: "));
			
			/* ESTRUTURA DE SELE��O E CONTADOR DO N�MERO DE MULHERES E HOMENS CADASTRADOS: */
			if ((opcao == 2)) {
				total_mulheres = total_mulheres + 1;
				break;
			}
			else if ((opcao == 1)) {
				total_homens = total_homens + 1;
				break;
			}
			else if ((opcao < 0) && (opcao > 2)){
				System.out.println("Op��o inv�lida!");
				break;
			}		
			
			acumulador = acumulador + peso;
		}

		/* C�LCULO DE M�DIA DO PESO GERAL DE TODAS AS PESSOAS CADASTRADAS: */
		media_peso = acumulador / 20;
		JOptionPane.showMessageDialog(null, 
		
		/* EXIBI��O DOS RESULTADOS REFERENTES AO SOLICITADO, TAL COMO O N�MERO TOTAL DE HOMENS E MULHRES RECEBIDO PELO CONTADOR, A MAIOR E MENOR ALTURA E A M�DIA DO PESO TOTAL ENTRE AS MULHERES: */
		"A1 - Maior altura do grupo:" + altura_maior + "\n" + 
		"A2 - Menor altura do grupo:" + altura_menor + "\n" + 
		"B  - M�dia de peso das mulheres: " + media_peso + "\n" + 
		"C1 - Total de Homens cadastrados: " + total_homens + "\n" + 
		"C2 - Total de Mulheres cadastradas: " + total_mulheres);
		System.exit(0);
}
}