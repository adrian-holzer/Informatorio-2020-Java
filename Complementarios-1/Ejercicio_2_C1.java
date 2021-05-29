import java.util.Scanner;


/* 
2.	Realizar un programa que solicite por consola 2 números enteros. 
Para luego imprimir el resultado de la 
suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.

5 + 4 = 9
5 - 4 = 1
5 * 4 = 20
5 / 4 = 1
5 % 4 = 1


*/



public class Ejercicio_2_C1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       

        
System.out.println("Ingresar el primer número : ");
int a = sc.nextInt();

System.out.println("Ingresar el segundo número : ");

int b = sc.nextInt();


System.out.println(a + " + " + b + " = "+ (a+b));
System.out.println(a + " - " + b + " = "+ (a-b));
System.out.println(a + " * " + b + " = "+ (a*b));
System.out.println(a + " / " + b + " = "+ (a/b));
System.out.println(a + " % " + b + " = "+ (a%b));
sc.close();


    }
}
