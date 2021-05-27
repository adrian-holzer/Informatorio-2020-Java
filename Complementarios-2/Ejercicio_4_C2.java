import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 4.	Cargar un arrayList con 12 nombres de estudiantes (String), 
 * luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
 */
public class Ejercicio_4_C2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> listadoalumnos = new ArrayList<String>();

        for (int i = 0; i < 12; i++) {
            System.out.println("Ingresar nombre Alumno");
            String nom = sc.nextLine();
            
            listadoalumnos.add(nom);

        }


        List<String> cursoA =  listadoalumnos.subList(0, 4);
        List<String> cursoB =  listadoalumnos.subList(4, 8);
        List<String> cursoC =  listadoalumnos.subList(8, 12);

        System.out.println("Curso A : "+ cursoA);
        System.out.println("Curso B : "+ cursoB);
        System.out.println("Curso C : "+ cursoC);

    }
}