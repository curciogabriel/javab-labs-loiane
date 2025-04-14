package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Em que turno vc estuda? (M/V/N)");
        String turno = sc.next();

        /*if (turno.equalsIgnoreCase("m") || turno.equalsIgnoreCase("M"))
            System.out.println("Bom Dia!");
        else if (turno.equalsIgnoreCase("v") || turno.equalsIgnoreCase("V"))
            System.out.println("Boa Tarde!");
        else if (turno.equalsIgnoreCase("n") || turno.equalsIgnoreCase("N"))
            System.out.println("Boa Noite!");
        else
            System.out.println("Valor Inválido!");*/

        switch(turno) {
            case "m":
            case "M": System.out.println("Bom Dia!"); break;
            case "v":
            case "V": System.out.println("Boa Tarde!"); break;
            case "n":
            case "N": System.out.println("Boa Noite!"); break;
            default: System.out.println("Valor inválido");
        }

        sc.close();
    }
}

//10. Faça um programa que pergunte em que turno voce estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno.
// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

//Corrigido, 100% + outras coisas