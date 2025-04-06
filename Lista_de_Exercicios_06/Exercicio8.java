import java.util.Scanner;

public class Exercicio8
{
    public static void main(String[] args) {
        String NomeFuncionario;
        int HorasTrabalhadas;
        double ValorHoraTrabalhada, SalarioBruto, SalarioBase, Desconto;
        double DescontoINSS = 0.02;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Programa de Cálculo Salarial 2.0. \n\n");
        
        System.out.println("Digite o nome do funcionário:");
        NomeFuncionario = entrada.nextLine();
        
        System.out.println("Digite quantas horas foram trabalhadas:");
        HorasTrabalhadas = entrada.nextInt();
        
        System.out.println("Digite o valor da hora trabalhada:");
        ValorHoraTrabalhada = entrada.nextDouble();
        
        SalarioBase = (HorasTrabalhadas * ValorHoraTrabalhada);
        Desconto = SalarioBase * DescontoINSS;
        SalarioBruto = SalarioBase - Desconto;
        
        System.out.println("O funcionário: " + NomeFuncionario + ", recebeu um salário no valor de: R$" + SalarioBruto);
    }
}