
/* 7.	Realizar un Programa que dado un String de entrada en minúsculas lo convierta 
por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().
 */



import java.util.Scanner;

public class Ejercicio_7_C1 {
    
    
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Ingresar palabra  : ");
        String str = scan.nextLine();
       
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i< str.length(); i++)
        {
            char caracter = str.charAt(i);
            
            if (caracter==' ') {
                sb.append(' ');

            }
            if (122 >= caracter && caracter >=97)
            {
                caracter = (char)( (caracter - 32) ); 
                sb.append(caracter);
            }else  {
                sb.append(caracter);
            }
         }
         System.out.println(sb);

        scan.close();
     }



}

