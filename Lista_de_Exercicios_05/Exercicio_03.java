import javax.swing.JOptionPane;
public class Exercicio_03 {

	public static void main(String[] args) {
		Verificacao_IMC();
		System.exit(0);
	}

	public static void Verificacao_IMC() {
		String nome;
		double peso, altura;

		nome    = JOptionPane.showInputDialog                   ("Digite seu nome: " );
		peso    = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"  ));
		altura  = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));

		double valorIMC = peso / (altura * altura);
		JOptionPane.showMessageDialog(null, "Nome : " + nome + " IMC : "+valorIMC);   
	}
}
