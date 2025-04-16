package Lista_Arrays;
import java.io.*;

// Exemplo 03 - Cálculo da média de notas
// Este programa lê 4 notas de um aluno, calcula a média e exibe as notas e a média.

public class Exemplo_03 {
    public static void main(String args[]) throws IOException {
        double notas[] = new double[4];
        double soma = 0.0;
        double media;
        int i;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        for (i = 0; i < 4; i++) {
            notas[i] = Double.parseDouble(teclado.readLine());
            soma = soma + notas[i];
        }

        media = soma / 4;
        System.out.println("A média é " + media);

        for (i = 0; i < 4; i++) {
            System.out.println("A nota " + (i + 1) + " é " + notas[i]);
        }
    }
}