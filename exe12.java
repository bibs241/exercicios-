import java.util.Scanner;
import java.util.*;

public class PrimeiroPrograma {
    
    public static void main(String args[]) {
    int numero = 0;
    int verificador = 0;
    for(int j = 0; j < 10; j++){
        System.out.println("digite um numero :");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        for(int k = 1; k < numero; k++ ){
             if(numero == 2){
                System.out.println("o numero e primo");
                break;
            }
            if(k == 1 ){
                continue;
            }
           
            
            
            
            
            
           if(k == numero - 1){
                if(numero % k  == 0 ){
                    System.out.println("o numero nao e primo");
                    verificador = 1;
                    break;
                } 
                else{
                    System.out.println("o numero e primo");
                }
           
                       }  
           
           
            
            
           if(numero % k  == 0 ){
               System.out.println("o numero n e primo");
               verificador = 1;
               break;
           }
           else{
               continue;
           }
        }
        
                
    
    
       
    }     
    }
} 
