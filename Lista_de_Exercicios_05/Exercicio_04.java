import javax.swing.JOptionPane;
public class Exercicio_04 {

	public static void main(String[] args) {
		Verificacao_Situacao();
		System.exit(0);
	}

	public static void Verificacao_Situacao() {
		String nome;
		double media;

		nome    = JOptionPane.showInputDialog                    ("Digite seu nome: ");
		media    = Double.parseDouble(JOptionPane.showInputDialog("Digite sua m�dia:"));

		if (media < 5)
		{
			JOptionPane.showMessageDialog(null, "O estudante "+ nome +", est� Reprovado.");   }
		else if ((media >= 5) && (media < 7))
		{
			JOptionPane.showMessageDialog(null, "O estudante "+ nome +", est� em Recupera��o." );   }
		else if (media >= 7)
		{
			JOptionPane.showMessageDialog(null, "O estudante "+ nome +", est� Aprovado."  );   }   
	}
}