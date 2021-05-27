


import java.util.Scanner;

/* 5.	Se desea una aplicación que solicite 2 números enteros y
 realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
 */
public class Ejercicio_5_C1 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int suma = 0;
        
        System.out.println("Ingresar primer número entero : ");

        int a = scan.nextInt();

        System.out.println("Ingresar segundo número entero : ");
        int b = scan.nextInt();


        for (int i = 0; i < b; i++) {

            suma = suma+a;
            
        }


        System.out.println( a+" x "+ b +" = " + suma );

    }
}
