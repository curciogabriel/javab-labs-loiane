package com.gabriel.cursojava.aula13.exerc17;

import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho da área a ser pintada?");
        double area = sc.nextDouble();

        double litroTinta = area / 6;
        double lataTinta = litroTinta / 18;
        double galaoTinta = litroTinta / 3.6;
        double valorLata = lataTinta * 80;
        double valorGalao = galaoTinta * 25;

        System.out.println("Quantidade de tinta a ser comprada: " + litroTinta + " litros.");

        System.out.println("Comprando apenas LATAS, você vai precisar de: " + lataTinta + " latas e vai gastar: R$ " + valorLata);
        System.out.println("Comprando apenas GALÕES, você vai precisar de: " + galaoTinta + " galões e vai gastar: R$ " + valorGalao);

        int melhorPrecoLata = ((int) (lataTinta)) * 80;
        double melhorPrecoGalao = ((litroTinta % 18) / 3.6) * 25;
        double melhorPreco = melhorPrecoLata + melhorPrecoGalao;

        System.out.println("Melhor preço, misturando entre os dois: R$ " + melhorPreco);

        sc.close();
    }
}
