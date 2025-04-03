package com.gabriel.cursojava.aula13.exerc12;

import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        double pesoIdeal = ((72.7 * altura) - 58);

        System.out.println("Peso ideal: " + pesoIdeal);

        sc.close();
    }
}

//12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte formula: (72.7 * altura) - 58.
