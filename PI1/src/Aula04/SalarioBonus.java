

/**
 *
 * @author victor.salves1
 */
import java.util.Scanner;

public class SalarioBonus {

    public static void main(String args[]) {

        Scanner leia = new Scanner(System.in);
        
    String nome;
    int salario,totaldevendas,ve;
      
        System.out.println("Digite Nome ");
    nome = leia.toString();
        System.out.println("Digite Salário");
        salario = leia.nextInt();
        System.out.println("Digite Vendas Efetuadas");
        ve = leia.nextInt();
        
        totaldevendas = (int) ((ve + 0.15) + salario);
        
        System.out.println("O Total de vendas é : ");
        System.out.printf("%.2f" , totaldevendas);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}}