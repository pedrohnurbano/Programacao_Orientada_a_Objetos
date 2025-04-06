import java.util.Scanner;

public class exercicio_02
{
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por gentileza, digite seu nome: ");
        String nome = scanner.nextLine();
    
        System.out.println("|------------------|");
        System.out.println("|  Estados Civis   |");
        System.out.println("|------------------|");
        System.out.println("| S - Solteiro;    |");
        System.out.println("| C - Casado;      |");
        System.out.println("| V - Viúvo;       |");
        System.out.println("| D - Divorciado.  |");
        System.out.println("|------------------|");
    
        System.out.print("Por gentileza, digite a sigla que diz respeito ao seu estado civil: ");
        String curso = scanner.nextLine();
        switch (curso.toUpperCase()) {
            case "S":
        System.out.print("Você, " + nome + ", é solteiro (a).");
                break;
            case "C":
        System.out.print("Você, " + nome + ", é casado (a).");
                break;
            case "V":
        System.out.print("Você, " + nome + ", é viúvo (a).");
                break;
            case "D":
        System.out.print("Você, " + nome + ", é divorciado (a).");
                break;
            default:
                throw new AssertionError();
        }
    }
}