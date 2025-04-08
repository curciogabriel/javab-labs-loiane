package com.gabriel.cursojava.aula13.exerc8;

import java.util.Scanner;

public class Exerc8 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor que você ganha por hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Digite o número de horas trabalhadas nesse mês: ");
        double horasMes = sc.nextDouble();

        System.out.println("Esse mês você vai tirar: " + (valorHora * horasMes));

        sc.close();
    }
}

//8. Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
//->Corrigido, 100%.