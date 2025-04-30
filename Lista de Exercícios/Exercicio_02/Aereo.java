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
        JOptionPane.showMessageDialog(null, "N�mero de Passageiros: " + numeroPassageiros, "Dados do Transporte A�reo", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String descricao = JOptionPane.showInputDialog("Digite a descri��o do transporte a�reo:");
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho do transporte a�reo:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte a�reo (em kg):"));
        int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de passageiros do transporte a�reo:"));

        Aereo aereo = new Aereo(descricao, tamanho, peso, numeroPassageiros);
        aereo.dadosAereo();
    }
}