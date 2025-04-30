package Exercicio_02;
import javax.swing.JOptionPane;

public class Terrestre extends Transporte {
    private int numeroRodas;

    public Terrestre(String descricao, String tamanho, float peso, int numeroRodas) {
        super(descricao, tamanho, peso);
        this.numeroRodas = numeroRodas;
    }

    public void dadosTerrestre() {
        super.dados();
        JOptionPane.showMessageDialog(null, "Número de Rodas: " + numeroRodas, "Dados do Transporte Terrestre", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String descricao = JOptionPane.showInputDialog("Digite a descrição do transporte terrestre:");
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho do transporte terrestre:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte terrestre (em kg):"));
        int numeroRodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de rodas do transporte terrestre:"));

        Terrestre terrestre = new Terrestre(descricao, tamanho, peso, numeroRodas);
        terrestre.dadosTerrestre();
    }
}