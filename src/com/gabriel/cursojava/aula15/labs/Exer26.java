package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer26 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero de litros: ");
        double litros = sc.nextDouble();
        sc.nextLine();
        System.out.println("Qual o tipo de combustível? \n[G] - Gasolina\n[A] - Álcool");
        char tipoCombustivel = sc.nextLine().charAt(0);
        sc.close();

        double valorBruto = 0.0;
        double valorLiquido = 0.0;
        double valorCombustivel = 0.0;
        double desconto = 0.0;
        double combustivelDesconto = 0.0;
        String combustivel = "0";

        if ((tipoCombustivel == 'g') || (tipoCombustivel == 'G')) {

            combustivel = "Gasolina";
            valorCombustivel = 2.5;

            if (litros <= 20) {
                desconto = .04;
                combustivelDesconto = valorCombustivel - (valorCombustivel * desconto);
                valorLiquido = litros * combustivelDesconto;
            } else {
                desconto = .06;
                combustivelDesconto = valorCombustivel - (valorCombustivel * desconto);
                valorLiquido = litros * combustivelDesconto;
            }

            System.out.println("Tipo de combustível: " + combustivel);
            System.out.println("Quantidade de litros: " + litros);
            System.out.println("Valor da gasolina BRUTO: " + valorCombustivel);
            System.out.println("Desconto de: " + (desconto * 100) + "% por litro.");
            System.out.println("Valor da gasolina LÍQUIDO: " + (combustivelDesconto));
            System.out.println("Valor líquido: " + valorLiquido);
        } else if ((tipoCombustivel == 'a') || (tipoCombustivel == 'A')) {

            combustivel = "Álcool";
            valorCombustivel = 1.9;

            if (litros <= 20) {
                desconto = .03;
                combustivelDesconto = valorCombustivel - (valorCombustivel * desconto);
                valorLiquido = litros * combustivelDesconto;
            } else {
                desconto = .05;
                combustivelDesconto = valorCombustivel - (valorCombustivel * desconto);
                valorLiquido = litros * combustivelDesconto;
            }

            System.out.println("Tipo de combustível: " + combustivel);
            System.out.println("Quantidade de litros: " + litros);
            System.out.println("Valor da gasolina BRUTO: " + valorCombustivel);
            System.out.println("Desconto de: " + (desconto * 100) + "% por litro.");
            System.out.println("Valor da gasolina LÍQUIDO: " + (combustivelDesconto));
            System.out.println("Valor líquido: " + valorLiquido);
        } else System.out.println("Opção inválida.");
    }
}

//26. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
// a) álcool;
//  -> até 20 litros, desconto de 3% por litro
//  -> acima de 20 litros, desconto de 5% por litro
// b) gasolina;
//  -> até 20 litros, desconto de 4% por litro
//  -> acima de 20 litros, desconto de 6% por litro
// * Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustivel (codificado da seguinte forma:
// A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina
// é R$2,50 e o preço do litro do álcool é R$1,90.

//Corrigido, 100%