package Ejercicios_Repaso.Ejercicios_1_2_3_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios_Repaso {


    // En este archivo se encuentran los ejercicios  1,2,3,4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int op = 0;

        
        do {
            

            System.out.println("***************************************************************\n\n");

            System.out.println("Menú\n");
            System.out.println("1-Suma de dos números");
            System.out.println("2-Factorial de un número");
            System.out.println("3-Leer un archivo con el listado de alumnos");
            System.out.println("4-Escribir y extraer de un archivo el listado de empleados");
            System.out.println("5-Salir");
            System.out.println("\n\n***************************************************************\n\n");

         
            try {

                op = sc.nextInt();
              
            } catch (Exception e) {
              sc.nextLine();
            }
            
           
                    switch (op) {
                        case 1:

                            /*
                             * Crear una función que realice la suma de 2 números dados.
                             */
                       
                           
                             try {
                                System.out.println("Ingrese el primer número : ");

                               
                                int a = sc.nextInt();
 
                                
                                 System.out.println("Ingrese el segundo número : ");
                                int b = sc.nextInt();
 
                                
                               
                              System.out.println(a + " + " + b + " = " + getSuma(a, b));


                             } catch (Exception e) {
                                 System.out.println("\n Los datos ingresados no son correctos");
                                sc.nextLine();
                             }
                               
                           
                              
                           break;
    
                               
                         
                        
                        case 2:

                            /*
                             * Realizar una función que calcule el factorial de un número dado.
                             */


                             try {
                                System.out.println("Ingrese un número : ");
                                int num = sc.nextInt();
    
                                System.out.println("!" + num + " = " + getFactorial(num));
    
                             } catch (Exception e) {
                                System.out.println("\n Los datos ingresados no son correctos");
                                sc.nextLine();
                             }

                           
                            break;
                        case 3:

                            /*
                             * Dado un archivo de texto (alumnos.txt), crear una función que lea todos los
                             * nombres de los alumnos y los imprima por pantalla.
                             * 
                             */

                            System.out.println("\n\n***************** Alumnos en la lista  *****************\n\n\n\n");

                            leerLista("Ejercicios_Repaso/Ejercicios_1_2_3_4/files/alumnos.txt");
                            System.out.println("\n\n\n");

                            break;
                        case 4:

                            /*
                             * Teniendo una lista de objetos Empleado, cargar la misma en un archivo
                             * empleado.txt.
                             */

                            System.out.println("\n\n***************** Empleados en la lista  *****************\n\n\n\n");
                            try {
                                escribirArchivo("Ejercicios_Repaso/Ejercicios_1_2_3_4/files/empleados.txt", true);
                            } catch (Exception e) {
                                System.out.println("Ocurrio un error \n\n");

                            }
                           
                            System.out.println("\n\n\n");

                            break;
                        case 5:
                            break;

                        default:  System.out.println("\n No se ha ingresado una opción correcta.");
                        break;

                    }

            

        } while (op !=5);
        sc.close();
    }

    private static int getSuma(int a, int b) {
        return a + b;
    }

    private static int getFactorial(int num) {

        if (num == 0 || num == 1) {

            return 1;
        }

        else {
            return num * getFactorial(num - 1);
        }

    }

    private static void leerLista(String path) {
        BufferedReader reader = null;
        try {
            String currentLine;
            reader = new BufferedReader(new FileReader(path));

            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void escribirArchivo(String path, boolean sobreescribir) throws IOException {

        // Creo Empleados para guardarlos en la lista

        Empleado e1 = new Empleado("Juan Perez", "45454545");
        Empleado e2 = new Empleado("Rolando Gomez", "34343434");
        Empleado e3 = new Empleado("Laura Perez", "3636363636");
        Empleado e4 = new Empleado("Ricardo Dominguez", "3636363636");
        Empleado e5 = new Empleado("Roberto Gonzalez", "3636363636");

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);
        listaEmpleados.add(e5);

        FileWriter writer = null;
        if (sobreescribir) {

            // Sobreescribe el archivo

            writer = new FileWriter(path);
        } else {
            // Escribe debajo de la última linea

            writer = new FileWriter(path, true);

        }

        for (int i = 0; i < listaEmpleados.size(); i++) {

            writer.write("Empleado " + (i + 1) + " : { " + listaEmpleados.get(i).toString() + " } \n");

        }

        writer.close();

        leerLista(path);

    }
}
