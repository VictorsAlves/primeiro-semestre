package rpg.fight;

import java.util.Scanner;

/**
 *
 * @author victor.salves1
 */
public class RPGFight {

    // Dados Jogador
    static Scanner leitor = new Scanner(System.in);
    static int level;
    static int hp = 150;
    static int soco = -10;
    static int especial = -20;//só pode usar 5 vezes
    static int ce = 5; // Controle de especial
    // Dados Adversário
    static int levelAdversario;
    static int hpAdversario = 10;
    static int socoAdversario = -1;
    static int chuteAdversario = -2;
    static int especialAdversario = -3;

    public static int Jogador() {
        int escolha;

        System.out.println("Escolha seu ataque");
        System.out.println("1 - Soco");
        System.out.println("2 - Especial(" + ce + ")");
        escolha = leitor.nextInt();
        if (ce == 0) {
            System.out.println("Você não tem mais especial!");
            escolha = 1;
        }
        switch (escolha) {
            case 1:
                return escolha;
            case 2:
                return 2;
            default:
                while (escolha> 2 || escolha<=0) {
                    System.out.println("Escolha seu ataque");
                    System.out.println("1 - Soco");
                    System.out.println("2 - Especial(" + ce + ")");
                    escolha = leitor.nextInt();
                    if (ce == 0) {
                        System.out.println("Você não tem mais especial!");
                        escolha = 1;
                    }

                }

        }
        return 0;
    }

    public static int Maquina() {
        int ataque = (int) (Math.random() * 3 + 1);
        return ataque;

    }

    public static void Batalha() {
        // primeiro turno
        int inimigo = 1;
        int jogadorTemp;
        int adversarioTemp;
        do {
            // enquanto o jogador tiver vida executa isso!
            System.out.println("Inimigo: " + inimigo);
            System.out.println("HP:" + hp);
            System.out.println("Inimigo HP:" + hpAdversario);
            System.out.println("-=-=-=-=-=-=-=-");
             jogadorTemp = Jogador();            
            adversarioTemp = Maquina();
            System.out.println("Inimigo: " + inimigo);
            if (jogadorTemp == 1 && adversarioTemp == 1) {
                hpAdversario = hpAdversario - soco;
                System.out.println("HP:" + hp);
                // enquanto o adversário tiver vida o programa vai  executando isso!
                while (hpAdversario != 0) {
                    System.out.println("Inimigo: " + inimigo);
                    System.out.println("HP:" + hp);
                    System.out.println("Inimigo HP:" + hpAdversario);
                    System.out.println("-=-=-=-=-=-=-=-");
                    Jogador();
                    Maquina();

                    if (hpAdversario == 0) {
                        hpAdversario = hpAdversario + inimigo;
                        socoAdversario = socoAdversario - 1 - (int) (-inimigo / 10);
                        chuteAdversario = -2 - (int) (-inimigo / 10);
                        especialAdversario = -3 - (int) (-inimigo / 20);
                        break;
                    } else {
                        hp = hp - socoAdversario;
                    }
                }
            } else if (jogadorTemp == 1 && adversarioTemp == 2) {
                hpAdversario = hpAdversario - soco;
                // enquanto o adversário tiver vida o programa vai  executando isso!
                while (hpAdversario != 0) {
                    System.out.println("Inimigo: " + inimigo);
                    System.out.println("HP:" + hp);
                    System.out.println("Inimigo HP:" + hpAdversario);
                    System.out.println("-=-=-=-=-=-=-=-");
                    Jogador();
                    Maquina();

                    if (hpAdversario == 0) {
                        hpAdversario = hpAdversario + inimigo;
                        socoAdversario = socoAdversario - 1 - (int) (-inimigo / 10);
                        chuteAdversario = -2 - (int) (-inimigo / 10);
                        especialAdversario = -3 - (int) (-inimigo / 20);
                        break;
                    } else {
                        hp = hp - chuteAdversario;
                    }
                }
            } else if (jogadorTemp == 1 && adversarioTemp == 3) {
                hpAdversario = hpAdversario - soco;
                // enquanto o adversário tiver vida o programa vai  executando isso!
                while (hpAdversario != 0) {
                    System.out.println("Inimigo: " + inimigo);
                    System.out.println("HP:" + hp);
                    System.out.println("Inimigo HP:" + hpAdversario);
                    System.out.println("-=-=-=-=-=-=-=-");
                    Jogador();
                    Maquina();

                    if (hpAdversario == 0) {
                        hpAdversario = hpAdversario + inimigo;
                        socoAdversario = socoAdversario - 1 - (int) (-inimigo / 10);
                        chuteAdversario = -2 - (int) (-inimigo / 10);
                        especialAdversario = -3 - (int) (-inimigo / 20);
                        break;
                    } else {
                        hp = hp - especialAdversario;
                    }
                }
            } else if (jogadorTemp == 2 && adversarioTemp == 1) {
                hpAdversario = hpAdversario - especial;
                // enquanto o adversário tiver vida o programa vai  executando isso!
                while (hpAdversario != 0) {
                    System.out.println("Inimigo: " + inimigo);
                    System.out.println("HP:" + hp);
                    System.out.println("Inimigo HP:" + hpAdversario);
                    System.out.println("-=-=-=-=-=-=-=-");
                    Jogador();
                    Maquina();

                    if (hpAdversario == 0) {
                        hpAdversario = hpAdversario + inimigo;
                        socoAdversario = socoAdversario - 1 - (int) (-inimigo / 10);
                        chuteAdversario = -2 - (int) (-inimigo / 10);
                        especialAdversario = -3 - (int) (-inimigo / 20);
                        break;
                    } else {
                        hp = hp - socoAdversario;
                    }
                }
            } else if (jogadorTemp == 2 && adversarioTemp == 2) {
                hpAdversario = hpAdversario - especial;
                // enquanto o adversário tiver vida o programa vai  executando isso!
                while (hpAdversario != 0) {
                    System.out.println("Inimigo: " + inimigo);
                    System.out.println("HP:" + hp);
                    System.out.println("Inimigo HP:" + hpAdversario);
                    System.out.println("-=-=-=-=-=-=-=-");
                    Jogador();
                    Maquina();

                    if (hpAdversario == 0) {
                        hpAdversario = hpAdversario + inimigo;
                        socoAdversario = socoAdversario - 1 - (int) (-inimigo / 10);
                        chuteAdversario = -2 - (int) (-inimigo / 10);
                        especialAdversario = -3 - (int) (-inimigo / 20);
                        break;
                    } else {
                        hp = hp - chuteAdversario;
                    }
                }
            } else if (jogadorTemp == 2 && adversarioTemp == 3) {
                hpAdversario = hpAdversario - especial;
                // enquanto o adversário tiver vida o programa vai  executando isso!
                while (hpAdversario != 0) {
                    System.out.println("Inimigo: " + inimigo);
                    System.out.println("HP:" + hp);
                    System.out.println("Inimigo HP:" + hpAdversario);
                    System.out.println("-=-=-=-=-=-=-=-");
                    Jogador();
                    Maquina();

                    if (hpAdversario == 0) {
                        hpAdversario = hpAdversario + inimigo;
                        socoAdversario = socoAdversario - 1 - (int) (-inimigo / 10);
                        chuteAdversario = -2 - (int) (-inimigo / 10);
                        especialAdversario = -3 - (int) (-inimigo / 20);
                        break;
                    } else {
                        hp = hp - especialAdversario;
                    }
                }
            }

            inimigo++;
        } while (hp != 0);

    }

    public static void main(String[] args) {
        
       Jogador();
       Maquina();
       Batalha();
      

    }

}
