/*Considere uma aplica��o que solicite uma seq��ncia de n�meros inteiros positivos para o usu�rio, e informe o maior e o menor deles. A seq��ncia n�o pode conter mais do que 10 n�meros. Internamente, a aplica��o dever� armazenar os n�meros fornecidos pelo usu�rio em um array apontado pela vari�vel numeros. Somente depois que o usu�rio fornecer todos os valores, a aplica��o dever� determinar os resultados e apresent�-los para o usu�rio.*/

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
