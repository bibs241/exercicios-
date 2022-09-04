package primeiroprograma;
import java.util.Scanner;
        
public class PrimeiroPrograma{
    public static void main(String[] args) {
        float n1,n2,n3,media; 
        System.out.println("digite o valor da primeira nota:");
        Scanner teclado = new Scanner(System.in);
        n1 = teclado.nextFloat();
        System.out.println("digite o valor da segunda nota:");
        teclado = new Scanner(System.in);
         n2 = teclado.nextFloat();
        System.out.println("digite o valor da terceira nota:");
        teclado = new Scanner(System.in);
         n3 = teclado.nextFloat();
         media = (n1 * 2 + n2 * 3 + n3 * 5)/10;
         System.out.println("media final é :" + media );
         
        
        
        
         
               
            
                
        
    }
    }
