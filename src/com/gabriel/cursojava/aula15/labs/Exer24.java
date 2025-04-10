package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer24 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Entre com o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Qual operação você deseja fazer?");
        System.out.println("[1] - Adição");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        System.out.print("Digite sua resposta conforme o dígito: ");
        int opcao = sc.nextInt();
        sc.close();

        double result = 0;

        switch (opcao) {
            case 1:
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default: System.out.println("Opção inválida.");
        }

        int resultConvert = (int) Math.ceil(result);
        boolean isItDecimal = (resultConvert - result) > 0;

        if (result % 2 == 0) {
            if (result >= 0) {
                if (isItDecimal) {
                    System.out.println("O número " + result + " é par, positivo e decimal.");
                } else {
                    System.out.println("O número " + result + " é par, positivo e inteiro.");
                }
            } else {
                if (isItDecimal) {
                    System.out.println("O número " + result + " é par, negativo e decimal.");
                } else {
                    System.out.println("O número " + result + " é par, negativo e inteiro.");
                }
            }
        } else {
            if (result >= 0) {
                if (isItDecimal) {
                    System.out.println("O número " + result + " é ímpar, positivo e decimal.");
                } else {
                    System.out.println("O número " + result + " é ímpar, positivo e inteiro.");
                }
            } else {
                if (isItDecimal) {
                    System.out.println("O número " + result + " é ímpar, negativo e decimal.");
                } else {
                    System.out.println("O número " + result + " é ímpar, negativo e inteiro.");
                }
            }
        }
    }
}

//24. Faça um programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja fazer. O resultado
// da operação deve ser acompanhado de uma frase que diga se o número é:
// -> par ou impar;
// -> positivo ou negativo;
// -> inteiro ou decimal.