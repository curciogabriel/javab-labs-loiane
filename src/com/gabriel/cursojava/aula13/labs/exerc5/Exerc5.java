package com.gabriel.cursojava.aula13.labs.exerc5;

import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual medida em metros a ser convertida? ");
        double metros = sc.nextDouble();
        System.out.println("São " + (metros * 100) + " centímetros.");

        sc.close();
    }
}

//5. Faça um programa que converta metros para centímetros.
//->Corrigido, 100%.
