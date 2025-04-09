import javax.swing.JOptionPane; // Importa a biblioteca JOptionPane para criar caixas de diálogo interativas (entrada e saída de dados)

public class Exercicio_08 { // Declara a classe pública chamada Exercicio_08
    public static void main(String[] args) { // Método principal onde o programa começa a ser executado
        String[] pessoas = new String[10]; // Declara um vetor de Strings com 10 posições para armazenar os nomes das pessoas

        for (int i = 0; i < pessoas.length; i++) { // Laço de repetição que percorre o vetor de 0 até 9
            pessoas[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":"); // Solicita ao usuário que digite um nome e armazena no vetor
        }

        String nome = JOptionPane.showInputDialog("Digite um nome para verificar se está na lista:"); // Solicita ao usuário que digite um nome para verificar se está na lista
        int contagem = 0; // Inicializa a variável contagem com 0, para contar quantas vezes o nome aparece no vetor

        for (int i = 0; i < pessoas.length; i++) { // Laço de repetição que percorre o vetor completo novamente
            if (pessoas[i].equalsIgnoreCase(nome)) { // Verifica se o nome na posição atual do vetor é igual ao nome digitado, ignorando maiúsculas/minúsculas
                contagem++; // Incrementa a variável contagem em 1 se o nome for encontrado
            }
        }

        if (contagem > 0) { // Verifica se o nome foi encontrado ao menos uma vez no vetor
            JOptionPane.showMessageDialog(null, "O nome: " + nome.toUpperCase() + ", está cadastrado na lista."); // Exibe mensagem informando que o nome está na lista
        } else { // Caso o nome não tenha sido encontrado no vetor
            JOptionPane.showMessageDialog(null, "O nome: " + nome.toUpperCase() + ", não está cadastrado na lista."); // Exibe mensagem informando que o nome não está na lista
        }
    }
}