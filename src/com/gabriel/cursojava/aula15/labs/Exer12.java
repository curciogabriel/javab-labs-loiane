package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor da sua hora: ");
        double valorHora = sc.nextDouble();
        System.out.println("Entre com o valor de horas trabalhadas no mês: ");
        double qtdHoras = sc.nextDouble();
        double salarioBruto = valorHora * qtdHoras;

        double percentualIR = 0.00;

        double valorINSS = salarioBruto * .1;
        double valorFGTS = salarioBruto * .11;

        // desconto do IR
        if (salarioBruto <= 900) percentualIR = 0;
        else if (salarioBruto > 900 && salarioBruto <= 1500) percentualIR = .05;
        else if (salarioBruto > 1500 && salarioBruto <= 2500) percentualIR = .1;
        else percentualIR = .2;

        double valorIR = salarioBruto * percentualIR;
        double totalDescontos = (valorIR + valorINSS);

        // imprimindo infos conforme tabela
        System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + ")\t: R$ " + salarioBruto);
        System.out.println("( - ) IR: (" + (percentualIR * 100) + "%)\t\t\t\t: R$ " + (salarioBruto * percentualIR));
        System.out.println("( - ) INSS: (10%)\t\t\t\t: R$ " + valorINSS);
        System.out.println("FGTS (11%)\t\t\t\t\t\t: R$ " + valorFGTS);
        System.out.println("Total de descontos\t\t\t\t: R$ " + totalDescontos);
        System.out.println("Salário Líquido\t\t\t\t\t: R$ " + (salarioBruto - totalDescontos));
    }
}

//12. Faça um programa para o calculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que
// depende do salario bruto (conforme tabela abaixo) e 3% para o sindicato e que o FGTS corresponde a 11% do salário
// bruto, mas não é descontado (é a empresa que deposita). O salario liquido corresponde ao salario bruto menos os
// descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
// * Desconto do IR:
// -> salario bruto até 900,00 (inclusive) - isento
// -> salario bruto ate 1500,00 (inclusive) - desconto de 5%
// -> salario bruto ate 2500,00 (inclusive) - desconto de 10%
// -> salario bruto acima de 2500 - desconto de 20%.
// Imprima na tela as informações, dispostas conforme o exemplo abaixo. Nele o valor da hora é 5 e a quantidade é 220.

//Corrigido, 95%