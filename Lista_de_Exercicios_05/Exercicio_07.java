import javax.swing.JOptionPane;
public class Exercicio_07 {

	public static void main(String[] args) {
		Verificacao_Funcionarios();
		System.exit(0);
	}
	
	public static void Verificacao_Funcionarios() {
		
		double salario;
		int    numero_funcionarios, total_funcionarios_3k = 0, total_funcionarios_5k = 0, total_funcionarios_m5k = 0;
		String nome;
		
		numero_funcionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de funcionários: "));
		
		for (int i = 1; i<= numero_funcionarios; i++) {
		
			nome    = JOptionPane.showInputDialog                   ("Digite seu nome: "   );
			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
		
			if ((salario > 0) && (salario <= 3000))
			{
				JOptionPane.showMessageDialog(null, "O indivíduo "+ nome +", ganha mais que R$3.000,00."  );
				total_funcionarios_3k = total_funcionarios_3k + 1;
			}
			else if ((salario >= 3000) && (salario <= 5000))
			{
				JOptionPane.showMessageDialog(null, "O indivíduo "+ nome +", ganha entre R$3.000,00 e R$5.000,00."  );
				total_funcionarios_5k = total_funcionarios_5k + 1;
			}
			else if (salario > 5000)
			{
				JOptionPane.showMessageDialog(null, "O indivíduo "+ nome +", ganha mais que R$5.000,00."  );
				total_funcionarios_m5k = total_funcionarios_m5k + 1;
			}
		}
		
		JOptionPane.showMessageDialog(null, 
				"Número de funcionários que ganham menos que R$3.000,00: " + total_funcionarios_3k + "\n" +
				"Número de funcionários que ganham entre R$3.000,00 e R$5.000,00: " + total_funcionarios_5k + "\n" +
				"Número de funcionários que ganham mais que R$5.000,00: " + total_funcionarios_m5k);
	}
}