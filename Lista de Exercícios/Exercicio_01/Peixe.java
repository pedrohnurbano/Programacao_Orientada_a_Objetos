package Exercicio_01;
import javax.swing.JOptionPane;

// Classe Peixe (Filho):
// Esta classe representa um peixe, que é um tipo específico de animal.
public class Peixe extends Animal {
    private String caracteristica;

    // Construtor da classe Peixe:
    // Este construtor inicializa os atributos do peixe com os valores fornecidos.
    public Peixe(String nome, String habitat, String reproducao, String fecundacao, float velocidade_media, String coloracao, String locomocao, String respiracao, String caracteristica) {
        super(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao);
        this.caracteristica = caracteristica;
    }

    // Método para exibir os dados do peixe:
    // Este método exibe uma mensagem com os dados do peixe em uma caixa de diálogo.
    public void dadosPeixe() {
        super.dados();
        JOptionPane.showMessageDialog(null, "Característica: " + caracteristica, "Dados do Peixe", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String nome             = JOptionPane.showInputDialog("Digite o nome do peixe:");
        String habitat          = JOptionPane.showInputDialog("Digite o habitat do peixe:");
        String reproducao       = JOptionPane.showInputDialog("Digite o tipo de reprodução do peixe:");
        String fecundacao       = JOptionPane.showInputDialog("Digite o tipo de fecundação do peixe:");
        float  velocidade_media = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade média do peixe (em m/s):"));
        String coloracao        = JOptionPane.showInputDialog("Digite a coloração do peixe:");
        String locomocao        = JOptionPane.showInputDialog("Digite o tipo de locomoção do peixe:");
        String respiracao       = JOptionPane.showInputDialog("Digite o tipo de respiração do peixe:");
        String caracteristica   = JOptionPane.showInputDialog("Digite uma característica do peixe:");

        Peixe peixe = new Peixe(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao, caracteristica);
        peixe.dadosPeixe();
    }
}