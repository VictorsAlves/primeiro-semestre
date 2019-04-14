/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06;

import java.util.Scanner;

/**
 *
 * @author Flavio
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        int vc,ec,gc,vf,ef,gf;
        System.out.println("Digite qutd de vitorias de c");
        vc = sc.nextInt();
        System.out.println("Digite qutd de empates de c");
         ec = sc.nextInt();
        System.out.println("Digite qutd de gols de c");
         gc = sc.nextInt();
        
          System.out.println("Digite qutd de vitorias de c");
        vf = sc.nextInt();
        System.out.println("Digite qutd de empates de c");
         ef = sc.nextInt();
        System.out.println("Digite qutd de gols de c");
         gf = sc.nextInt();
        
         if (vc>vf){System.out.println("c");}
         else if (vc<vf){System.out.println("F");}
         else if (vc==vf && ec<ef){System.out.println("c");}
         else if (vc==vf && ec>ef){System.out.println("F");}
        else if (vc==vf && ec==ef && gc>gf){System.out.println("C");}
         else if (vc==vf && ec==ef && gc<gf){System.out.println("F");}
          else if (vc==vf && ec==ef && gc==gf){System.out.println("=");}
        
    }
    
}
