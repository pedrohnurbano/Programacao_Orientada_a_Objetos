package Exercicio_02;
import javax.swing.JOptionPane;

public class Transporte {
    private String descricao;
    private String tamanho;
    private float peso;

    public Transporte(String descricao, String tamanho, float peso) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public void dados() {
        String mensagem = "🚗 Dados do Transporte:\n" +
                          "Descrição: " + descricao + "\n" +
                          "Tamanho: " + tamanho + "\n" +
                          "Peso: " + peso + " kg";
        JOptionPane.showMessageDialog(null, mensagem, "Informações do Transporte", JOptionPane.INFORMATION_MESSAGE);
    }
}