
package Aula08;

import java.util.Scanner;

/**
 *
 * @author victor.salves1
 */
// a função devolve pra quem chama
// se a função não volta nada coloca void
// não tem parametros eu não preciso fornecer nenhum valor para a função
// variavel global todo mundo encherga exemplo n1,n2
public class ExemploFuncoes {
    //variaveis global
    public static int n1,n2;
    //não tem parametros e tambem não tem retorno
   public static void entradaDados(){
   Scanner leitor  = new Scanner (System.in);
   System.out.println();
   n1 = leitor.nextInt();
   System.out.println();
     n2 = leitor.nextInt();
   }
   // não tem paraementros porém retorna um int
   public static int soma(){
   int resultado = n1+n2;
   return resultado;
   }
   
   //tem parametros porem não retorna nada
   public static void imprimeDados(int resultado){
       System.out.println("Resultado"+ resultado);}
   //(main código real) codigo real se ersume em 3 linhas
   public static void main(String args []){
       entradaDados();
       int r = soma();
       imprimeDados(r);
   }
    




}
    

