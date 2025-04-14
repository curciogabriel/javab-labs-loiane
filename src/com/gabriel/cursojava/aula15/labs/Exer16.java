package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer16 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor de A: ");
        int valorA = sc.nextInt();
        int valorB = 0;
        int valorC = 0;

        if (valorA != 0) {
            System.out.println("Entre com o valor de B: ");
            valorB = sc.nextInt();
            System.out.println("Entre com o valor de C: ");
            valorC = sc.nextInt();

            double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;
            double raiz1 = ((valorB * (-1) + (Math.sqrt(delta))) / (2 * valorA));
            double raiz2 = ((valorB * (-1) - (Math.sqrt(delta))) / (2 * valorA));

            System.out.println("Delta: " + delta);

            if (delta > 0) {
                System.out.println("Valor da primeira raiz: " + raiz1);
                System.out.println("Valor da segunda raiz: " + raiz2);
            } else if (delta < 0) {
                System.out.println("A equação não possui raízes no conjunto dos reais.");
            } else {
                System.out.println("A equação possui apenas uma raiz real, sendo ela: " + raiz1);
            }
        }
        else
            System.out.println("A equação não é do segundo grau pois A = 0.");

        sc.close();
    }
}

//16. Faça um programa que calcule as raizes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá
// pedir os valores de a, b e c e fazer as consistências, informando ao usuario nas seguintes situações:
// a) Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve pedir os demais valores, sendo encerrado;
// b) Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa.
// c) Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
// d) Se o delta for positivo, a equação possui duas raízes reais; informe-as ao usuário;

//Corrigido, 200% mlke, amassou na logica