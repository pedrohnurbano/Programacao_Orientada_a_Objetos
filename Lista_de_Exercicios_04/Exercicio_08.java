import javax.swing.JOptionPane;
public class Exercicio_08 {

public static void main(String[] args) {
String nome;
int numero_horas_trabalhadas, qnt_cadastros;
double valor_hora_trabalhada, salario_bruto, desconto, salario_final, acumulador = 0;

qnt_cadastros = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de cadastros que deseja fazer: "));

for (int i = 1; i<= qnt_cadastros; i++) {
	nome = JOptionPane.showInputDialog("Digite seu nome: ");
	numero_horas_trabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de horas trabalhadas: "));
	valor_hora_trabalhada = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de cada hora trabalhada: R$"));
	salario_bruto = numero_horas_trabalhadas * valor_hora_trabalhada;
	desconto = salario_bruto * 0.02;
	salario_final = salario_bruto - desconto;
	
	JOptionPane.showMessageDialog(null,"O funcion�rio: " + nome + ", possui um sal�rio total no valor de : " + salario_final);
	
	acumulador = acumulador + salario_final;
}


JOptionPane.showMessageDialog(null, "Total da folha de pagamento: R$ " + acumulador);
System.exit(0);

}
}