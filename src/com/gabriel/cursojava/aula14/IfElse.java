package com.gabriel.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a idade: ");
        int idade = sc.nextInt();

        if(idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }



        sc.close();
    }
}
