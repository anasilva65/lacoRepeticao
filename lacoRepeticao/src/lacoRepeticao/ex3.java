package lacoRepeticao;

import java.util.Scanner;

public class ex3 {
	/*
	 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
	 */
public static void main(String[] args) 
{
		
		final int idadeLimite = -99, idadeMenor = 21, idadeMaior = 50;
		int idade = 0, menor = 0, maior = 0;
		Scanner tec = new Scanner(System.in);
		
		while (idade <= idadeLimite)
			System.out.printf("Digite a idade: ");
		idade = tec.nextInt();
		   {
			
			if(idade < idadeMenor) 
			{
				menor++;
			}
			else if(idade > idadeMaior)
			{
				maior++;
			}
		}
		System.out.printf("O total é: ", maior , menor);
		tec.close();
	}
}