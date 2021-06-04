import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2.	Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número 
 * entero al principio de la lista y otro al final. 
 * Por último, iterar e imprimir los elementos de la lista 
 * y el tamaño de la misma (antes y después de agregar 
 * a en la primera y última posición).
 */
public class Ejercicio_2_C2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();


        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresar número : ");

            try {
                int num = sc.nextInt();
                listaNumeros.add(num);
            } catch (Exception e) {
                System.out.println("Ingrese un número correcto");
                i--;
                sc.nextLine();
            }
           
        }

        System.out.println("\n - Tamaño  antes de agregar al principio : " + listaNumeros.size());

        try {
            System.out.println("\n Ingresar un número para agregar al principio : ");
            int numAgregarP = sc.nextInt();
            agregarAlPrincipio(listaNumeros, numAgregarP);

        } catch (Exception e) {
            System.out.println("No se ha ingresado un valor correcto");
            sc.nextLine();
            sc.close();
            return;
        }
        




        System.out.println("\n- Tamaño  después de agregar al principio : " + listaNumeros.size());

        System.out.println("\n- Tamaño antes de agregar al final : " + listaNumeros.size());


        try {
         
           System.out.println("Ingresar un número para agregar al final : ");
        int  numAgregarF = sc.nextInt();

         agregarAlFinal(listaNumeros, numAgregarF);

        } catch (Exception e) {
            System.out.println("No se ha ingresado un valor correcto");
            sc.nextLine();
            sc.close();
            return;
        }
        

        System.out.println("Tamaño  después de agregar al final : " + listaNumeros.size());


        imprimirLista(listaNumeros);


        sc.close();


    }


    public static ArrayList<Integer> agregarAlPrincipio(ArrayList<Integer> listaNumeros, int num ) {
        


      
        listaNumeros.add(0,num);


        return listaNumeros;
    }


    public static ArrayList<Integer> agregarAlFinal(ArrayList<Integer> listaNumeros, int num ) {
        

        listaNumeros.add(num);
      
        return listaNumeros;
    }


    public static void imprimirLista(ArrayList<Integer>listaNumeros) {

        for (Integer i : listaNumeros) {
            
            System.out.print(i+ " - ");
        }

        
    }
}