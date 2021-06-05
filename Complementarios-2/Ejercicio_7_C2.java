import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 

7.	Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), 
nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final.
 Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y 
 si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y 
el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 

 */


public class Ejercicio_7_C2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Ingresar primer número");
        int num1 = sc.nextInt();
        
        System.out.println("Ingresar segundo número");
        int num2 = sc.nextInt();

        if (num1>=num2) {
            System.out.println("El primer número debe ser menor  al segundo");
        }else{


          String[] arr = fizzBuzzFuncion(num1, num2);

          System.out.println(Arrays.toString(arr));

        }

        sc.close();

    }



    public static String[] fizzBuzzFuncion (int a , int b) {
        

        ArrayList<String> arr = new ArrayList<String>() ;

        for (int i = a; i < b; i++) {
            
            if (i%3==0 && i%2 ==0) {
                arr.add("\""+"FizzBuzz"+"\"");
            }else if (i%3==0) {
                arr.add("\""+"Buzz"+"\"");

            }
            else if (i%2==0) {
                arr.add("\""+"Fizz"+"\"");

            }else{
                arr.add("\""+i+"\"");

            }
        }
        String [] arrayDeStrings = arr.toArray(new String[arr.size()]);



        return arrayDeStrings;
    }


}