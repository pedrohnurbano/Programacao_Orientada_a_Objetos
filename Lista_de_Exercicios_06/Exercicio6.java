import java.util.Scanner;

public class Exercicio6
{
    public static void main(String[] args) {
        String NomePessoa;
        double Peso, Altura, IMC;
        int Idade;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Programa de Cálculo IMC. \n\n");
        
        System.out.print("Digite o seu nome: ");
        NomePessoa = entrada.nextLine();
        
        System.out.print("Digite a sua idade: ");
        Idade = entrada.nextInt();
        
        System.out.print("Digite o seu peso: ");
        Peso = entrada.nextDouble();

        System.out.print("Digite a sua altura: ");
        Altura = entrada.nextDouble();
        
        IMC = Peso / (Altura * Altura);
        
        System.out.println("A pessoa de nome: " + NomePessoa + ", possui um IMC de: " + IMC);
    }
}