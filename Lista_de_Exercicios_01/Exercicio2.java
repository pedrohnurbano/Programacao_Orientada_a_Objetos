import java.util.Scanner;

public class Exercicio2
{
    public static void main(String[] args) {
        String NomeAluno, CursoAluno, DisciplinaAluno;
        double Nota1, Nota2, Nota3, Media;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Programa de Cadastro de Alunos e Médias. \n\n");
        
        System.out.print("Digite o nome do aluno: ");
        NomeAluno = entrada.nextLine();
        
        System.out.print("Digite o nome do curso do aluno: ");
        CursoAluno = entrada.nextLine();
        
        System.out.print("Digite o nome da disciplina do aluno: ");
        DisciplinaAluno = entrada.nextLine();
        
        System.out.print("Digite a Nota 1: ");
        Nota1 = entrada.nextDouble();
        
        System.out.print("Digite a Nota 2: ");
        Nota2 = entrada.nextDouble();
        
        System.out.print("Digite a Nota 3: ");
        Nota3 = entrada.nextDouble();
        
        Media = (Nota1 + Nota2 + Nota3) / 3;
        
        System.out.println("O aluno: " + NomeAluno + ", do curso: " + CursoAluno + ", da disciplina: " + DisciplinaAluno + ", tem Média igual a: " + Media);
    }
}