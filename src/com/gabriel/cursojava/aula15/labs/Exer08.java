package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro preço: ");
        double preco1 = sc.nextDouble();
        System.out.println("Entre com o segundo preço: ");
        double preco2 = sc.nextDouble();
        System.out.println("Entre com o terceiro preço: ");
        double preco3 = sc.nextDouble();

        System.out.println("Melhor preço:");
        if (preco1 <= preco2 && preco1 <= preco3)
            System.out.println(preco1);
        else if (preco2 <= preco1 && preco2 <= preco3)
            System.out.println(preco2);
        else
            System.out.println(preco3);

        sc.close();
    }
}

//8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a
// decisão é sempre pelo mais barato.

//Corrigido, 95%