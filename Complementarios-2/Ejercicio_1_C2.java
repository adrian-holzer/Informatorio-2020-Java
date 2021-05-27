import java.util.ArrayList;
import java.util.Scanner;


/* 1.	Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking
 */

 public class Ejercicio_1_C2{
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        ArrayList <String> ciudades = new ArrayList<String>();
 System.out.println("Ingresar ranking ciudad favorita : ");
        for (int i = 0; i < 3; i++) {
           

            System.out.println("#"+(i+1));
            String city = sc.nextLine();
            ciudades.add(city);

        }

        getRanking(ciudades);
        
       
        

    }


    


    public static void getRanking(ArrayList<String> ciudades){

        System.out.println("Ranking de ciudades favoritas  : ");

        for (String c : ciudades) {
          

            System.out.println("#"+ (ciudades.indexOf(c)+1) + " - "+ c);
        }
    }
}
