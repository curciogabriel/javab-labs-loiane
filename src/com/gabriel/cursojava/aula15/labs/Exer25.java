package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer25 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.println("Telefonou para a vítima? (s/n)");
        char resposta1 = sc.nextLine().charAt(0);

        if (resposta1 == 's' || resposta1 == 'S') contador++;

        System.out.println("Esteve no local do crime? (s/n)");
        char resposta2 = sc.nextLine().charAt(0);

        if (resposta2 == 's' || resposta2 == 'S') contador++;

        System.out.println("Mora perto da vítima? (s/n)");
        char resposta3 = sc.nextLine().charAt(0);

        if (resposta3 == 's' || resposta3 == 'S') contador++;

        System.out.println("Devia para a vítima? (s/n)");
        char resposta4 = sc.nextLine().charAt(0);

        if (resposta4 == 's' || resposta4 == 'S') contador++;

        System.out.println("Já trabalhou com a vítima? (s/n)");
        char resposta5 = sc.nextLine().charAt(0);
        sc.close();

        if (resposta5 == 's' || resposta5 == 'S') contador++;

        System.out.println("\n\nClassificação: " + contador + " pontos. Você é: ");

        if (contador == 2) System.out.println("Suspeita.");
        else if (contador == 3 || contador == 4) System.out.println("Cúmplice.");
        else if (contador == 5) System.out.println("Assassino.");
        else System.out.println("Inocente.");
    }
}

//25. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
// -> Telefonou para a vítima?
// -> Esteve no local do crime?
// -> Mora perto da vítima?
// -> Devia para a vítima?
// -> Já trabalhou com a vítima?
// * O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder
// positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
// Caso contrário, ele será classificado como "Inocente".

//Corrigido, 100%