package primeiroprograma;
import java.util.Scanner;
        
public class PrimeiroPrograma{
    public static void main(String[] args) {
        float n1,n2,media;
        System.out.println("digite o valor da primeira nota:");
        Scanner teclado = new Scanner(System.in);
        n1 = teclado.nextFloat();
        System.out.println("digite o valor da segunda nota:");
        teclado = new Scanner(System.in);
         n2 = teclado.nextFloat();
        media = (n1 + n2)/2;
        if (media >= 6){
            System.out.println("aprovado");
        }
        else {
            System.out.println("reprovado");
        }
        
        
        
         
               
            
                
        
    }
    }
