package lacoRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {
	/*
	 * Informar todos os números de 
	 * 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
	 */
	
	public static void main(String[] args)
	{

		      Locale.setDefault(Locale.US);
		        for(int numero = 1000; numero <= 1999; numero ++)
		        {
		             if(numero%11==5) 
		             {

		                 System.out.println(numero);
		             }

		        }   
	}
}
