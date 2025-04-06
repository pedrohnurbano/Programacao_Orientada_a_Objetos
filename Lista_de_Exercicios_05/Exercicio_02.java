import javax.swing.JOptionPane;
public class Exercicio_02 {

	public static void main(String[] args) {
		Verificacao_Atleta();
		System.exit(0);
	}

	public static void Verificacao_Atleta() {
		String nome;
		int    idade;
		
		nome  = JOptionPane.showInputDialog                 ("Digite seu nome: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		
		if ((idade >= 0) && (idade <= 10))
		{
			JOptionPane.showMessageDialog(null, "O indivíduo "+ nome +", está na categoria Infantil.");   }
		else if ((idade >= 11) && (idade <= 17))
		{
			JOptionPane.showMessageDialog(null, "O indivíduo "+ nome +", está na categoria Juvenil." );   }
		else if (idade >= 18)
		{
			JOptionPane.showMessageDialog(null, "O indivíduo "+ nome +", está na categoria Adulto."  );   }
	}
}
