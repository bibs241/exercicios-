import java.util.Scanner;
import java.util.*;

public class PrimeiroPrograma {
    
    public static void main(String args[]) {
    int numero = 0;
    for(int j = 0; j < 10; j++){
       System.out.println("digite um numero:");
       Scanner teclado = new Scanner(System.in);
       numero = teclado.nextInt(); 
       if(numero%2 == 0){
           System.out.println("par");
       }
       else{
           System.out.println("impar");
       }
    
       
    }     
    }
} 
