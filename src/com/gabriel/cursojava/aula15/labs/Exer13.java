package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número correspondente ao dia da semana (1-7): ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Valor Inválido"); break;
        }

        sc.close();
    }
}

//13. Faça um programa que leia um numero e exiba o dia correspondente da semana. (1-Domingo, 2-Segunda, etc.), se digitar
// outro valor deve aparecer "Valor Inválido".