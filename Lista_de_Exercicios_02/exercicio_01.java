import java.util.Scanner;

public class exercicio_01
{
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por gentileza, digite o nome do aluno: ");
        String nome = scanner.nextLine();
    
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|  Cursos Superiores - Universidade de São Paulo (USP)  |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| ADM - Administração;                                  |");
        System.out.println("| DIR - Direito;                                        |");
        System.out.println("| CEX - Comércio Exterior.                              |");
        System.out.println("|-------------------------------------------------------|");
    
        System.out.print("Por gentileza, digite o nome do curso desejado: ");
        String curso = scanner.nextLine();
        switch (curso.toUpperCase()) {
            case "ADM":
        System.out.print("Você, " + nome + ", escolheu o curso de Administração.");
                break;
            case "DIR":
        System.out.print("Você, " + nome + ", escolheu o curso de Direito.");
                break;
            case "CEX":
        System.out.print("Você, " + nome + ", escolheu o curso de Comércio Exterior.");
                break;
            default:
                throw new AssertionError();
        }
    }
}