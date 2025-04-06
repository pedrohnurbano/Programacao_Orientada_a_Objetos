import java.util.Scanner;

public class Exercicio1
{
    public static void main(String[] args) {
        String NomeUsuario, EnderecoUsuario, BairroUsuario, CidadeUsuario, EstadoUsuario;
        int NumeroUsuario;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Programa de Cadastro de Usuário. \n\n");
        
        System.out.print("Digite seu nome: ");
        NomeUsuario = entrada.nextLine();
        
        System.out.print("Digite seu endereço: ");
        EnderecoUsuario = entrada.nextLine();
        
        System.out.print("Digite seu bairro: ");
        BairroUsuario = entrada.nextLine();
        
        System.out.print("Digite sua cidade: ");
        CidadeUsuario = entrada.nextLine();
        
        System.out.print("Digite seu estado: ");
        EstadoUsuario = entrada.nextLine();
        
        System.out.print("Digite seu número de telefone: ");
        NumeroUsuario = entrada.nextInt();
        
        System.out.println("O usuário " + NomeUsuario + " mora no endereço: " + EnderecoUsuario + " no bairro " + BairroUsuario + " na cidade de " + CidadeUsuario + " e tem número de telefone descrito por: " + NumeroUsuario);
    }
}