package com.gabriel.cursojava.aula13.exerc3;

import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite outro numero: ");
        double num2 = sc.nextDouble();

        System.out.println("Soma = " + (num1 + num2));

        sc.close();
    }
}

//3. Faça um programa que peça dois números e imprima a soma.
