package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma letra: ");
        char letra = sc.nextLine().charAt(0);

        if (letra == 'f' || letra == 'F')
            System.out.println("F - Feminino");
        else if (letra == 'm' || letra == 'M')
            System.out.println("M - Masculino");
        else
            System.out.println("Sexo inválido.");

        sc.close();
    }
}

//3. Faça um programa que verifique se uma letra digitada é "F" ou "M", conforme a letra escrever: F - Feminino,
//M - Masculino, Sexo inválido.