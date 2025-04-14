package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do primeiro lado: ");
        double lado1 = sc.nextDouble();
        System.out.println("Entre com o valor do segundo lado: ");
        double lado2 = sc.nextDouble();
        System.out.println("Entre com o valor do terceiro lado: ");
        double lado3 = sc.nextDouble();

        if (((lado1 + lado2) > lado3) || ((lado2 + lado3) > lado1) || ((lado1 + lado3) > lado2)) {
            if (lado1 == lado2 && lado2 == lado3) { //conf. equilatero
                System.out.println("Triângulo EQUILÁTERO.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Triângulo ISÓSCELES.");
            } else {
                System.out.println("Triângulo ESCALENO.");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }

        sc.close();
    }
}

//15. Faça um programa que peça os 3 lados de um triangulo. O programa deverá informar se os valores podem ser um
// triangulo. Indique, caso os lados formem um triangulo, se o mesmo é: equilatero, isosceles ou escaleno. Dicas:
// * Tres lados formam um triangulo quando a soma de quaisquer dois lados for maior que o terceiro;
// * Triangulo EQUILATERO: tres lados iguais;
// * Triangulo ISOSCELES: quaisquer dois lados iguais;
// * Triangulo ESCALENO: tres lados diferentes.

//Corrigido, 100%