package Exercicio_01;
import javax.swing.JOptionPane;

// Classe principal Cadastro_Animais:
// Esta classe é responsável por coletar os dados do usuário e criar instâncias de Peixe, Mamífero ou Ave.
public class Cadastro_Animais {
    public static void main(String[] args) {
        String escolhaStr = JOptionPane.showInputDialog("Escolha o tipo de animal:\n1 - Peixe\n2 - Mamífero\n3 - Ave");
        int escolha       = Integer.parseInt(escolhaStr);

        String nome            = JOptionPane.showInputDialog("Nome: ");
        String habitat         = JOptionPane.showInputDialog("Habitat: ");
        String reproducao      = JOptionPane.showInputDialog("Tipo de reprodução: ");
        String fecundacao      = JOptionPane.showInputDialog("Tipo de fecundação: ");
        float velocidade_media = Float.parseFloat(JOptionPane.showInputDialog("Velocidade média (m/s): "));
        String coloracao       = JOptionPane.showInputDialog("Coloração: ");
        String locomocao       = JOptionPane.showInputDialog("Tipo de locomoção: ");
        String respiracao      = JOptionPane.showInputDialog("Tipo de respiração: ");

        if (escolha == 1) {
            String caracteristica = JOptionPane.showInputDialog("Característica do peixe: ");
            Peixe peixe = new Peixe(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao, caracteristica);
            peixe.dadosPeixe();
        } else if (escolha == 2) {
            String alimento = JOptionPane.showInputDialog("Alimento do mamífero: ");
            Mamifero mamifero = new Mamifero(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao, alimento);
            mamifero.dadosMamifero();
        } else if (escolha == 3) {
            String tipoDeVoo = JOptionPane.showInputDialog("Tipo de voo da ave: ");
            Ave ave = new Ave(nome, habitat, reproducao, fecundacao, velocidade_media, coloracao, locomocao, respiracao, tipoDeVoo);
            ave.dadosAve();
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida! Escolha 1 para Peixe, 2 para Mamífero ou 3 para Ave.");
        }
    }
}
