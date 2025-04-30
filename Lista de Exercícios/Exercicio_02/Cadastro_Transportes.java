package Exercicio_02;
import javax.swing.JOptionPane;

public class Cadastro_Transportes {
    public static void main(String[] args) {
        String escolhaStr = JOptionPane.showInputDialog("Escolha o tipo de transporte para cadastrar:\n1 - Aéreo\n2 - Aquático\n3 - Terrestre");
        int escolha;

        try {
            escolha = Integer.parseInt(escolhaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opção inválida! Encerrando o programa.");
            return;
        }

        if (escolha == 1) {
            cadastrarAereo();
        } else if (escolha == 2) {
            cadastrarAquatico();
        } else if (escolha == 3) {
            cadastrarTerrestre();
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida! Escolha 1 para Aéreo, 2 para Aquático ou 3 para Terrestre.");
        }
    }

    private static void cadastrarAereo() {
        String descricao = JOptionPane.showInputDialog("Digite a descrição do transporte aéreo:");
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho do transporte aéreo:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte aéreo (em kg):"));
        int numero_passageiros = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de passageiros do transporte aéreo:"));

        Aereo aereo = new Aereo(descricao, tamanho, peso, numero_passageiros);
        aereo.dadosAereo();
    }

    private static void cadastrarAquatico() {
        String descricao = JOptionPane.showInputDialog("Digite a descrição do transporte aquático:");
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho do transporte aquático:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte aquático (em kg):"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do transporte aquático (em metros):"));

        Aquatico aquatico = new Aquatico(descricao, tamanho, peso, altura);
        aquatico.dadosAquatico();
    }

    private static void cadastrarTerrestre() {
        String descricao = JOptionPane.showInputDialog("Digite a descrição do transporte terrestre:");
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho do transporte terrestre:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte terrestre (em kg):"));
        int numero_rodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de rodas do transporte terrestre:"));

        Terrestre terrestre = new Terrestre(descricao, tamanho, peso, numero_rodas);
        terrestre.dadosTerrestre();
    }
}