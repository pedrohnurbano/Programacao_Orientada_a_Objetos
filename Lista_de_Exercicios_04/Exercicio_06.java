import javax.swing.JOptionPane;
public class Exercicio_06 {

public static void main(String[] args) {
double base, altura, area;

base = Double.parseDouble(JOptionPane.showInputDialog("Digite o o valor da base: "));
altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));

area = (base*altura)/2;

JOptionPane.showMessageDialog(null,"O triângulo de base: " + base + ", e altura: " + altura + "possui uma área de: R$:" + area + "cm²");
System.exit(0);

}
}
