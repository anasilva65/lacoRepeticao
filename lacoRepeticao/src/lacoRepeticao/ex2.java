package lacoRepeticao;

import java.util.Scanner;

public class ex2 {
/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int numero, par=0, impar=0;

        for(numero=1; numero<=10;numero++)
        {
            System.out.printf(" %d ",numero);

            if(numero%2==0) 
            {
                par=par+1;
            }
            else 
            {
                impar=impar+1;
            }

        }

          System.out.printf("\nNumeros Pares:%d ",par);
          System.out.printf("\nNumeros �mpares:%d ",impar);


         tec.close();
    }
}
