package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) System.out.println(num1 + " maior que " + num2);
        else System.out.println(num2 + " maior que " + num1);

        sc.close();
    }
}

//1. Faça um programa que peça dois numeros e imprima o maior deles.

//100% na correção.