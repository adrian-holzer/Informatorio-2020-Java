

/* 
8.	Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}

*/

import java.util.Scanner;


public class Ejercicio_8_C1 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Ingresar Nombre y Apellido : ");
        String nombAp = scan.nextLine();



        System.out.println("Ingresar Edad : ");
        int edad = scan.nextInt();

        scan.nextLine();

        System.out.println("Ingresar Dirección : ");
        String dir = scan.nextLine();


        System.out.println("Ingresar Ciudad : ");
        String ciudad = scan.nextLine();



        System.out.println(ciudad + " - "+dir +" - "+edad+" - "+ nombAp +" - ");








    }
}
