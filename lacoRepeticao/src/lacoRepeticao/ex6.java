package lacoRepeticao;

import java.util.Scanner;

public class ex6 {
	/*
	 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a 
	 * m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
	 */
	
	public static void main(String[] args) {
		       Scanner kb = new Scanner(System.in);
		           int numero=0, multiplo=0;
		           double soma=0, cont=0;
		           double media=0;
		       do{
		           System.out.println("Digite um numero inteiro: ");
		           numero=kb.nextInt();
		       if (numero%3==0)
		       {
		           soma=soma+numero;
		               cont=cont+1;
		       }
		       }while (numero!=0);
		           media=soma/(cont-1);
		           System.out.printf("A media dos numeros multiplos de 3 �: %.2f ", media);
		       kb.close();
}
}


