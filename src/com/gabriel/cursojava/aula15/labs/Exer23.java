package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer23 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        double numero = sc.nextDouble();
        sc.close();

        int numeroConvert = (int) Math.ceil(numero);

        if ((numeroConvert - numero) > 0) System.out.println("É decimal.");
        else System.out.println("É inteiro.");
    }
}

//23. Faça um programa que peça um número e informe se o número é inteiro ou decimal.
// * Dica: utilize uma função de arredondamento.