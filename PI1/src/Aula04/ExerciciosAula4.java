
import java.util.Scanner;


public class ExerciciosAula4 {
    public static void main(String[] agrs){
        // MASSA CORPORAL
        double p,a;
        double imc;       
        Scanner leia = new Scanner(System.in);
       System.out.println("Digite Altura.");
              a = leia.nextFloat();
              System.out.println("Digite Peso");
              p = leia.nextFloat();
                     
         
    imc = p/(a*a);
    System.out.printf("Seu IMC é: "+ "%.2f" ,imc);
    
    
    
    
    
    }
    
}
    
    
