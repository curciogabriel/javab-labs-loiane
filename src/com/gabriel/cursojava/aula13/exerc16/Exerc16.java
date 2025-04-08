package com.gabriel.cursojava.aula13.exerc16;

import java.util.Scanner;

public class Exerc16 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho da área a ser pintada?");
        double area = sc.nextDouble();

        double litroTinta = area / 3;
        double lataTinta = litroTinta / 18;
        double valorLata = lataTinta * 80;

        System.out.println("Quantidade de latas a serem compradas: " + lataTinta);
        System.out.println("Preço total: R$ " + valorLata);

        sc.close();
    }
}