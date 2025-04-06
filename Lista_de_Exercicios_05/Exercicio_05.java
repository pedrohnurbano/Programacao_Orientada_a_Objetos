import javax.swing.JOptionPane;
public class Exercicio_05 {

	public static void main(String[] args) {
		Verificacao_Estado_Civil();
		System.exit(0);
	}

	public static void Verificacao_Estado_Civil() {
		String nome, estado_civil;

		nome         = JOptionPane.showInputDialog("Digite seu nome: "                                    );
		estado_civil = JOptionPane.showInputDialog("Sigla - Estado Civil" + "\n" +
												   "-> S - Solteiro;"     + "\n" + 
												   "-> C - Casado;"       + "\n" +
												   "-> V - Viúvo;"        + "\n" +
												   "-> D - Divorciado."   + "\n" +
												   "Digite a opção que diz respeito a sua classificação: ");

		if (estado_civil.equalsIgnoreCase("S"))
		{
			JOptionPane.showMessageDialog(null, "O indivíduo "+ nome +", está solteiro."  );   
		}
		else if (estado_civil.equalsIgnoreCase("C"))
		{
			JOptionPane.showMessageDialog(null, "O indivíduo "+ nome +", está casado."    );   
		}
		else if (estado_civil.equalsIgnoreCase("V"))
		{
			JOptionPane.showMessageDialog(null, "O indivíduo "+ nome +", está viúvo."     );   
		}   
		else if (estado_civil.equalsIgnoreCase("D"))
		{
			JOptionPane.showMessageDialog(null, "O indivíduo "+ nome +", está divorciado.");   
		}
	}
}