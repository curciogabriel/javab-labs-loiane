package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer27 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a quantidade de morangos (em kg): ");
        double morango = sc.nextDouble();
        System.out.println("Entre com a quantidade de maçãs (em kg): ");
        double maca = sc.nextDouble();
        sc.close();

        double valorMorango = 0;
        double valorMaca = 0;

        if (morango <= 5) valorMorango = morango * 2.5;
        else valorMorango = morango * 2.2; // 13.2

        if (maca <= 5) valorMaca = maca * 1.8; // 7.2
        else valorMaca = maca * 1.5;

        double valorTotal = valorMorango + valorMaca;

        if((maca + morango > 8) || (valorTotal > 25)) {
            valorTotal -= (valorTotal * .1);
            System.out.println("Valor a ser pago: R$ " + valorTotal);
        } else System.out.println("Valor a ser pago: R$ " + valorTotal);
    }
}

//27. Uma fruteira está vendendo frutas com a seguinte tabela de preços: (tabela)
//----------------------------------------------------------------------------------
//(tabela):
//          | Ate 5 kg | Acima de 5 kg |
// Morango  | R$2,50/kg|    R$2,20/kg
// Maçã     | R$1,80/kg|    R$1,50/kg
//----------------------------------------------------------------------------------
// * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um
// desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade
// (em Kg) de maçãs adquiridas e escreva o valor a ser pago pelo cliente.
