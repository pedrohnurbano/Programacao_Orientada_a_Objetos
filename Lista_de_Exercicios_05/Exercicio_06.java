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
		operacao = JOptionPane.showInputDialog("Calculadora - Opera��es" + "\n" +
											   "-> A - Adi��o;"          + "\n" + 
											   "-> S - Subtra��o;"       + "\n" +
											   "-> M - Multiplica��o;"   + "\n" +
											   "-> D - Divis�o."         + "\n" +
											   "Digite a op��o que diz respeito a sua opera��o: ");

		if (operacao.equalsIgnoreCase("A"))
		{
			resultado = (valor_1 + valor_2);
			JOptionPane.showMessageDialog(null, "A soma do primeiro valor "+ valor_1 +" com o segundo valor "+ valor_2 +" � igual a: " + resultado);   
		}
		else if (operacao.equalsIgnoreCase("S"))
		{
			resultado = (valor_1 - valor_2);
			JOptionPane.showMessageDialog(null, "A subtra��o do primeiro valor "+ valor_1 +" pelo segundo valor "+ valor_2 +" � igual a: " + resultado);   
		}
		else if (operacao.equalsIgnoreCase("M"))
		{
			resultado = (valor_1 * valor_2);
			JOptionPane.showMessageDialog(null, "A multiplica��o do primeiro valor "+ valor_1 +" com o segundo valor "+ valor_2 +" � igual a: " + resultado);   
		}
		else if (operacao.equalsIgnoreCase("S"))
		{
			resultado = (valor_1 / valor_2);
			JOptionPane.showMessageDialog(null, "A divis�o do primeiro valor "+ valor_1 +" pelo segundo valor "+ valor_2 +" � igual a: " + resultado);   
		}
	}
}