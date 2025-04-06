import javax.swing.JOptionPane;

public class Exercicio_16 {
    public static void main(String[] args) {
        // Recebe os dados do funcion�rio
    	
    	int numero_funcionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de funcion�rios: "));
    	for (int i = 1; i<= numero_funcionarios; i++) {
    	
    		String nome = JOptionPane.showInputDialog("Nome do funcion�rio:");
    		double salario = Double.parseDouble(JOptionPane.showInputDialog("Sal�rio:"));

    		// Calcula o novo sal�rio
    		double novoSalario = calcularAumento(salario);

    		// Exibe o resultado
    		JOptionPane.showMessageDialog(null, "Funcion�rio: " + nome + 
                                            	"\nSal�rio antigo: R$ " + salario + 
                                            	"\nNovo sal�rio: R$ " + novoSalario);
    	}
    }

    // M�todo que calcula o novo sal�rio com base na regra de aumento
    public static double calcularAumento(double salario) {
        if (salario < 2000) {
            return salario * 1.10; // Aumento de 10%
        } else if (salario <= 4000) {
            return salario * 1.08; // Aumento de 8%
        } else {
            return salario * 1.05; // Aumento de 5%
        }
    }
}