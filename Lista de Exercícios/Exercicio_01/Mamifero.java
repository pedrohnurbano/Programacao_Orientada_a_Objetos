package Exercicio_01;
import javax.swing.JOptionPane;

// Classe Mamifero (Filho):
// Esta classe representa um mamífero, que é um tipo específico de animal.
public class Mamifero extends Animal {
    private String alimento;

    // Construtor da classe Mamifero:
    // Este construtor inicializa os atributos do mamífero com os valores fornecidos.
    public Mamifero(String nome, String habitat, String reproducao, String fecundacao, float velocidade_media, String coloracao, String locomocao, String respiracao, String alimento) {
        super(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao);
        this.alimento = alimento;
    }

    // Método para exibir os dados do mamífero:
    // Este método exibe uma mensagem com os dados do mamífero em uma caixa de diálogo.
    public void dadosMamifero() {
        super.dados();
        JOptionPane.showMessageDialog(null, "Alimento: " + alimento, "Informações do Mamífero", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String nome             = JOptionPane.showInputDialog("Digite o nome do mamífero:")                                        ;
        String habitat          = JOptionPane.showInputDialog("Digite o habitat do mamífero:")                                     ;
        String reproducao       = JOptionPane.showInputDialog("Digite o tipo de reprodução do mamífero:")                          ;
        String fecundacao       = JOptionPane.showInputDialog("Digite o tipo de fecundação do mamífero:")                          ;
        float  velocidade_media = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade média do mamífero (em m/s):"));
        String coloracao        = JOptionPane.showInputDialog("Digite a coloração do mamífero:");
        String locomocao        = JOptionPane.showInputDialog("Digite o tipo de locomoção do mamífero:");
        String respiracao       = JOptionPane.showInputDialog("Digite o tipo de respiração do mamífero:");
        String alimento         = JOptionPane.showInputDialog("Digite o alimento do mamífero:");

        Mamifero mamifero = new Mamifero(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao, alimento);
        mamifero.dadosMamifero();
    }
}