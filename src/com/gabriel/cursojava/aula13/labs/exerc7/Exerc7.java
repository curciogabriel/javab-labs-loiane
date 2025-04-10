package com.gabriel.cursojava.aula13.labs.exerc7;

import java.util.Scanner;

public class Exerc7 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho do lado do quadrado?");
        double lado = sc.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é: " + area);
        System.out.println("Dobro da area do quadrado = " + (2 * area));

        sc.close();
    }
}

//7. Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro dessa área para o usuário.
//->Corrigido, 100%.
