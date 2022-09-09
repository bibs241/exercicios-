import javax.swing.JOptionPane;
public class Exerciciosoma10 {
 
 
    public static void main(String[] args) {
 
 
        int numero = 0;
        int soma = 0;
 
        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe um número");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
 
            soma = soma + numero;
        }
 
        System.out.println("A soma total dos números lidos é: " + soma);
    }
 
}
