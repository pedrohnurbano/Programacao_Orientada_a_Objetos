import javax.swing.JOptionPane;
public class Exercise_05 {

	public static void main(String[] args) {
		/* DEFINIÇÃO DE VARIÁVEIS E SUAS CARACTERÍSTICAS: */
		int quantidade_calculos, opcao = 0;
		int total_mulheres = 0, total_homens = 0;
		double altura, peso, acumulador = 0, media_peso;
		double altura_maior = 0, altura_menor =  9999;
		String sexo;

		/* DEFINIÇÃO DO NÚMERO DE CADASTROS: */
		quantidade_calculos = 20;

		/* REPETIÇÃO DE ACORDO COM O NÚMERO DE CADASTROS DIGITADO: */
		for (int i = 1; i<= quantidade_calculos; i++) {
			altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura (cm): "));
			
			/* DEFINIÇÃO DO VALOR DA ALTURA DE ACORDO COM O MAIOR VALOR: */
			if (altura > altura_maior) {
				altura_maior = altura;	}
			
			if (altura < altura_menor) {
				altura_menor = altura;	}
			
	        /* SOLICITAÇÃO E DEFINIÇÃO DO PESO E ACUMULAÇÃO DO MESMO PARA POSTEIOR CÁLCULO*/
			peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso (kg): "));
			
			/* MENU DE OPÇÕES: */
			System.out.println("|---------------------------|");
			System.out.println("| Menu de Definição de Sexo |");
			System.out.println("|---------------------------|");
			System.out.println("| 1 - Masculino;            |");
			System.out.println("| 2 - Feminino;             |");
			System.out.println("|---------------------------|");
			
			/* SOLICITAÇÃO DE ESCOLHA PARA DEFINIÇÃO DE SEXO DO INDIVÍDUO: */
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção que diz respeito ao seu sexo: "));
			
			/* ESTRUTURA DE SELEÇÃO E CONTADOR DO NÚMERO DE MULHERES E HOMENS CADASTRADOS: */
			if ((opcao == 2)) {
				total_mulheres = total_mulheres + 1;
				break;
			}
			else if ((opcao == 1)) {
				total_homens = total_homens + 1;
				break;
			}
			else if ((opcao < 0) && (opcao > 2)){
				System.out.println("Opção inválida!");
				break;
			}		
			
			acumulador = acumulador + peso;
		}

		/* CÁLCULO DE MÉDIA DO PESO GERAL DE TODAS AS PESSOAS CADASTRADAS: */
		media_peso = acumulador / 20;
		JOptionPane.showMessageDialog(null, 
		
		/* EXIBIÇÃO DOS RESULTADOS REFERENTES AO SOLICITADO, TAL COMO O NÚMERO TOTAL DE HOMENS E MULHRES RECEBIDO PELO CONTADOR, A MAIOR E MENOR ALTURA E A MÉDIA DO PESO TOTAL ENTRE AS MULHERES: */
		"A1 - Maior altura do grupo:" + altura_maior + "\n" + 
		"A2 - Menor altura do grupo:" + altura_menor + "\n" + 
		"B  - Média de peso das mulheres: " + media_peso + "\n" + 
		"C1 - Total de Homens cadastrados: " + total_homens + "\n" + 
		"C2 - Total de Mulheres cadastradas: " + total_mulheres);
		System.exit(0);
}
}