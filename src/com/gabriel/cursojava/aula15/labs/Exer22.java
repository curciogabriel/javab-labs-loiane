package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer22 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero % 2 == 0) System.out.println("O número " + numero + " é par.");
        else System.out.println("O número " + numero + " é ímpar.");
    }
}

//22. Faça um programa que peça um numero inteiro e determine se ele é par ou impar.
// -> Dica: utilize o operador modulo (resto da divisão)