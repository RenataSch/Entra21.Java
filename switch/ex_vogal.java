package switch_;

//fazer pelo exception - import java.io.IOExcepton;
import java.util.Scanner;
public class ex_vogal {
 public static void main(String[]args) { // fazer pelo exception - throws IOException {
     Scanner in = new Scanner(System.in);
     // fazer pelo exception - char o = 'b'; // variavel já declarada
     char o;
     System.out.println("Digite uma letra: ");
     o = in.next().charAt(0); //ou simplesmente mudar para String e fazer in.nextLine;
     //o = (char)System.in.read();
     
     switch(o) {
         case 'a':
             System.out.println("Vogal");
         break;
         case 'e':
             System.out.println("Vogal");
         break;
         case 'i':
             System.out.println("Vogal");
         break;
         case 'o':
             System.out.println("Vogal");
         break;
         case 'u':
             System.out.println("Vogal");
         break;
         case 'A':
             System.out.println("Vogal");
         break;
         case 'E':
             System.out.println("Vogal");
         break;
         case 'I':
             System.out.println("Vogal");
         break;
         case 'O':
             System.out.println("Vogal");
         break;
         case 'U':
             System.out.println("Vogal");
         break;
         default:
             System.out.println("Consoante");
         
         
     }
 }
}