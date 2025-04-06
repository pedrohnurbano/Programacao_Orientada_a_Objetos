import javax.swing.JOptionPane;
public class Exercicio_05 {

public static void main(String[] args) {
String nome, cargo;
int qnt_cadastros;
double salario, aumento, novo_salario, acumulador = 0;

qnt_cadastros = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de cadastros que deseja fazer: "));

for (int i = 1; i<= qnt_cadastros; i++) {
	nome = JOptionPane.showInputDialog("Digite seu nome: ");
	cargo = JOptionPane.showInputDialog("Informe o seu cargo: ");
	salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário: R$ "));
	aumento = salario*0.05;
	novo_salario = salario + aumento;
	JOptionPane.showMessageDialog(null,"O funcionário: " + nome + ", no cargo de: " + cargo + "teve um aumento de: R$:" + aumento);
	
	acumulador = acumulador + novo_salario;
}

JOptionPane.showMessageDialog(null, "Total da folha de pagamento: R$ " + acumulador);
System.exit(0);

}
}
