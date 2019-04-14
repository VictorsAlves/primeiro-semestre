package revisaoapi;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class RevisaoAPI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String senha;
int controle = 0;
        System.out.println("Digite o nome de usuário");
        nome = sc.next();
        System.out.println("Digite a senha");
        senha = sc.next();
        boolean verificaUsuario = nome.equals("victor");
        boolean verificaSenha = senha.equals("lagosta");

        if (verificaUsuario==false && verificaSenha ==false){
        while (verificaUsuario==false && verificaSenha ==false) {
            System.out.println("Usuario ou senha incorreto, digite novamente");
             System.out.println("Digite o nome de usuário");
        nome = sc.next();
        System.out.println("Digite a senha");
        senha = sc.next();
        verificaUsuario = nome.equals("victor");
        verificaSenha = senha.equals("lagosta");
        }

    }
        while (controle!=3){System.out.println("Inicio");
        controle++;}
    
    
    }
}
