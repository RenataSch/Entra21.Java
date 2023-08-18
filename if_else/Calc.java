import java.util.Scanner;
public class Calc {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        
        int n1;
        int n2;
        int soma;
        int mult;
        
        System.out.println("Digite o número UM: ");
        n1 = in.nextInt();
        
        System.out.println("Digite o número dois: ");
        n2 = in.nextInt();
        
        soma = n1 + n2;
        mult = n1 * n2;
        
        System.out.println("O resultado da soma é: " + soma);
        
        if (soma % 2 ==0){
            System.out.println("o número é par");
        } else {
            System.out.println("o número é impar");
        }
    }
}        
