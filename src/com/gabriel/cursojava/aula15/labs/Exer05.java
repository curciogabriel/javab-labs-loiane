package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira nota parcial: ");
        double nota1 = sc.nextDouble();
        System.out.println("Segunda nota parcial: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;

        System.out.println("Media: " + media);

        if (media == 10)
            System.out.println("Aprovado com Distinção.");
        else if (media >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado.");

        sc.close();
    }
}

//5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por
// aluno e apresentar:
// * A mensagem "aprovado", se a média alcançada for maior ou igual a sete;
// * A mensagem "Reprovado", se a média for menor do que sete;
// * A mensagem "Aprovado com Distinção", se a média for igual a dez.

//Corrigido, 100%