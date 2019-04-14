package Aula5;

import java.util.Scanner;

/**
 *
 * @author Flavio
 */
public class Exercicio08 {
    public static void main (String args []){
    
        Scanner tc = new Scanner (System.in);
        System.out.println("Digite o ano atual");
    int anoA = tc.nextInt();
        System.out.println("Digite ano de nascimento");
        int anoN = tc.nextInt();
        
        int idade;
        idade = anoA-anoN;
        if (idade<16){System.out.println("Não pode votar esse ano");}
        else {System.out.println("Pode votar esse ano!");}
        
    
    
    
    
    }
    
}
