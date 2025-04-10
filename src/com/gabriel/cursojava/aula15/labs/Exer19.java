package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro menor que 1000: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero < 1000) {

            int unidade = 0;
            int dezena = 0;
            int centena = 0;

            if ((numero / 100) >= 1) {

                centena = numero / 100;
                dezena = (numero - (centena * 100)) / 10;
                unidade = numero - (centena * 100) - (dezena * 10);

                if ((centena == 1) && (dezena == 1) && (unidade == 1)) System.out.println(centena + " centena, " + dezena + " dezena e " + unidade + " unidade.");
                else if ((centena == 1) && (dezena == 1) && (unidade != 1)) System.out.println(centena + " centena, " + dezena + " dezena e " + unidade + " unidades.");
                else if ((centena == 1) && (dezena != 1) && (unidade == 1)) System.out.println(centena + " centena, " + dezena + " dezenas e " + unidade + " unidade.");
                else if ((centena == 1) && (dezena != 1) && (unidade != 1)) System.out.println(centena + " centena, " + dezena + " dezenas e " + unidade + " unidades.");
                else if ((centena != 1) && (dezena == 1) && (unidade == 1)) System.out.println(centena + " centenas, " + dezena + " dezena e " + unidade + " unidade.");
                else if ((centena != 1) && (dezena == 1) && (unidade != 1)) System.out.println(centena + " centenas, " + dezena + " dezena e " + unidade + " unidades.");
                else if ((centena != 1) && (dezena != 1) && (unidade == 1)) System.out.println(centena + " centenas, " + dezena + " dezenas e " + unidade + " unidade.");
                else System.out.println(centena + " centenas, " + dezena + " dezenas e " + unidade + " unidades.");

            } else if ((numero / 10) >= 1) {

                dezena = numero / 10;
                unidade = numero - (dezena * 10);

                if ((dezena == 1) && (unidade == 1)) System.out.println(dezena + " dezena e " + unidade + " unidade.");
                else if ((dezena == 1) && (unidade != 1)) System.out.println(dezena + " dezena e " + unidade + " unidades.");
                else if ((dezena != 1) && (unidade == 1)) System.out.println(dezena + " dezenas e " + unidade + " unidade.");
                else System.out.println(dezena + " dezenas e " + unidade + " unidades.");

            } else {

                if (numero == 1) System.out.println(numero + " unidade.");
                else System.out.println(numero + " unidades.");

            }
        } else System.out.println("Número inválido maior que 1000.");


    }
}

//19. Faça um programa que leia um numero inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
// * Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
// -> 326 = 3 centenas, 2 dezenas e 6 unidades.
// -> 12 = 1 dezena e 2 unidades.
// * Testar com: 326, 300, 100, 320, 310, 305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16.