/*Considere uma aplicação que solicite uma seqüência de números inteiros positivos para o usuário, e informe o maior e o menor deles. A seqüência não pode conter mais do que 10 números. Internamente, a aplicação deverá armazenar os números fornecidos pelo usuário em um array apontado pela variável numeros. Somente depois que o usuário fornecer todos os valores, a aplicação deverá determinar os resultados e apresentá-los para o usuário.*/

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        int maior = 0, menor = 99;
    int[] numeros = new int[10];
        Scanner dados = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = dados.nextInt();
            if (numeros[i] > maior) {
            maior = numeros[i];
            }
            if (numeros[i] < menor) {
            menor = numeros[i];
            }            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Numeros: " + numeros[i]);
        }
        System.out.println("Maior valor do array: " + maior);        
        System.out.println("Menor valor do array: " + menor);
        dados.close();
    }
}
