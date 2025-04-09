import javax.swing.JOptionPane; // Importa a biblioteca JOptionPane para criar caixas de di�logo interativas (entrada e sa�da de dados)

public class Exercicio_08 { // Declara a classe p�blica chamada Exercicio_08
    public static void main(String[] args) { // M�todo principal onde o programa come�a a ser executado
        String[] pessoas = new String[10]; // Declara um vetor de Strings com 10 posi��es para armazenar os nomes das pessoas

        for (int i = 0; i < pessoas.length; i++) { // La�o de repeti��o que percorre o vetor de 0 at� 9
            pessoas[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":"); // Solicita ao usu�rio que digite um nome e armazena no vetor
        }

        String nome = JOptionPane.showInputDialog("Digite um nome para verificar se est� na lista:"); // Solicita ao usu�rio que digite um nome para verificar se est� na lista
        int contagem = 0; // Inicializa a vari�vel contagem com 0, para contar quantas vezes o nome aparece no vetor

        for (int i = 0; i < pessoas.length; i++) { // La�o de repeti��o que percorre o vetor completo novamente
            if (pessoas[i].equalsIgnoreCase(nome)) { // Verifica se o nome na posi��o atual do vetor � igual ao nome digitado, ignorando mai�sculas/min�sculas
                contagem++; // Incrementa a vari�vel contagem em 1 se o nome for encontrado
            }
        }

        if (contagem > 0) { // Verifica se o nome foi encontrado ao menos uma vez no vetor
            JOptionPane.showMessageDialog(null, "O nome: " + nome.toUpperCase() + ", est� cadastrado na lista."); // Exibe mensagem informando que o nome est� na lista
        } else { // Caso o nome n�o tenha sido encontrado no vetor
            JOptionPane.showMessageDialog(null, "O nome: " + nome.toUpperCase() + ", n�o est� cadastrado na lista."); // Exibe mensagem informando que o nome n�o est� na lista
        }
    }
}