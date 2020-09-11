package lacoRepeticao;

import java.util.Scanner;

public class ex2 {
/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
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
          System.out.printf("\nNumeros ímpares:%d ",impar);


         tec.close();
    }
}
