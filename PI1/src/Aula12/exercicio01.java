
package Aula12;

import java.util.Scanner;

/**
 *
 * @author Flavio
 */
public class exercicio01 {
    static int maior(int a,int b,int c){
		Scanner input = new Scanner(System.in);
		int maior = 0;
             
		
		if (a>=b&&a>=c){
		 maior = a;}
		else if (b>=a&&b>c){
			maior  = b;}
			
		
		else if (c>=a&&c>=b){maior = c;}
		
		return maior;	
	}
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		int    a = input.nextInt();
               int b = input.nextInt();
                   int c = input.nextInt();
		int d = maior(a,b,c);
		System.out.println(d);
	}
    
}
