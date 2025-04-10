package com.gabriel.cursojava.aula15.labs;

//import java.time.LocalDate;   USANDO LOCALDATE FICA SEM GRAÇAKkkkkkk
import java.util.Scanner;

public class Exer18 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        //LocalDate dataAtual = LocalDate.now();

        System.out.println("Entre com a data em dd/mm/aaaa: ");
        String data = sc.nextLine();
        sc.close();

        String dia = data.substring(0, 2);
        String mes = data.substring(3, 5);
        String ano = data.substring(6);
        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        int anoInt = Integer.parseInt(ano);
        boolean bDia = ((diaInt > 0) && (diaInt <= 31));
        boolean bMes = ((mesInt > 0) && (mesInt <= 12));
        boolean bAno = ((anoInt >= 1900) && (anoInt <= 2025));

        if (bAno) { //ano valido
            if (bMes) { //ano valido, mes valido
                if (bDia) { //ano valido, mes valido, dia valido
                    System.out.println("Data válida.");
                } else { //ano valido, mes valido, dia invalido
                    System.out.println("Data inválida, dia incorreto.");
                }
            } else { //exception ano valido, mes invalido
                if (bDia) { //ano valido, mes invalido, dia valido
                    System.out.println("Data inválida, mês incorreto.");
                } else { //ano valido, mes invalido, dia invalido
                    System.out.println("Data inválida, mês e dia incorretos.");
                }
            }
        } else { //ano invalido
            if (bMes) { //ano invalido, mes valido
                if (bDia) { //ano invalido, mes valido, dia valido
                    System.out.println("Data inválida, ano incorreto.");
                } else { //ano invalido, mes valido, dia invalido
                    System.out.println("Data inválida, ano e dia incorretos.");
                }
            } else { //ano invalido, mes invalido
                if (bDia) { //ano invalido, mes invalido, dia valido
                    System.out.println("Data inválida, ano e mês incorretos.");
                } else { //ano invalido, mes invalido, dia invalido
                    System.out.println("Data inválida, ano, mês e dia incorretos.");
                }
            }
        }
    }
}

//18. Faça um programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.