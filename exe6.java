import java.util.Scanner;
import java.util.*;

public class PrimeiroPrograma {
    
    public static void main(String args[]) {
       int numero;
       int numeros[]= new int[10];
       int j = 0;
       int m = 0;
       for(int i=0; i < 10; i++ ){
           
        System.out.println("digite os valores: ");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        
        numeros[i] = numero;
       
        
        
        
        
       }
       for(int p = 0; p < numeros.length; p++){
           if(p == 0){
               j = numeros[p];
               continue;
           }
           if(numeros[p] >= j){
               j = numeros[p];
              
           }
           else{
               continue;
           }
           
            
              
       }    
       for(int k = 0; k < numeros.length; k++){
           if(k == 0){
               m = numeros[k];
               continue;
           }
           if(m >= numeros[k]){
               m = numeros[k];
           }
           else{
               continue;
           }
          
              
       }    
       
        System.out.println("o menor numero e :" + m);
        System.out.println("o maior numero e: " + j);
        
                
               
    }
}
