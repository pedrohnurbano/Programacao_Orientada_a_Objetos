import javax.swing.JOptionPane;
public class Exercise_03 {

	public static void main(String[] args) {
		/* DEFINIÇÃO DE VARIÁVEIS E SUAS CARACTERÍSTICAS: */
		int numero_conta, quantidade_creditos;
		double saldo, credito;
		String nome;

		/* SOLICITAÇÃO E DEFINIÇÃO DO NÚMERO DE CADASTROS: */
		quantidade_creditos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de créditos a serem concedidos: "));

		/* REPETIÇÃO DE ACORDO COM O NÚMERO DE CADASTROS DIGITADO: */
		for (int i = 1; i<= quantidade_creditos; i++) {
			
			/* SOLICITAÇÃO E DEFINIÇÃO DE DADOS REFERENTES AO USUÁRIO: */
			nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
			numero_conta = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da sua conta: "));
			saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do seu saldo atual: R$"));
			
			/* DEFINIÇÃO E SEPARAÇÃO DE SALDOS MÉDIOS DE ACORDO COM PARÂMETROS ESPECÍFICOS, ENTRE DOIS DADOS: */
			if ((saldo >= 0) && (saldo <= 2000)) {
				/* EXIBIÇÃO DO RESULTADO FINAL AO USUÁRIO: */
				System.out.println("Você, " + nome + " com número da conta: " + numero_conta + ", não possui saldo suficiente para o crédito especial.");
			}
			else if ((saldo >= 2001) && (saldo <= 4000)) {
				/* CÁLCULO DE ACRÉSCIMO A SER DADO COMO BÔNUS AOS CLIENTES ESPECIAIS QUE CUMPRIREM COM OS REQUISITOS: */
				credito = saldo * 0.05;
				System.out.println("Você, " + nome + " com número da conta: " + numero_conta + ", possui um crédito especial no valor de: R$" + credito);
			}
			else if ((saldo >= 4001) && (saldo <= 6000)) {
				credito = saldo * 0.10;
				System.out.println("Você, " + nome + " com número da conta: " + numero_conta + ", possui um crédito especial no valor de: R$" + credito);
			}
			else if (saldo > 6000) {
				credito = saldo * 0.15;
				System.out.println("Você, " + nome + " com número da conta: " + numero_conta + ", possui um crédito especial no valor de: R$" + credito);
			}
			else if (saldo < 0) {
				System.out.println("Saldo negativado.");
			}
		}
		System.exit(0);
}
}