package com.gabriel.cursojava.aula13.exerc2;

import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = sc.nextDouble();

        System.out.println("O número informado foi: " + numero);

        sc.close();
    }
}

//2. Faça um programa que peça um número e então mostre a mensagem O número informado foi [número].
