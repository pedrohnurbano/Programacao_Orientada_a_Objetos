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
        JOptionPane.showMessageDialog(null, "Altura: " + altura + " metros", "Dados do Transporte Aquático", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String descricao = JOptionPane.showInputDialog("Digite a descrição do transporte aquático:");
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho do transporte aquático:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte aquático (em kg):"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do transporte aquático (em metros):"));

        Aquatico aquatico = new Aquatico(descricao, tamanho, peso, altura);
        aquatico.dadosAquatico();
    }
}