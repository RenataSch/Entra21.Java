import java.util.Scanner;
public class ex28 {
public static void main (String[]args) {
	Scanner in = new Scanner(System.in);
			
		int filme;
		int dia;
		int hora;
		String end;
		int filme2;
	
	System.out.println("*****Cinema*****");
	System.out.printf("\n-----Catalogo-----\n");
	
	System.out.println("Escolha o filme que você quer assistir: ");
	
	System.out.println("1 - Barbie");
	System.out.println("2 - Velozes e Furiosos 10");
	System.out.println("3 - Bezouro Azul ");
	System.out.println("4 - Elementos ");
	System.out.println("5 - A pequena Sereia");
	filme = in.nextInt();
	
	System.out.println("Escolha o horário: ");
	
	switch(filme){
	        case 1: 
	            System.out.println("18, 19, 20, 21");
	        hora=in.nextInt();
	        System.out.println(" Você escolheu: " + hora);
	        break;
	        
	        case 2:
	            System.out.println("18, 22, 23");
	        hora=in.nextInt();
	        System.out.println(" Você escolheu: " + hora);
	        break;
	        
	        case 3:
	            System.out.println("18, 19, 22, 23");
	        hora=in.nextInt();
	        System.out.println(" Você escolheu: " + hora);
	        break;
	        
	        case 4:
	            System.out.println(" 19, 20, 23");
	         hora=in.nextInt();
	        System.out.println(" Você escolheu: " + hora);
	        break;
	        
	        case 5:
	            System.out.println("18, 19,");
	        hora=in.nextInt();
	        System.out.println(" Você escolheu: " + hora);
	        break;
	            default:
	                System.out.println("Erro");
        }
        System.out.println("Escolha o dia: 1-domingo, 2-segunda, 3-terça, 4-quarta, 5-quinta, 6-sexta, 7-sabado" );
        dia = in.nextInt();
        
        switch(dia){
        
            case 1:
             System.out.println("Finalizar compra");
             break;
             
             case 2:
             System.out.println("Finalizar compra");
             break;
             
             case 3:
             System.out.println("Finalizar compra");
             break;
             
             case 4:
             System.out.println("Finalizar compra");
             break;
             
             case 5:
             System.out.println("Finalizar compra");
             break;
             
             case 6:
             System.out.println("Finalizar compra");
             break;
             
             case 7:
             System.out.println("Finalizar compra");
             break;
         }
}
}