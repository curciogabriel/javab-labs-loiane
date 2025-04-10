package com.gabriel.cursojava.aula13.labs.exerc3;

import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.println("Entre com o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("A soma dos números é: " + (num1 + num2));

        sc.close();
    }
}

//3. Faça um programa que peça dois números e imprima a soma.
//->Corrigido, 100%.