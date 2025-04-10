package com.gabriel.cursojava.aula13.labs.exerc14;

import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.println("Oi João! Quantos kg de pesca você trouxe hoje?");
        double peso = sc.nextDouble();

        double excesso = 0;
        double multa = 0;

        if (peso > 50) {
            excesso = peso - 50;
            multa = excesso * 4;
            System.out.println("Vixe seu João, hoje tem multa! Você vai ter que pagar: " + multa);
        } else {
            System.out.println("Hoje não tem multa, seu João!");
        }
    }
}

//14. João comprou um pc para controlar o rendimento diario de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca de SP (50 kg) deve pagar uma multa de R$ 4,00 por kg excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
