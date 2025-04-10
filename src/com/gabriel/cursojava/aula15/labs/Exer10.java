package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Em que turno vc estuda? (M/V/N)");
        char turno = sc.nextLine().charAt(0);

        if (turno == 'm' || turno == 'M')
            System.out.println("Bom Dia!");
        else if (turno == 'v' || turno == 'V')
            System.out.println("Boa Tarde!");
        else if (turno == 'n' || turno == 'N')
            System.out.println("Boa Noite!");
        else
            System.out.println("Valor Inválido!");

        sc.close();
    }
}

//10. Faça um programa que pergunte em que turno voce estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno.
// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.