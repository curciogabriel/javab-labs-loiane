package com.gabriel.cursojava.aula13.exerc9;

import java.util.Scanner;

public class Exerc9 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus F: ");
        double fahrenheit = sc.nextDouble();

        double transfCelsius = (5 * (fahrenheit - 32) / 9);

        System.out.println(fahrenheit + " graus F em celsius: " + transfCelsius);

        sc.close();
    }
}

//9. Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
