package switch_;
import java.util.Scanner;
public class ex2 {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite uma letra entre a e d: ");
        String letra = in.nextLine();
        
        //Switch variavel abre chaves e tudo vai dentro, ultimo caso é a exessao do default.
        
        switch(letra) {
            case "a":
                System.out.println("Apabate");
            break;
            case "b":
                System.out.println("Buriti");
            break;
            case "c":
                System.out.println("Caju");
            break;
            case "d":
                System.out.println("Damasco");
            break;
            default:
                System.out.println("Letra inválida");
        }
    }
}
