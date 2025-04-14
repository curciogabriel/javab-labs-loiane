package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Entre com o terceiro numero: ");
        int num3 = sc.nextInt();

        System.out.println("Maior número: ");
        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1);
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2);
        else
            System.out.println(num3);

        System.out.println("\n\nMenor número: ");

        if (num1 <= num2 && num1 <= num3)
            System.out.println(num1);
        else if (num2 <= num1 && num2 <= num3)
            System.out.println(num2);
        else
            System.out.println(num3);

        sc.close();
    }
}

//7. Faça um programa que leia três numeros e mostre o maior e o menor deles.

//Corrigido, 95%