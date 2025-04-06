import javax.swing.JOptionPane;
public class Exercicio_07 {

public static void main(String[] args) {
double massa, peso, altura;

peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o o valor do seu peso: "));
altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));

massa = peso / (altura * altura);

JOptionPane.showMessageDialog(null,"O valor do seu IMC, de: " + peso + "Kg, e altura: " + altura + "m é no total de: :" + massa);
System.exit(0);

}
}
