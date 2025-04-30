package Exercicio_02;
import javax.swing.JOptionPane;

public class Cadastro_Transportes {
    public static void main(String[] args) {
        String escolhaStr = JOptionPane.showInputDialog("Escolha o tipo de transporte para cadastrar:\n1 - A�reo\n2 - Aqu�tico\n3 - Terrestre");
        int escolha;

        try {
            escolha = Integer.parseInt(escolhaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Op��o inv�lida! Encerrando o programa.");
            return;
        }

        if (escolha == 1) {
            cadastrarAereo();
        } else if (escolha == 2) {
            cadastrarAquatico();
        } else if (escolha == 3) {
            cadastrarTerrestre();
        } else {
            JOptionPane.showMessageDialog(null, "Op��o inv�lida! Escolha 1 para A�reo, 2 para Aqu�tico ou 3 para Terrestre.");
        }
    }

    private static void cadastrarAereo() {
        String descricao = JOptionPane.showInputDialog("Digite a descri��o do transporte a�reo:");
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho do transporte a�reo:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte a�reo (em kg):"));
        int numero_passageiros = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de passageiros do transporte a�reo:"));

        Aereo aereo = new Aereo(descricao, tamanho, peso, numero_passageiros);
        aereo.dadosAereo();
    }

    private static void cadastrarAquatico() {
        String descricao = JOptionPane.showInputDialog("Digite a descri��o do transporte aqu�tico:");
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho do transporte aqu�tico:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte aqu�tico (em kg):"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do transporte aqu�tico (em metros):"));

        Aquatico aquatico = new Aquatico(descricao, tamanho, peso, altura);
        aquatico.dadosAquatico();
    }

    private static void cadastrarTerrestre() {
        String descricao = JOptionPane.showInputDialog("Digite a descri��o do transporte terrestre:");
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho do transporte terrestre:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do transporte terrestre (em kg):"));
        int numero_rodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de rodas do transporte terrestre:"));

        Terrestre terrestre = new Terrestre(descricao, tamanho, peso, numero_rodas);
        terrestre.dadosTerrestre();
    }
}