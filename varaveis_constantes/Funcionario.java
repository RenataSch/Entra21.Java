package ClassesUnicas;

import java.util.Scanner;
public class Funcionario {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        
        String funcionario = "João";
        System.out.println( " O nome do funcioário é: " + funcionario);
        
        double salBase = 3800.00;
        System.out.println(" O salário Base de João é: " + salBase);
        
        System.out.println("***** Proventos *****");
        double abono = salBase * 0.04;
        double insalubridade = salBase * 0.08;
        double proventos = abono + insalubridade;
        System.out.println("total de proventos: " + proventos);
        
        System.out.println("***** Descontos *****");
        double INSS = salBase * 0.09;
        double VR = salBase * 0.08;
        double VT = salBase * 0.06;
        double descontos = INSS + VR + VT;
        System.out.println("total de descontos: " + descontos);
        
        double salLiq = salBase + proventos - descontos;
        System.out.println( " O salário líquido de João será: R$" + salLiq); 
            
}
}

