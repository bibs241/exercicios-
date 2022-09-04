package primeiroprograma;
import java.lang.String;
import java.util.Scanner;
        
public class PrimeiroPrograma{
    public static void main(String[] args) {
     String time1,time2;
     int gol1,gol2;
     
     //time1
     System.out.println("digite o nome do primeiro time: ");
     Scanner teclado = new Scanner(System.in);
     time1 = teclado.nextLine();
     
     //time2
     System.out.println("digite o nome do sugundo time: ");
     teclado = new Scanner(System.in);
     time2 = teclado.nextLine();
     
     System.out.println("digite o numero de gols do primeiro time");
     gol1 = teclado.nextInt();
     
     System.out.println("digite o numero de gols do segundo time");
     gol2 = teclado.nextInt();
     
     if(gol1 > gol2){
         System.out.println(" o time " + time1 + " ganhou " );
         
     }
     else if(gol2 > gol1){
         System.out.println(" o time " + time2 + " ganhou " );
         
     }
     else{
         System.out.println("empate");
         
     }
             
             
             
             
     
           
    
      
      
      
      
      
      
        
         
               
            
                
        
    }
    }
