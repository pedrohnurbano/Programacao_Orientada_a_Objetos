package Lista_Arrays;
import javax.swing.JOptionPane;

// Exercicio 08 - Ler 10 nomes e verificar se um nome fornecido pelo usuário está cadastrado na lista.
// Este programa lê 10 nomes e verifica se um nome fornecido pelo usuário está cadastrado na lista.

public class Exercicio_08 {
    public static void main(String[] args) {
        String[] pessoas = new String[10];

        // Lendo os nomes fornecidos pelo usuário
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
        }

        // Solicitando o nome a ser pesquisado
        String nome = JOptionPane.showInputDialog("Digite o nome que deseja verificar na lista:").toLowerCase();
        boolean encontrado = false;

        // Verificando se o nome está na lista
        for (String pessoa : pessoas) {
            if (pessoa.equalsIgnoreCase(nome)) {
                encontrado = true;
                break;
            }
        }

        // Exibindo o resultado
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "O nome \"" + nome.toUpperCase() + "\" está cadastrado na lista.");
        } else {
            JOptionPane.showMessageDialog(null, "O nome \"" + nome.toUpperCase() + "\" não está cadastrado na lista.");
        }
    }
}