package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num = sc.nextInt();

        if (num >= 0) System.out.println("É positivo.");
        else System.out.println("É negativo.");

        sc.close();
    }
}

//2. Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

//100% na correção.