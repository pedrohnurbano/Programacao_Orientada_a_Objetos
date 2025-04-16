package Lista_Arrays;
import java.io.*;

// Exemplo 02 - Busca em um array
// Este programa lê um número inteiro e verifica se ele está presente em um array de inteiros.

public class Exemplo_02 {
    public static void main(String args[]) throws IOException {
        int chave;
        int a[] = {1, 2, 3, 5, 6, 8, 9, 10, 20, 34, 23, 12, 32, 18, 16, 14};
        String resultado;
        
        BufferedReader teclado = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.println("Digite a chave de busca");
        chave = Integer.parseInt(teclado.readLine());
        resultado = "não achou " + chave;

        for (int n = 0; n < a.length; n++) {
            if (a[n] == chave)
                resultado = "achou " + chave;
        }

        System.out.println(resultado);
    }
}