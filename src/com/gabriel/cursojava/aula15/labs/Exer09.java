package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Num1: ");
        int num1 = sc.nextInt();
        System.out.println("Num2: ");
        int num2 = sc.nextInt();
        System.out.println("Num3: ");
        int num3 = sc.nextInt();

        int menor = 0;
        int meio = 0;
        int maior = 0;

        if (num1 >= num2 && num1 >= num3)
            maior = num1;
        else if (num2 >= num1 && num2 >= num3)
            maior = num2;
        else maior = num3;

        if (num1 <= num2 && num1 <= num3)
            menor = num1;
        else if (num2 <= num1 && num2 <= num3)
            menor = num2;
        else menor = num3;

        if ((num1 <= num2 && num1 >= num3) || (num1 >= num2 && num1 <= num3))
            meio = num1;
        else if ((num2 <= num1 && num2 >= num3) || (num2 >= num1 && num2 <= num3))
            meio = num2;
        else meio = num3;

        System.out.println("Ordem decrescente: " + maior + ", " + meio + ", " + menor);

        sc.close();
    }
}

//9. Faça um programa que leia três numeros e mostre-os em ordem decrescente.

//Corrigido, 95%