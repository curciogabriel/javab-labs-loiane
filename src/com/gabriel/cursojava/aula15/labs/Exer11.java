package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o seu salario: ");
        double salarioAntes = sc.nextDouble();

        double percentualAumento = 0.00;
        double valorAumento = 0.00;
        double salarioDepois = 0.00;

        if (salarioAntes <= 280) {
            percentualAumento = .2;
            valorAumento = salarioAntes * percentualAumento;
            salarioDepois = salarioAntes + valorAumento;
        } else if (salarioAntes > 280 && salarioAntes <= 700) {
            percentualAumento = .15;
            valorAumento = salarioAntes * percentualAumento;
            salarioDepois = salarioAntes + valorAumento;
        } else if (salarioAntes > 700 && salarioAntes < 1500) {
            percentualAumento = .1;
            valorAumento = salarioAntes * percentualAumento;
            salarioDepois = salarioAntes + valorAumento;
        } else if (salarioAntes >= 1500){ // >= 1500
            percentualAumento = .05;
            valorAumento = salarioAntes * percentualAumento;
            salarioDepois = salarioAntes + valorAumento;
        }

        System.out.println("Salário antes do reajuste: " + salarioAntes);
        System.out.println("Percentual de aumento aplicado: " + (percentualAumento * 100) + " por cento.");
        System.out.println("Valor do aumento: " + valorAumento);
        System.out.println("Salário após o reajuste: " + salarioDepois);

        sc.close();
    }
}

//11. As Organizações Tabajara resolveram dar um aumento de salario aos seus colaboradores e lhe contraram para
// desenvolver o programa que calculara os reajustes.
// * Faça um programa que recebe o salario de um colaborador e o reajuste seguindo o seguinte criterio. baseado no atual:
// * salarios até R$280,00 (incluindo): aumento de 20%.
// * salarios entre R$280,00 e R$700,00: aumento de 15%.
// * salarios entre R$700,00 e R$1500,00: aumento de 10%.
// * salarios de R$1500,00 em diante: aumento de 5%.
// Após o aumento ser realizado, informe na tela:
// * o salario antes do reajuste;
// * o percentual de aumento aplicado;
// * o valor do aumento;
// * o novo salario, após o aumento.

//Corrigido, 100%