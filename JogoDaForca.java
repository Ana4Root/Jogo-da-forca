import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.StandardSocketOptions;
import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {

    public static void main(String[] args) {

        String[] Words = {"brasil","tapete","inverno","diamante","arroz","mina","espeto",
        "fotocopiadora","plural","doca","uvas","assalto","velas","cupido","descobridor","ampulheta","anzol","candelabro",
        "desfibrilador","fantoche","freezer","navalha","jaleco","modem","sintetizador","spray","urinol","vuvuzela",
        "webcam","xadrez","xilofone","ziper"};


        int PalavrasQ = Words.length;
        char letra;
        boolean Venceu = false;
        int Vidas = 6;
        String LetrasDigi = "";
        Random random = new Random();

        Scanner in = new Scanner(System.in);

        int contagemWords = random.nextInt(PalavrasQ); //sortear palavra//
        String Forca = (Words[contagemWords]); // string recebe a palavra sorteada//

        char[] Letras = new char[Forca.length()];//as letras recebem o tamanho da palavra//

        for (int i = 0; i < Forca.length(); i++) { //substitui as letras por _//
            Letras[i] = 0;
            System.out.print("_");
        }
        while(!Venceu && Vidas > 0) {
            System.out.println("\nEscolha uma letra!!");
            letra = in.next().charAt(0);
            LetrasDigi += " " + letra; // recebe a letra digitada//

            System.out.print("\n Você já utilizou as letras:" + LetrasDigi);
            System.out.print("\n Você tem " + Vidas + " Vidas \n ");

            Boolean Lose = true;
            for (int i = 0; i < Forca.length(); i++) {
                if (letra == Forca.charAt(i)) {

                    Letras[i] = 1;
                    Lose = false; // se a letra digitada é correta, o lose permance false//
                }
            }
            if (Lose) {
                Vidas--;
               System.out.print("\n Você Errou \n"); // se a letra digitada é incorreta o lose se torna true e perde 1 vida//
            }
            Venceu = true;
            for (int i = 0; i < Forca.length(); i++) {
                if (Letras[i] == 0) {
                    System.out.print("_");

                    Venceu = false;
                } else {
                    System.out.print(" " + Forca.charAt(i) + " ");
                }
            }
        }
        if (Vidas != 0) { //se ganhar//
            System.out.println("\n" +
                    "       .-'\"'-.\n" +
                    "        / #     \\   \n" +
                    "       : #       :  .-'\"'-.\n" +
                    "        \\       /  / #     \\\n" +
                    "         \\     /  : #       :\n" +
                    "          `'q'`    \\       /\n" +
                    "            (       \\     /\n" +
                    "             )       `'p'`\n" +
                    "            (          )\n" +
                    "PARABÉNS VOCÊ ACERTOU A PALAVRA\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "┈┈┈┏┓┈┈┈┈┈┈┈┈┈┈┈\n" +
                    "┈┈┈┣┫┈┈┈┈┈┈┈┈┈┈┈\n" +
                    "┈┈╭╯╰╮┈┏━┓┈┏━┓┈┈\n" +
                    "┈┈┃╭╮┃┈┣━┫┈┣━┫┈┈\n" +
                    "┈┈┃┣┫┃┈╰┳╯┈╰┳╯┈┈\n" +
                    "╲╲┃┗┛┃╲╲┃╲╲╲┃╲╲╲\n" +
                    "╲╲╰━━╯╲╲┻╲╲╲┻╲╲╲\\ |\n" +
                    "JÁ PODE COMEMORAR");

        } else { //quando perde//
            System.out.print("\n A palavra era: " + Forca);
            System.out.print("\n");
            System.out.print("\n¤*¨¨*¤  ¤*¨¨*¤.¸¸…¸.¤ \\\n" +
                    "\\¸  Você Perdeu!! .,.\\\n" +
                    ".\\¸.¤*¨¨*¤.¸¸.¸.¤*¤*¨¨*¤\n" +
                    "..\\\n" +
                    " ☻/\n" +
                    "/▌\n" +
                    "/ \\\n" +
                    "\n"+
                    "\n"+
                    "\n" +
                    "▒▒▒▒▒▒▒▒▒▒▒▄▄▄▄░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒▒▒▒▒▒▄██████▒▒▒▒▒▄▄▄█▄▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒▒▒▒▄██▀░░▀██▄▒▒▒▒████████▄▒▒▒▒▒▒\n" +
                    "▒▒▒▒▒▒███░░░░░░██▒▒▒▒▒▒█▀▀▀▀▀██▄▄▒▒▒\n" +
                    "▒▒▒▒▒▄██▌░░░░░░░██▒▒▒▒▐▌▒▒▒▒▒▒▒▒▀█▄▒\n" +
                    "▒▒▒▒▒███░░▐█░█▌░██▒▒▒▒█▌▒▒▒▒▒▒▒▒▒▒▀▌\n" +
                    "▒▒▒▒████░▐█▌░▐█▌██▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▐████░▐░░░░░▌██▒▒▒█▌▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒████░░░▄█░░░██▒▒▐█▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒████░░░██░░██▌▒▒█▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒████▌░▐█░░███▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒▐████░░▌░███▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒▒████░░░███▒▒▒▒█▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒██████▌░████▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▐████████████▒▒███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒█████████████▄████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "██████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "██████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "█████████████████▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "█████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        }
    }
}
