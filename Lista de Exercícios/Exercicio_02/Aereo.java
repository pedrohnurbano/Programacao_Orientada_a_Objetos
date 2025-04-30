package Exercicio_02;
import javax.swing.JOptionPane;

public class Aereo extends Transporte {
    private int numeroPassageiros;

    public Aereo(String descricao, String tamanho, float peso, int numeroPassageiros) {
        super(descricao, tamanho, peso);
        this.numeroPassageiros = numeroPassageiros;
    }

    public void dadosAereo() {
        super.dados();
        JOptionPane.showMessageDialog(null, "Número de Passageiros: " + numeroPassageiros, "Dados do Transporte Aéreo", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String descricao = JOptionPane.showInputDialog("Digite a descrição do transporte aéreo:");
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho do transporte aéreo:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte aéreo (em kg):"));
        int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de passageiros do transporte aéreo:"));

        Aereo aereo = new Aereo(descricao, tamanho, peso, numeroPassageiros);
        aereo.dadosAereo();
    }
}