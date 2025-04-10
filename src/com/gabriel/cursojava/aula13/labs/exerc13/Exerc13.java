package com.gabriel.cursojava.aula13.labs.exerc13;

import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite seu sexo (M ou F): ");
        char sexo = sc.next().charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            double pesoIdeal = ((72.7 * altura) - 58);
            System.out.println("Peso ideal: " + pesoIdeal);
            if (pesoIdeal < 18.5) {
                System.out.println("Abaixo do peso.");
            } else if (pesoIdeal >= 18.5 && pesoIdeal <= 24.9) {
                System.out.println("Peso normal.");
            } else {
                System.out.println("Acima do peso.");
            }
        } else if (sexo == 'F' || sexo == 'f') {
            double pesoIdeal = ((62.1 * altura) - 44.7);
            System.out.println("Peso ideal: " + pesoIdeal);
            if (pesoIdeal < 18.5) {
                System.out.println("Abaixo do peso.");
            } else if (pesoIdeal >= 18.5 && pesoIdeal <= 24.9) {
                System.out.println("Peso normal.");
            } else {
                System.out.println("Acima do peso.");
            }
        }

        sc.close();
    }
}

//13. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes formulas:
//- Para homens: (72.7 * h) - 58
//- Para mulheres: (62.1 * h) - 44.7
//- Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
