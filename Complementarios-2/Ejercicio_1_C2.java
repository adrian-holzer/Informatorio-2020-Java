import java.util.ArrayList;
import java.util.Scanner;


/* 1.	Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking
 */

 public class Ejercicio_1_C2{
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        ArrayList <String> ciudades = new ArrayList<String>();

        int bandera = 1,i=1;

        while (bandera!=0) {
            

            System.out.println("Ingresar  ciudad favorita : ");

            
               
    
                System.out.println("#"+(i));
                String city = sc.nextLine();
                ciudades.add(city);
                i++;
    
            
            System.out.println("Presione 0 para finalizar o enter para ingresar una nueva ciudad");
            try {
                bandera = Integer.parseInt(sc.nextLine());

            } catch (Exception e) {
                continue;
            }
    

        }

        getRanking(ciudades);
        
       
        sc.close();


    }


    


    public static void getRanking(ArrayList<String> ciudades){

        System.out.println("Ranking de ciudades favoritas  : ");

        for (String c : ciudades) {
          

            System.out.println("#"+ (ciudades.indexOf(c)+1) + " - "+ c);
        }
    }
}
