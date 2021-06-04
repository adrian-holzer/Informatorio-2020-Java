import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 
 * 3. Crear una lista que contenga como elementos la numeración de cartas de una
 * baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList
 * (en orden), imprimir, imprimir en orden inverso (reverse), desordenar
 * (mezclar) el arrayList y volver a imprimir.
 * 
 * 
 */
public class Ejercicio_3_C2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeracionCartas = new ArrayList<Integer>();

        for (int i = 2; i < 15; i++) {

            numeracionCartas.add(i);
        }
        System.out.println("Cartas en orden : " + numeracionCartas);

        imprimirOrdenInverso(numeracionCartas);

        getDesordenar(numeracionCartas);
        sc.close();

    }

    public static void imprimirOrdenInverso(List<Integer> numeracionCartas) {

        Collections.reverse(numeracionCartas);

        System.out.println("Cartas en orden inverso : " + numeracionCartas);

    }

    public static void getDesordenar(List<Integer> numeracionCartas) {

        Collections.shuffle(numeracionCartas);

        System.out.println("Cartas desordenadas : " + numeracionCartas);
    }
}