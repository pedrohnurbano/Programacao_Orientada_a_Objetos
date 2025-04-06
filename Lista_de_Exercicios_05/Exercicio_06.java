import javax.swing.JOptionPane;
public class Exercicio_06 {

	public static void main(String[] args) {
		Calculadora();
		System.exit(0);
	}

	public static void Calculadora() {
		String operacao;
		double valor_1, valor_2, resultado;

		valor_1    = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"   ));
		valor_2    = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"    ));
		operacao = JOptionPane.showInputDialog("Calculadora - Operações" + "\n" +
											   "-> A - Adição;"          + "\n" + 
											   "-> S - Subtração;"       + "\n" +
											   "-> M - Multiplicação;"   + "\n" +
											   "-> D - Divisão."         + "\n" +
											   "Digite a opção que diz respeito a sua operação: ");

		if (operacao.equalsIgnoreCase("A"))
		{
			resultado = (valor_1 + valor_2);
			JOptionPane.showMessageDialog(null, "A soma do primeiro valor "+ valor_1 +" com o segundo valor "+ valor_2 +" é igual a: " + resultado);   
		}
		else if (operacao.equalsIgnoreCase("S"))
		{
			resultado = (valor_1 - valor_2);
			JOptionPane.showMessageDialog(null, "A subtração do primeiro valor "+ valor_1 +" pelo segundo valor "+ valor_2 +" é igual a: " + resultado);   
		}
		else if (operacao.equalsIgnoreCase("M"))
		{
			resultado = (valor_1 * valor_2);
			JOptionPane.showMessageDialog(null, "A multiplicação do primeiro valor "+ valor_1 +" com o segundo valor "+ valor_2 +" é igual a: " + resultado);   
		}
		else if (operacao.equalsIgnoreCase("S"))
		{
			resultado = (valor_1 / valor_2);
			JOptionPane.showMessageDialog(null, "A divisão do primeiro valor "+ valor_1 +" pelo segundo valor "+ valor_2 +" é igual a: " + resultado);   
		}
	}
}