import javax.swing.JOptionPane;

public class Exercicio_16 {
    public static void main(String[] args) {
        // Recebe os dados do funcionário
    	
    	int numero_funcionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de funcionários: "));
    	for (int i = 1; i<= numero_funcionarios; i++) {
    	
    		String nome = JOptionPane.showInputDialog("Nome do funcionário:");
    		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));

    		// Calcula o novo salário
    		double novoSalario = calcularAumento(salario);

    		// Exibe o resultado
    		JOptionPane.showMessageDialog(null, "Funcionário: " + nome + 
                                            	"\nSalário antigo: R$ " + salario + 
                                            	"\nNovo salário: R$ " + novoSalario);
    	}
    }

    // Método que calcula o novo salário com base na regra de aumento
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