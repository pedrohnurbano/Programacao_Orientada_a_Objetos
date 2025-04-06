import javax.swing.JOptionPane;

public class Exercicio_17 {
    public static void main(String[] args) {
        // Recebe os dados do número de funcionários
        int numero_funcionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de funcionários: "));
        
        for (int i = 1; i <= numero_funcionarios; i++) {
            // Recebe os dados de cada funcionário
            String nome = JOptionPane.showInputDialog("Nome do funcionário:");
            String setor = JOptionPane.showInputDialog("Setor do funcionário (Financeiro, Vendas, Produção):");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));
            
            // Calcula o novo salário com base no setor
            double novoSalario = calcularAumento(salario, setor);

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, "Funcionário: " + nome + 
                                                "\nSetor: " + setor + 
                                                "\nSalário antigo: R$ " + salario + 
                                                "\nNovo salário: R$ " + novoSalario);
        }
    }

    // Método que calcula o novo salário com base no setor
    public static double calcularAumento(double salario, String setor) {
        // Aplica o aumento de acordo com o setor
        switch (setor.toLowerCase()) {
            case "financeiro":
                return salario * 1.05; // Aumento de 5% para o setor financeiro
            case "vendas":
                return salario * 1.10; // Aumento de 10% para o setor de vendas
            case "produção":
                return salario * 1.15; // Aumento de 15% para o setor de produção
            default:
                return salario; // Caso o setor não seja válido, não há aumento
        }
    }
}
