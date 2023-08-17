package ClassesUnicas;

import java.util.Scanner;
public class Viagem {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        
        String carro;
        double KM_Litro;
        double KM_Totais;
        String locSaida;
        String locChegada;
        double valGas;
        
        System.out.println("Digite o local de saída: ");
        locSaida = in.next(); in.nextLine();
        
        System.out.println ("Digite o local de chegada: ");
        locChegada = in.next(); in.nextLine();
        
        System.out.println ("Qual o modelo do seu carro?: ");
        carro = in.next(); in.nextLine();
        
        System.out.println("Quantos kms o seu carro faz por litro?:");
        KM_Litro = in.nextDouble();
        
        System.out.println ("Qual o valor total de kms do local de saída para o local de chegada?:");
        KM_Totais = in.nextDouble();
        
        double totLitros = KM_Totais / KM_Litro;
        
        System.out.print("Você vai precisar de: " + totLitros + " litros de gasolina. ");
        
        System.out.println("Qual o valor do litro de gasolina atualmente?:");
        valGas = in.nextDouble();
        
        double totGasto = valGas * totLitros;
        System.out.println("você vai gastar: R$ " + totGasto);
    
    }
}