package com.gabriel.cursojava.aula13.exerc10;

import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus C: ");
        double celsius = sc.nextDouble();

        double transfFahrenheit = (celsius * 1.8 + 32);

        System.out.println(celsius + " graus C em fahrenheit: " + transfFahrenheit);

        sc.close();
    }
}

//10. Faça um programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.