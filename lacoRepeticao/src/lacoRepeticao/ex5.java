package lacoRepeticao;

import java.util.Scanner;

public class ex5 {
	/*
	 * Crie um programa que leia um número do teclado até que encontre um número
	 *  igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
	 */
	 public static void main(String[] args) 
	    {

	        int numero=0, somaNumeros=0;

	        Scanner kb = new Scanner(System.in);

	        do 
	        {
	                System.out.println("digite um numero");
	                numero=kb.nextInt();
	                somaNumeros=somaNumeros+numero;

	        }
	        while(numero!=0);

	        System.out.printf("\nA soma de todos os numeros é igual a: %d ",somaNumeros);

	        kb.close();
       }
}