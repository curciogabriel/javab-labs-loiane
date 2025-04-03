package com.gabriel.cursojava.aula13.exerc6;

import java.util.Scanner;

public class Exerc6 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = 3.1415 * raio * raio;

        System.out.println("Área = " + area);

        sc.close();
    }
}

//6. Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
