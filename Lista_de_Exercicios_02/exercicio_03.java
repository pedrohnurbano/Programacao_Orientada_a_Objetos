import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por gentileza, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por gentileza, digite o valor do seu salário: R$");
        double salario = scanner.nextDouble();

        System.out.println("|---------------------------------------------------------|");
        System.out.println("| Cadastro de Cargos - Registro de Dados de Funcionários  |");
        System.out.println("|---------------------------------------------------------|");
        System.out.println("| T - Técnico;                                            |");
        System.out.println("| E - Engenheiro de Software;                             |");
        System.out.println("| A - Analista de Sistemas;                               |");
        System.out.println("| P - Programador;                                        |");
        System.out.println("| W - Web-Designer;                                       |");
        System.out.println("| G - Gerente de Projetos.                                |");
        System.out.println("|---------------------------------------------------------|");
    
        System.out.print("Por gentileza, digite a sigla que diz respeito ao seu cargo: ");
        String cargo = scanner.nextLine();
        switch (cargo.toUpperCase()) {
            case "T":
                System.out.print("Você, " + nome + ", é Técnico e recebe: R$" + salario);
                break;
            case "E":
                System.out.print("Você, " + nome + ", é Engenheiro de Software e recebe: R$" + salario);
                break;
            case "A":
                System.out.print("Você, " + nome + ", é Analista de Sistemas e recebe: R$" + salario);
                break;
            case "P":
                System.out.print("Você, " + nome + ", é Programador e recebe: R$" + salario);
                break;
            case "W":
                System.out.print("Você, " + nome + ", é Web-Designer e recebe: R$" + salario);
                break;
            case "G":
                System.out.print("Você, " + nome + ", é Gerente de Projetos e recebe: R$" + salario);
                break;
            default:
                System.out.println("Sigla inválida. Por favor, insira uma sigla válida.");
                break;
        }
    }
}