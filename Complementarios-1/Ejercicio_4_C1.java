


import java.util.Scanner;

/* 4.	Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.

 */
public class Ejercicio_4_C1 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


       
        
        System.out.println("Ingresar número : ");

        int num = scan.nextInt();

        int factorial = Factorial(num);

        System.out.println( "El factorial de " + num + " es : "+ factorial);

    }


    public static int Factorial(int num){


        int factorial = 1;

        for (int i = 1; i < num; i++) {
            

            factorial =  num  * Factorial(num-1);
        }
        return factorial;
    }
}
