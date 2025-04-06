import java.util.Scanner;

public class Exercicio4
{
    public static void main(String[] args) {
        String NomeFuncionario, CargoFuncionario;
        double SalarioFuncionario, NovoSalario, CalculoAumento;
        double Aumento = 0.5;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Programa de Cálculo de Salário. \n\n");
        
        System.out.print("Digite o nome do funcionário: ");
        NomeFuncionario = entrada.nextLine();
        
        System.out.print("Digite o nome do cargo do funcionário: ");
        CargoFuncionario = entrada.nextLine();
        
        System.out.print("Digite o salário do funcionário atualmente: ");
        SalarioFuncionario = entrada.nextDouble();
        
        NovoSalario = SalarioFuncionario + (SalarioFuncionario * Aumento);
        CalculoAumento = SalarioFuncionario * Aumento;
        
        System.out.println("O funcionário: " + NomeFuncionario + ", de cargo: " + CargoFuncionario + ", recebeu um aumento de: R$" + CalculoAumento + ", totalizando um novo salário no valor de: R$" + NovoSalario);
    }
}