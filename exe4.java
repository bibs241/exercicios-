package primeiroprograma;
import java.lang.String;
import java.util.Scanner;
        
public class PrimeiroPrograma{
    public static void main(String[] args) {
      String nome,sexo;
      float altura,peso;
     
      //nome
      System.out.println("escreva seu nome :");
      Scanner teclado = new Scanner(System.in);
      nome = teclado.nextLine();
      
      //altura
       System.out.println("escreva sua altura :");
       teclado = new Scanner(System.in);
       altura = teclado.nextFloat();
       
      
      //sexo
      System.out.println("escreva seu sexo");
      sexo = teclado.nextLine();
      
      if(sexo == "M"){
       peso = (float) ((72.7 * altura) - 58);
         
        
          
      }
      else {
          peso = (float) ((62.1 * altura) - 44.7);
                  
      }
      System.out.println("peso ideal : " + peso );
        
          
    
      
      
      
      
      
      
        
         
               
            
                
        
    }
    }
