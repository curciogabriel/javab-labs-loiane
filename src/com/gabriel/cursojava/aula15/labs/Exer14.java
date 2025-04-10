package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;
        char conceito = '0';

        if (media >= 9 && media <= 10) conceito = 'A';
        else if (media >= 7.5 && media < 9) conceito = 'B';
        else if (media >= 6 && media < 7.5) conceito = 'C';
        else if (media >= 4 && media < 6) conceito = 'D';
        else conceito = 'E';

        String ap;
        if (conceito == 'D' || conceito == 'E')
            ap = "REPROVADO";
        else ap = "APROVADO";

        System.out.println("Nota parcial 1: " + nota1);
        System.out.println("Nota parcial 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito + ", " + ap);

        sc.close();
    }
}

//14. Faça um programa que lê duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre e calcule
// sua média. A atribuição de conceitos obedece à tabela abaixo.
// * O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem "APROVADO" se o conceito
// for A, B ou C ou "REPROVADO" se o conceito for D ou E.