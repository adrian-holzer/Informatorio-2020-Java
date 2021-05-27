import java.util.Scanner;

/* 
 9.	Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.


*/
public class Ejercicio_9_C1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cont = 0;
        System.out.println("Ingresar string  : ");
        String str = scan.nextLine();
        System.out.println("Ingresar letra a buscar  : ");

        String buscar = scan.nextLine();

        try {
           int  b = Integer.parseInt(buscar);
           System.out.println("Se ha ingresado un número");
        } catch (Exception e) {

            if (buscar.length() > 1) {

                System.out.println("No se ha ingresado una letra");

            } else {

                char caracter = buscar.charAt(0);

                if (caracter == ' ') {
                    System.out.println("No se ha ingresado una letra correcta");
                } else {

                    for (int i = 0; i < str.length(); i++) {

                        if (str.charAt(i) == caracter) {
                            cont++;
                        }
                    }

                    System.out.println(cont);
                }

            }

        }

        scan.close();

    }

}