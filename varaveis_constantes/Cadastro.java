package ClassesUnicas;

import java.util.Scanner;
public class Cadastro{
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        
        String codAluno;
        String nomeAluno;
        byte idadeAluno;
        double valMensal;
        
        System.out.println("Digite o código do aluno: ");
        codAluno = in.next(); in.nextLine();
        
        System.out.println("Digite o nome do aluno: ");
        nomeAluno = in.next(); in.nextLine();
        
        System.out.println("Digite a idade do aluno: ");
        idadeAluno = in.nextByte();
        
        System.out.println("Digite o valor da Mensalidade: ");
        valMensal = in.nextDouble(); 
        
        System.out.println("***** Cadastro do Aluno *****");
        System.out.println("Código: " + codAluno);
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Idade: " + idadeAluno);
        System.out.println("Mensalidade R$ : " + valMensal);
        System.out.println("------------------------------");
        
    }
}
