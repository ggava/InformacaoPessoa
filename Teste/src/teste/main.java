package teste;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        //obtendo as informacoes
        //p1
        System.out.println("P1 -->");
        System.out.print("Nome: ");
        p1.setNome(input.nextLine());
        
        System.out.print("CPF: ");
        p1.setCpf(input.nextLine());
        
        System.out.print("idade: ");
        p1.setIdade(Integer.parseInt(input.nextLine()));
        
        //p2
        System.out.println("\nP2 -->");
        System.out.print("Nome: ");
        p2.setNome(input.nextLine());
        
        System.out.print("CPF: ");
        p2.setCpf(input.nextLine());
        
        System.out.print("idade: ");
        p2.setIdade(Integer.parseInt(input.nextLine()));
        
        //p3
        System.out.println("\nP3 -->");
        System.out.print("Nome: ");
        p3.setNome(input.nextLine());
        
        System.out.print("CPF: ");
        p3.setCpf(input.nextLine());
        
        System.out.print("idade: ");
        p3.setIdade(Integer.parseInt(input.nextLine()));
        
        
        //Imprimindo os resultados
        System.out.println("\n\nIMPRIMINDO OS RESULTADOS");
        
        System.out.printf("\n P1\n Nome: %s \n CPF: %s \n idade: %d", p1.getNome(), p1.getCpf(), p1.getIdade());
        System.out.printf("\n\n P2\n Nome: %s \n CPF: %s \n idade: %d", p2.getNome(), p2.getCpf(), p2.getIdade());
        System.out.printf("\n\n P3\n Nome: %s \n CPF: %s \n idade: %d", p3.getNome(), p3.getCpf(), p3.getIdade());
        
    }
}
