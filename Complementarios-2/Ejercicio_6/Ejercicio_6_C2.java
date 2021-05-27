package Ejercicio_6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * 6.	Se dispone de una lista de Empleados, de cada empleado se conoce:
○	Nombre y Apellido
○	DNI
○	horasTrabajadas
○	valorPorHora
Todos los empleados están cargados en un Set (HashSet),
 se desea calcular el sueldo (horasTrabajadas x valorPorHora)
  de toda esa lista para luego almacenar en un Map (o Diccionario)
   donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 

 */

public class Ejercicio_6_C2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Empleado> listaEmpleados = new HashSet<Empleado>();
        Map<String, String> empleadosData = new HashMap<String, String>();

        Empleado e1 = new Empleado("Juan Perez","34343434",50,500);
        Empleado e2 = new Empleado("Adrian Gonzalez","35353535",43,300);
        Empleado e3 = new Empleado("Laura Gomez","363633636",40,400);
        Empleado e4 = new Empleado("Carolina Lopez","373777777",45,630);

        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);


        empleadosData.put(e1.dni, " $"+e1.getTotalPagar());
        empleadosData.put(e2.dni, " $"+e2.getTotalPagar());
        empleadosData.put(e3.dni, " $"+e3.getTotalPagar());
        empleadosData.put(e4.dni, " $"+e4.getTotalPagar());
        System.out.println("\n\n***************************************************\n\n");


        System.out.println("Listado de empleados :  ");

  for (Empleado empleado : listaEmpleados) {
           empleado.info();
        }

        System.out.println("\n\n***************************************************\n\n");

        System.out.println("Empleado- Sueldo : "+ empleadosData);
        System.out.println("\n\n***************************************************\n\n");


    
    }




}





