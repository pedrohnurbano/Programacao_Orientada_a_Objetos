import java.util.Scanner;

public class Exercicio5
{
    public static void main(String[] args) {
        double Base, Altura, Area;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Programa de Cálculo de Área de Triângulos. \n\n");
        
        System.out.print("Digite o valor da base do triângulo: ");
        Base = entrada.nextDouble();
        
        System.out.print("Digite o valor da altura do triângulo: ");
        Altura = entrada.nextDouble();
        
        Area = (Base * Altura) / 2;
        
        System.out.println("O triângulo de base: " + Base + ", e Altura: " + Altura + ", possui uma área no valor de: " + Area + "cm².");
    }
}