/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula12;

import java.util.Scanner;

/**
 *
 * @author Flavio
 */
public class exercicio05 {

    static float farenheitParaCelcius(float f) {
        float c = 5 * (f - 32) / 9;

        return c;

    }

    static float celciusFarenheit(float c) {
        float f = ((9 * c) / 5) + 32;
        return f;
    }

    public static void main(String[] args) {
       float temperatura;
        String escolha;
         float conversao;

      
        Scanner leitor = new Scanner(System.in);
        // Digitando c para celcius e f para farenheit
        escolha = leitor.next();
        if ("C".equals(escolha)) {
           
            // executando funcao celcius
            temperatura = leitor.nextInt();
             conversao = farenheitParaCelcius(temperatura);
         
     System.out.print(conversao);
        } else if ("F".equals(escolha)) {
            temperatura = leitor.nextInt();
            
               conversao = celciusFarenheit(temperatura);
            System.out.print(conversao);

        }else{System.out.println("false");}
    
    }

}
