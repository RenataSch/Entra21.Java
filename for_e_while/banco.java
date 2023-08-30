import java.util.Scanner;
public class banco {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        
        double saldo = 5000;
        double operacao;
        double encerrar = 1;
        double deposito = 2;
        double saque = 3;
        int num;
        
        
        do{
            System.out.println("Qual operacao você deseja efetuar? (1-encerrar, 2-deposito, 3-saque)");
            operacao = in.nextDouble();
            
            if (operacao == 2) {
                System.out.printf("\nDigite o valor que deseja depositar: \n");
                deposito = in.nextDouble();
                System.out.println("Seu saldo é de: " + (saldo + deposito));
                saldo = saldo + deposito;
            } else if (operacao ==3) {
                System.out.printf("\nDigite o valor que deseja sacar: \n");
                saque = in.nextDouble();
                System.out.println("Seu saldo é de: " + (saldo - saque));
                saldo = saldo - deposito;
            } else if (operacao == 1) {
                System.out.printf("\nOperacao encerrada");
            } else {
                System.out.printf("\nOperacao invalida");
            }
            
            }
            while (operacao !=1);
        }
    }
