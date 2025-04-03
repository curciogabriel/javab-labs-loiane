package com.gabriel.cursojava.aula13.exerc4;

import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.print("Primeira nota bimestral: ");
        double bim1 = sc.nextDouble();
        System.out.print("Segunda nota bimestral: ");
        double bim2 = sc.nextDouble();
        System.out.print("Terceira nota bimestral: ");
        double bim3 = sc.nextDouble();
        System.out.print("Quarta nota bimestral: ");
        double bim4 = sc.nextDouble();

        double media = (bim1 + bim2 + bim3 + bim4) / 4;

        System.out.println("Media = " + media);
    }
}

//4. Faça um programa que peça as 4 notas bimestrais e mostre a média.