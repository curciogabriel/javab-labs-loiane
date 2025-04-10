package com.gabriel.cursojava.aula13.labs.exerc18;

import java.util.Scanner;

public class Exerc18 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo (em MB): ");
        double fileSize = sc.nextDouble();
        System.out.print("Digite a velocidade do link de Internet (em Mbps): ");
        double linkSpeed = sc.nextDouble();

        double aproxTime = fileSize / linkSpeed;

        System.out.println("O tempo aproximado para download será: " + aproxTime + " minutos");

        sc.close();
    }
}

//18. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
//->Corrigido, 95%. ; Interpretação incorreta da questão.