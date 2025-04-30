package Exercicio_02;
import javax.swing.JOptionPane;

public class Aquatico extends Transporte {
    private float altura;

    public Aquatico(String descricao, String tamanho, float peso, float altura) {
        super(descricao, tamanho, peso);
        this.altura = altura;
    }

    public void dadosAquatico() {
        super.dados();
        JOptionPane.showMessageDialog(null, "Altura: " + altura + " metros", "Dados do Transporte Aqu�tico", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String descricao = JOptionPane.showInputDialog("Digite a descri��o do transporte aqu�tico:");
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho do transporte aqu�tico:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte aqu�tico (em kg):"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do transporte aqu�tico (em metros):"));

        Aquatico aquatico = new Aquatico(descricao, tamanho, peso, altura);
        aquatico.dadosAquatico();
    }
}