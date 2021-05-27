

/* 3.	Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1) de la siguiente forma:
 */
import java.util.Scanner;


public class Ejercicio_3_C1 {
    
 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

System.out.println("Ingresar número : ");
int num = scan.nextInt();

Secuencia(num);


    }


    public static void Secuencia( int num) {
        
        
        if (num<=0) {
    
            System.out.println("Error : El numero ingresado el menor o igual a 0");
            return;
        }
        int aux = 1;

        for (int i = 0; i < num; i++) {
            
        
            for (int j = 1; j <= aux; j++) {
                
                System.out.print(j);
            }
            aux++;
            System.out.print("\n");
        }
    }


 
}

