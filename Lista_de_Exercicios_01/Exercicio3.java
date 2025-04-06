import java.util.Scanner;

public class Exercicio3
{
    public static void main(String[] args) {
        String NomeCliente, NomeProduto;
        double Preco, ValorCompra, Resultado;
        int Quantidade;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Programa de Cálculo de Compras. \n\n");
        
        System.out.print("Digite o nome do cliente: ");
        NomeCliente = entrada.nextLine();
        
        System.out.print("Digite o nome do produto: ");
        NomeProduto = entrada.nextLine();
        
        System.out.print("Digite a quantidade do produto comprado: ");
        Quantidade = entrada.nextInt();
        
        System.out.print("Digite o preço do produto: ");
        Preco = entrada.nextDouble();
        
        Resultado = Preco * Quantidade;
        
        System.out.println("O cliente: " + NomeCliente + ", comprou: " + NomeProduto + ", na quantidade de: " + Quantidade + ", no preço de R$" + Preco + ", totalizando um valor de: R$" + Resultado);
    }
}