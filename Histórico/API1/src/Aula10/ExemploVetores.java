
package Aula10;

import java.util.Scanner;

/**
 * 
 * @author victor.salves1
 */
public class ExemploVetores {
    
    static int tamanhoVetor(){
        System.out.println("tamanhoVetor");
    Scanner input = new Scanner(System.in);
        System.out.println("Tamanho do vetor: ");
        int tamanho  = input.nextInt();
        return tamanho;
    }
    static int[] criaVetor(int t){
        System.out.println("criaVetor");
    
    int [] vetor  = new int [t];
    return vetor;
    }
    static int[] populaVetor(int []v){
        System.out.println("PopulaVetor");
    Scanner input  = new Scanner(System.in);
        for (int i = 0; i <v.length ; i++) {
          System.out.printf("%dº elemento: \n",i+1);
               v[i] = input.nextInt();
            
        }
        return v;
  
   
    }
    static int somaElemetos(int []v){
        System.out.println("somaElemento");
        int soma  = 0;
        for (int i = 0; i <v.length ; i++) {
            soma  = soma +v[i];
            
        }
        return soma;
                
    
    
    }
    static int menorElemento(int []v){
        System.out.println("menorElemento");
        int menor = 0;
        for(int i=0; i<v.length;i++){
        if (v[i]<menor)
            menor = v[i];
        }
        return menor;
    }
    static int maiorElemento(int []v){
      System.out.println("maiorElemento");
        int maior = 0;
        for(int i=0; i<v.length;i++){
        if (v[i]>maior)
            maior = v[i];
        }
        return maior;
    
    }
    static void imprimiDados(int []v, int menor, int maior, int soma){
        System.out.println("imprimeDados() ");
        for (int i = 0; i <v.length; i++) {
            System.out.print("v["+i+"]: "+v[i]);
            if (v[i]==menor){System.out.print(" <--Menor");}
            else if(v[i]==maior){System.out.print(" <--maior");}
            System.out.println("");
                      
        }
        System.out.println("soma: "+soma);
    
    
    }
    
    public static void main(String[] args) {
        int t = tamanhoVetor();  
        int [] vetor = criaVetor(t);
        vetor = populaVetor(vetor);
        int menor = maiorElemento(vetor);
        int maior  = maiorElemento(vetor);
        int soma  = somaElemetos(vetor);
        imprimiDados(vetor, menor, maior, soma);
    
    
    
    }
}
