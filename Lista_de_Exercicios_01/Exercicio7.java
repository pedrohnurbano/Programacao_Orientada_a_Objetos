import java.util.Scanner;

public class Exercicio7
{
    public static void main(String[] args) {
        double ValorIngresso = 20.0;
        double FaturamentoDiario, FaturamentoSemanal, FaturamentoMensal;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Programa de Cálculo de Faturamento. \n\n");
        
        FaturamentoDiario = (20.0 * 80) * 3;
        FaturamentoSemanal = FaturamentoDiario * 7;
        FaturamentoMensal = FaturamentoDiario * 30;
        
        System.out.println("Faturamento diário é de: R$" + FaturamentoDiario + ", semanal é de: R$" + FaturamentoSemanal + ", e mensal é de: R$" + FaturamentoMensal);
    }
}