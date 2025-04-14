package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Entre com o terceiro numero: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3)
            System.out.println("num1: " + num1);
        else if (num2 >= num1 && num2 >= num3)
            System.out.println("num2: " + num2);
        else
            System.out.println("num3: " + num3);

        sc.close();
    }
}

//6. Faça um programa que leia três numeros e mostre o maior deles.

//Corrigido, 95%