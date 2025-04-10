package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer20 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a primeira nota parcial: ");
        double nota1 = sc.nextDouble();
        System.out.println("Entre com a segunda nota parcial: ");
        double nota2 = sc.nextDouble();
        System.out.println("Entre com a terceira nota parcial: ");
        double nota3 = sc.nextDouble();
        sc.close();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media: " + media);

        if (media == 10.0) System.out.println("Aprovado com distinção.");
        else if (media >= 7) System.out.println("Aprovado.");
        else System.out.println("Reprovado.");
    }
}

//20. Faça um programa para leitura de tres notas parciais de um aluno. O programa deve calcular a media alcançada por aluno e apresentar:
// * A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
// * A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
// * A mensagem "Aprovado com Distinção", se a média for igual a 10.