import java.util.Scanner;
public class Numero {
    public static void main (String[]arg){
        Scanner in = new Scanner(System.in);
        
        Telefone tel = new Telefone();
        
        System.out.println("Informe o DDD: ");
        tel.setDDD(in.nextInt());
        
        System.out.println("Informe os 5 primeiros números: ");
        tel.setPrim(in.nextInt());
        
        System.out.println("Informe osl 4 útimos números: ");
        tel.setUlt(in.nextInt());
        
        System.out.println(tel);
    }
}
