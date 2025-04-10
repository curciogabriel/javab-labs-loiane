package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma letra: ");
        char letra = sc.nextLine().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("Vogal."); break;
            default:
                System.out.println("Consoante."); break;
        }

        sc.close();
    }
}

//4. Faça um programa que verifique se uma letra digitada é vogal ou consoante.