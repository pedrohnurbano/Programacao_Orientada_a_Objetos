import javax.swing.JOptionPane;
public class Exercise_03 {

	public static void main(String[] args) {
		/* DEFINI��O DE VARI�VEIS E SUAS CARACTER�STICAS: */
		int numero_conta, quantidade_creditos;
		double saldo, credito;
		String nome;

		/* SOLICITA��O E DEFINI��O DO N�MERO DE CADASTROS: */
		quantidade_creditos = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de cr�ditos a serem concedidos: "));

		/* REPETI��O DE ACORDO COM O N�MERO DE CADASTROS DIGITADO: */
		for (int i = 1; i<= quantidade_creditos; i++) {
			
			/* SOLICITA��O E DEFINI��O DE DADOS REFERENTES AO USU�RIO: */
			nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
			numero_conta = Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero da sua conta: "));
			saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do seu saldo atual: R$"));
			
			/* DEFINI��O E SEPARA��O DE SALDOS M�DIOS DE ACORDO COM PAR�METROS ESPEC�FICOS, ENTRE DOIS DADOS: */
			if ((saldo >= 0) && (saldo <= 2000)) {
				/* EXIBI��O DO RESULTADO FINAL AO USU�RIO: */
				System.out.println("Voc�, " + nome + " com n�mero da conta: " + numero_conta + ", n�o possui saldo suficiente para o cr�dito especial.");
			}
			else if ((saldo >= 2001) && (saldo <= 4000)) {
				/* C�LCULO DE ACR�SCIMO A SER DADO COMO B�NUS AOS CLIENTES ESPECIAIS QUE CUMPRIREM COM OS REQUISITOS: */
				credito = saldo * 0.05;
				System.out.println("Voc�, " + nome + " com n�mero da conta: " + numero_conta + ", possui um cr�dito especial no valor de: R$" + credito);
			}
			else if ((saldo >= 4001) && (saldo <= 6000)) {
				credito = saldo * 0.10;
				System.out.println("Voc�, " + nome + " com n�mero da conta: " + numero_conta + ", possui um cr�dito especial no valor de: R$" + credito);
			}
			else if (saldo > 6000) {
				credito = saldo * 0.15;
				System.out.println("Voc�, " + nome + " com n�mero da conta: " + numero_conta + ", possui um cr�dito especial no valor de: R$" + credito);
			}
			else if (saldo < 0) {
				System.out.println("Saldo negativado.");
			}
		}
		System.exit(0);
}
}