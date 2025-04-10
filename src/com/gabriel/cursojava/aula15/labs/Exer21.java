package com.gabriel.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer21 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do saque: ");
        int saque = sc.nextInt();
        sc.close();

        if ((saque >= 10) && (saque <= 600)) {

            if ((saque / 100) >= 1) { //466 resolve a cond.

                int peixe = saque / 100; //fica 4.66, indo apenas 4 peixe
                if (((saque - (peixe * 100)) / 50) >= 1) { //466 resolve a cond.

                    int onca = ((saque - (peixe * 100)) / 50); //fica 1.32, indo apenas 1 onca
                    if (((saque - (peixe * 100) - (onca * 50)) / 10) >= 1) { //466 resolve a cond.

                        int arara = ((saque - (peixe * 100) - (onca * 50)) / 10); //fica 1.6, indo apenas 1 arara
                        if (((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5) >= 1) { //466 resolve a cond.

                            int garca = ((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5); //fica 1.2, indo apenas 1 garca
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) { //466 resolve a cond.

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1); //indo 1 beijaFlor

                                System.out.println(peixe + " notas de 100, " + onca + " notas de 50, " + arara + " notas de 10, " + garca + " notas de 5 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(peixe + " notas de 100, " + onca + " notas de 50, " + arara + " notas de 10 e " + garca + " notas de 5.");
                            }
                        } else {

                            int garca = 0;
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(peixe + " notas de 100, " + onca + " notas de 50, " + arara + " notas de 10 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(peixe + " notas de 100, " + onca + " notas de 50 e " + arara + " notas de 10.");
                            }
                        }
                    } else {

                        int arara = 0;
                        if (((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5) >= 1) {

                            int garca = ((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5);
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(peixe + " notas de 100, " + onca + " notas de 50, " + garca + " notas de 5 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(peixe + " notas de 100, " + onca + " notas de 50 e " + garca + " notas de 5.");
                            }
                        } else {

                            int garca = 0;
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(peixe + " notas de 100, " + onca + " notas de 50 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(peixe + " notas de 100 e " + onca + " notas de 50.");
                            }
                        }
                    }
                } else {

                    int onca = 0;
                    if (((saque - (peixe * 100) - (onca * 50)) / 10) >= 1) {

                        int arara = ((saque - (peixe * 100) - (onca * 50)) / 10);
                        if (((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5) >= 1) {

                            int garca = ((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5);
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(peixe + " notas de 100, " + arara + " notas de 10, " + garca + " notas de 5 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(peixe + " notas de 100, " + arara + " notas de 10 e " + garca + " notas de 5.");
                            }
                        } else {

                            int garca = 0;
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(peixe + " notas de 100, " + arara + " notas de 10 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(peixe + " notas de 100 e " + arara + " notas de 10.");
                            }
                        }
                    } else {

                        int arara = 0;
                        if (((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5) >= 1) {

                            int garca = ((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5);
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(peixe + " notas de 100, " + garca + " notas de 5 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(peixe + " notas de 100 e " + garca + " notas de 5.");
                            }
                        } else {

                            int garca = 0;
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(peixe + " notas de 100 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(peixe + " notas de 100.");
                            }
                        }
                    }
                }
            } else {

                int peixe = 0; //fica 4.66, indo apenas 4 peixe
                if (((saque - (peixe * 100)) / 50) >= 1) { //466 resolve a cond.

                    int onca = ((saque - (peixe * 100)) / 50); //fica 1.32, indo apenas 1 onca
                    if (((saque - (peixe * 100) - (onca * 50)) / 10) >= 1) { //466 resolve a cond.

                        int arara = ((saque - (peixe * 100) - (onca * 50)) / 10); //fica 1.6, indo apenas 1 arara
                        if (((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5) >= 1) { //466 resolve a cond.

                            int garca = ((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5); //fica 1.2, indo apenas 1 garca
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) { //466 resolve a cond.

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1); //indo 1 beijaFlor

                                System.out.println(onca + " notas de 50, " + arara + " notas de 10, " + garca + " notas de 5 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(onca + " notas de 50, " + arara + " notas de 10 e " + garca + " notas de 5.");
                            }
                        } else {

                            int garca = 0;
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(onca + " notas de 50, " + arara + " notas de 10 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(onca + " notas de 50 e " + arara + " notas de 10.");
                            }
                        }
                    } else {

                        int arara = 0;
                        if (((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5) >= 1) {

                            int garca = ((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5);
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(onca + " notas de 50, " + garca + " notas de 5 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(onca + " notas de 50 e " + garca + " notas de 5.");
                            }
                        } else {

                            int garca = 0;
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(onca + " notas de 50 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(onca + " notas de 50.");
                            }
                        }
                    }
                } else {

                    int onca = 0;
                    if (((saque - (peixe * 100) - (onca * 50)) / 10) >= 1) {

                        int arara = ((saque - (peixe * 100) - (onca * 50)) / 10);
                        if (((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5) >= 1) {

                            int garca = ((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5);
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(arara + " notas de 10, " + garca + " notas de 5 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(arara + " notas de 10 e " + garca + " notas de 5.");
                            }
                        } else {

                            int garca = 0;
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(arara + " notas de 10 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(arara + " notas de 10.");
                            }
                        }
                    } else {

                        int arara = 0;
                        if (((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5) >= 1) {

                            int garca = ((saque - (peixe * 100) - (onca * 50) - (arara * 10)) / 5);
                            if (((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1) >= 1) {

                                int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                                System.out.println(garca + " notas de 5 e " + beijaFlor + " notas de 1.");
                            } else {

                                int beijaFlor = 0;
                                System.out.println(garca + " notas de 5.");
                            }
                        } else {

                            int garca = 0;
                            int beijaFlor = ((saque - (peixe * 100) - (onca * 50) - (arara * 10) - (garca * 5)) / 1);

                            System.out.println(beijaFlor + " notas de 1.");
                        }
                    }
                }
            }

        } else System.out.println("Valor indisponível para saque.");
    }
}

//21. Faça um programa para um caixa eletronico. O programa deverá perguntar ao usuario o valor do saque e depois
// informar quanas notas de cada valor serão fornecidas. As notas disponiveis serao as de 1, 5, 10, 50 e 100 reais. O
// valor minimo é de 10 reais e o maximo de 600 reais. O programa não deve se preocupar com a quantidade de notas
// existentes na maquina.
// * Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5
// e uma nota de 1.
// * Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece tres notas de 100, uma nota de 50, quatro notas
// de 10, uma nota de 5 e quatro notas de 1.