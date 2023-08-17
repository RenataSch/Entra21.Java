package ClassesUnicas;

import java.util.Scanner;

public class Produto{
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        String nomeProd;
        // Se quiser adicionar o nome do produto deve ser: String nomeProd = "nome";
        double valUnit;
        int quant;
        
        System.out.println("Digite o nome do Produto: ");
        nomeProd = in.next();
        
        System.out.println("Qual o valor unitário do Produto?: ");
        valUnit = in.nextDouble();
        
        System.out.println("Qual a quantidade do Produto?: ");
        quant = in.nextInt();
        
        double valTot = valUnit*quant; // se criar o valTot lá em cima aqui só precisa colocar valTot = e a operação.
        System.out.println("O valor total do produto foi: R$ " + valTot);
        
        double acrescimo = valTot + (valTot * 0.07);
        System.out.println(" Com acrescimo de 7%: R$ " + acrescimo);
    }
}
