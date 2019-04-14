/*
popular vetor = Preencher com valores staticos, ja definidos
varrer vetor = percorrer suas posiçoes 
indice do vetor  = posiçoes (0,1,2,3...até o tamanho definido)*/

package Aula10;

import java.util.Scanner;

/**
 *
 * @author victor.salves1
 */
public class Vetores {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        int n = 10;
        int[] v = new int [n];
        
        for (int i = 0; i<n; i++){
            System.out.println("Digite a o numero da posição º"+(i+1));
            int popula = leitor.nextInt();
        v[i] = popula;        
        }
       int soma = 0;
       int menor = v[0];
       int maior = v[0];
       
        for (int i = 0; i < n; i++) {
            soma  = soma +v[i];
            if (v[i]<menor) 
            menor = v[i];
            
            if (v[i]> maior) 
            maior = v[i];    
            
            
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("v["+i+"]: "+ v[i]);
            
            if(v[i]==menor)
                System.out.print(" <-- menor");
            else if(v[i]==maior)
                System.out.print(" <--maior");
            System.out.println("");
            
            
        }
        System.out.println("a soma é: "+ soma);
        
        
    }
}
