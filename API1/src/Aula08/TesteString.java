/*
 * USADO PARA COMPARAR TEXTOS
 * 
 */
package Aula08;

/**
 *
 * @author victor.salves1
 */
public class TesteString {

    public static void main(String args[]) {
        String n1 = "SENAC";
        boolean retorno = n1.equals("SENAC");
        if (retorno) {
            System.out.println(n1.toUpperCase());
            System.out.println(n1.toLowerCase());
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

    }
}