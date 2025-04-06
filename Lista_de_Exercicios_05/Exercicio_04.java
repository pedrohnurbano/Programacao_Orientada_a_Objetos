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
		media    = Double.parseDouble(JOptionPane.showInputDialog("Digite sua média:"));

		if (media < 5)
		{
			JOptionPane.showMessageDialog(null, "O estudante "+ nome +", está Reprovado.");   }
		else if ((media >= 5) && (media < 7))
		{
			JOptionPane.showMessageDialog(null, "O estudante "+ nome +", está em Recuperação." );   }
		else if (media >= 7)
		{
			JOptionPane.showMessageDialog(null, "O estudante "+ nome +", está Aprovado."  );   }   
	}
}