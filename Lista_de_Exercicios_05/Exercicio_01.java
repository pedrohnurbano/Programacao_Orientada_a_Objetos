import javax.swing.JOptionPane;
public class Exercicio_01 {

	public static void main(String[] args) {
		Verificacao_Idade();
		System.exit(0);
	}

	public static void Verificacao_Idade() {
		String nome;
		int    idade;
	
		nome  = JOptionPane.showInputDialog                 ("Digite seu nome: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
	
		if (idade >= 18)
			{
			JOptionPane.showMessageDialog(null, "O indiv�duo "+ nome +", � maior de idade.");   }
		else
			{
			JOptionPane.showMessageDialog(null, "O indiv�duo "+ nome +", � menor de idade.");   }
	}
}