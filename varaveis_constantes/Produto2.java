package ClassesUnicas;

import java.util.Scanner;
public class Produto2 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        
        String nomeProd;
        String codProd;
        double valProd;
        String datFabric;
        
        System.out.println("Digite o nome do produto: ");
        nomeProd = in.next(); in.nextLine();
        
        System.out.println("Digite o código do produto: ");
        codProd = in.next();
        
        System.out.println("Digite o valor do produto: ");
        valProd = in.nextDouble();
        
        System.out.println("Digite a data de fabricação do produto: ");
        datFabric = in.next();
        
        System.out.println("***** Cadastro *****");
        System.out.println("Nome: " + nomeProd);
        System.out.println("Código: " + codProd);
        System.out.println("Valor: " + valProd);
        System.out.println("Fabricação: " + datFabric);
        System.out.println("---------------------");
    }
}