package com.gabriel.cursojava.aula13.labs.exerc6;

import java.util.Scanner;

public class Exerc6 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("Área = " + area);

        sc.close();
    }
}

//6. Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
//->Corrigido, 95%. ; Acrescentado a lib Math.PI no lugar do valor '3.1415'.