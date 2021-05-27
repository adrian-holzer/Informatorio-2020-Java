import java.util.Scanner;

/* 
1- Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”
Input (Entrada):
Obi Wan Kenobi
Output (Salida):
HOLA Obi Wan Kenobi

*/
public class Ejercicio_1_C1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
 
        System.out.println("Ingresar nombre del usuario  : ");
        String nombre = scan.nextLine();
        
        System.out.println("HOLA "+ nombre +" !!!");
    }
}