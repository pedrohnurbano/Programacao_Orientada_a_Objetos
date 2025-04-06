import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("|--------------------------------------|");
        System.out.println("|  Calculadora Matemática - Operações  |");
        System.out.println("|--------------------------------------|");
        System.out.println("| A - Adição;                          |");
        System.out.println("| S - Subtração;                       |");
        System.out.println("| M - Multiplicação;                   |");
        System.out.println("| D - Divisão.                         |");
        System.out.println("|--------------------------------------|");
    
        System.out.print("Por gentileza, digite a sigla que diz respeito a operação desejada: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o primeiro valor: ");
        double valor2 = scanner.nextDouble();

        switch (cargo.toUpperCase()) {
            case "A":
                double resultado = (valor1 + valor2);
                System.out.print("Resultado da Adição: " + resultado);
                break;
            case "S":
                double result = (valor1 - valor2);
                System.out.print("Resultado da Subtração: " + result);
                break;
            case "M":
                double resultat = (valor1 * valor2);
                System.out.print("Resultado da Multiplicação: " + resultat);
                break;
            case "D":
                double ergebnis = (valor1 / valor2);
                System.out.print("Resultado da Divisão: " + ergebnis);
                break;
            default:
                System.out.println("Sigla inválida. Por favor, insira uma sigla válida.");
                break;
        }
    }
}