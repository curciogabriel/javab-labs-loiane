package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma letra (F ou M): ");
        String letra = sc.next();

        if (letra.equalsIgnoreCase("f")) System.out.println("F - Feminino");
        else if (letra.equalsIgnoreCase("m")) System.out.println("M - Masculino");
        else System.out.println("Sexo inválido");

        sc.close();
    }
}

//3. Faça um programa que verifique se uma letra digitada é "F" ou "M", conforme a letra escrever: F - Feminino,
//M - Masculino, Sexo inválido.

//Recorrigido, substituindo type char por String.