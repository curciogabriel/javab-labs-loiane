package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer17 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 != 0) System.out.println("Esse ano é bissexto.");
            else {
                if (ano % 400 == 0) System.out.println("Esse ano é bissexto.");
                else System.out.println("Esse ano não é bissexto.");
            }
        } else System.out.println("Esse ano não é bissexto.");

        sc.close();
    }
}

//17. Faça um programa que peça um numero correspondente a um determinado ano e em seguida informe se este ano é ou não
// bissexto.

// o ano tem q ser divisivel por 4 - check
// se for divisivel por 4, nao pode ser divisivel por 100

//Corrigido, 100%, logica diferente da professora mas rodou tao bem quanto