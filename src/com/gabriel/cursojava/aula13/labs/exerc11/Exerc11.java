package com.gabriel.cursojava.aula13.labs.exerc11;

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

        int a = ((2 * num1) * (num2 / 2));
        double b = ((3 * num1) + num3);
        double c = num3 * num3 * num3;

        System.out.println("O produto do dobro do primeiro com metade do segundo: " + a);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + b);
        System.out.println("O terceiro elevado ao cubo: " + c);

        scan.close();
    }
}

//11. Faça um programa que peça 2 numeros inteiros e um numero real. Calcule e mostre:
//a) o produto do dobro do primeiro com metade do segundo.
//b) a soma do triplo do primeiro com o terceiro.
//c) o terceiro elevado ao cubo.

//->Corrigido, 95%. ; Melhoria de semântica.