package com.gabriel.cursojava.aula13.exerc11;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num1 = scan.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int num2 = scan.nextInt();
        System.out.print("Digite um número real: ");
        double num3 = scan.nextDouble();

        System.out.println("O produto do dobro do primeiro com metade do segundo:");
        int a = ((2 * num1) * (num2 / 2));
        System.out.println(a);

        System.out.println("A soma do triplo do primeiro com o terceiro:");
        double b = ((3 * num1) + num3);
        System.out.println(b);

        System.out.println("O terceiro elevado ao cubo:");
        double c = num3 * num3 * num3;
        System.out.println(c);

        scan.close();
    }
}

//11. Faça um programa que peça 2 numeros inteiros e um numero real. Calcule e mostre:
//a) o produto do dobro do primeiro com metade do segundo.
//b) a soma do triplo do primeiro com o terceiro.
//c) o terceiro elevado ao cubo.