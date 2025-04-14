package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma letra: ");
        String letra = sc.next();

        /*if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) System.out.println("Vogal");
        else System.out.println("Consoante");*/

        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida");
        } else {
            switch(letra) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                case "a":
                case "e":
                case "i":
                case "o":
                case "u": System.out.println("Vogal"); break;
                default: System.out.println("Consoante"); break;
            }
        }

        sc.close();
    }
}

//4. Faça um programa que verifique se uma letra digitada é vogal ou consoante.

//Recorrigido p/ type String + if/else, + input maiusculo