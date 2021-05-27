import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 5.	Dados 2 ArrayList que contienen horas-trabajadas (array1) y 
 * valor-por-hora(array2) del resumen de carga de horas semanal de un empleado.
 *  Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
 */
public class Ejercicio_5_C2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List <Integer> horas_trab = new ArrayList <Integer> ();
        List <Integer> valor_hora = new ArrayList <Integer> ();
        List <Integer> totales = new ArrayList <Integer> ();

        int totalPagar = 0;
        Integer [ ] h = {6,7,8,4,5};
        horas_trab= Arrays.asList(h);

        Integer [ ] v = {350, 345, 550, 600, 320};
        valor_hora= Arrays.asList(v);


        for (int i = 0; i < h.length; i++) {
            
            totales.add(horas_trab.get(i)*valor_hora.get(i));
        }

     
        
        for (Integer p : totales) {
            
            totalPagar+=p;
        }

        System.out.println("Total : "+ totalPagar);

        System.out.println("Totales por dia : "+ totales);
    }
}