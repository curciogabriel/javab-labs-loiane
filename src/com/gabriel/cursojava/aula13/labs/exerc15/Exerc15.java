package com.gabriel.cursojava.aula13.labs.exerc15;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto vc ganha por hora? ");
        double valorHoraBruto = sc.nextDouble();
        System.out.println("\nQuantas horas trabalhou no mês? ");
        float horasTrabalhadas = sc.nextFloat();

        double salarioBruto = valorHoraBruto * horasTrabalhadas;
        double IR = (salarioBruto * 0.11);
        double INSS = (salarioBruto * 0.08);
        double taxaSindicato = (salarioBruto * 0.05);

        System.out.println("Salário BRUTO total no referido mês: R$ " + salarioBruto);
        System.out.println("Você pagou: R$ " + INSS + " ao INSS.");
        System.out.println("Você pagou: R$ " + taxaSindicato + " ao sindicato.");
        System.out.println("Salário LÍQUIDO total  no referido mês: R$ " + (salarioBruto - IR - INSS - taxaSindicato));

        sc.close();
    }
}

//15. Questão do salário com alternativas a, b e c.
//->Corrigido, 100%.