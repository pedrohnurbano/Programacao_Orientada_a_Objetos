import javax.swing.JOptionPane;

public class Exercicio_17 {
    public static void main(String[] args) {
        // Recebe os dados do n�mero de funcion�rios
        int numero_funcionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de funcion�rios: "));
        
        for (int i = 1; i <= numero_funcionarios; i++) {
            // Recebe os dados de cada funcion�rio
            String nome = JOptionPane.showInputDialog("Nome do funcion�rio:");
            String setor = JOptionPane.showInputDialog("Setor do funcion�rio (Financeiro, Vendas, Produ��o):");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Sal�rio:"));
            
            // Calcula o novo sal�rio com base no setor
            double novoSalario = calcularAumento(salario, setor);

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, "Funcion�rio: " + nome + 
                                                "\nSetor: " + setor + 
                                                "\nSal�rio antigo: R$ " + salario + 
                                                "\nNovo sal�rio: R$ " + novoSalario);
        }
    }

    // M�todo que calcula o novo sal�rio com base no setor
    public static double calcularAumento(double salario, String setor) {
        // Aplica o aumento de acordo com o setor
        switch (setor.toLowerCase()) {
            case "financeiro":
                return salario * 1.05; // Aumento de 5% para o setor financeiro
            case "vendas":
                return salario * 1.10; // Aumento de 10% para o setor de vendas
            case "produ��o":
                return salario * 1.15; // Aumento de 15% para o setor de produ��o
            default:
                return salario; // Caso o setor n�o seja v�lido, n�o h� aumento
        }
    }
}
