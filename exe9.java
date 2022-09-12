import java.util.Scanner;
import java.util.*;

public class PrimeiroPrograma {
    
    public static void main(String args[]) {
    int bool = 0;
    int numero = 0;
    while( bool == 0){
        System.out.println("digite um valor valido de 1 a 10");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
       if(numero >= 1 && numero <= 10){
           bool = 1;
       }
       else{
           System.out.println("numero invalido");
       }
              
    }
    
     for(int j = 0; j < 11; j++){
         System.out.println("o valor de:" + numero + "X" + j + "=" + j*numero);
     }
         
                
               
    }
} 
