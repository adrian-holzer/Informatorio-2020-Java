
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Ejercicio_5_R {

    public static void main(String[] args) {

        System.out.println("Ejercicio 5 - Propuesto");

        List<Empleado> listaEmpleados = new ArrayList<Empleado>();

        // Leo el archivo y agrego los empleados a la lista. 

        listaEmpleados = leerListaEmpleados(listaEmpleados, "Ejercicios_Repaso/Ejercicio_5/empleados.txt");


   // Menu de opciones
        imprimirMenu(5,listaEmpleados);

}






public static void imprimirMenu(int opciones,List<Empleado> listaEmpleados) {
    

    Scanner sc = new Scanner(System.in);
  

    int op=0 ;
    do {


        System.out.println("\n\n\t\t********************** Menu *****************\n\n\t\t");
        System.out.println("1-Buscar empleado que comience con una letra dada en el apellido\n");
        System.out.println("2-Mostrar el empleado más joven y el más viejo\n");
        System.out.println("3-Mostrar el empleado que más gana y el que menos gana.\n");
        System.out.println("4-Imprimir todos los empleados en orden alfabético (por nombre y por apellido)\n");
        System.out.println("5-Salir\n");

        try {
        op = sc.nextInt();
        sc.nextLine();


        } catch (Exception e) {
            sc.nextLine();
            continue;
           
        }
      


        switch (op) {





            case 1:
                
            System.out.println("Ingresar letra : ");
            String letra = sc.nextLine();

           List<Empleado>listaEmpleadosApellidos =  getEmpleadosLetraApellido(letra.charAt(0),listaEmpleados);

           if (listaEmpleadosApellidos.size()==0) {
               System.out.println("No hay empleados cuyo apellido  empiece con "+letra);
           }
           else{
           imprimirLista(listaEmpleadosApellidos);

           }


                break;
        





            case 2:
                
          
            Map<String, ArrayList<Empleado>> listaMayorMenor = getMayoryMenorEdad(listaEmpleados);

           if ( listaMayorMenor.size()==0) {
               System.out.println("No hay empleados en la lista");
           }

           else{
            for (Map.Entry<String, ArrayList<Empleado>> map : listaMayorMenor.entrySet()) {
        
                System.out.println("\n\n -- "+map.getKey()+" -- \n\n ");
        
                for (Empleado empleado : map.getValue()) {
                 
                    System.out.println(" { Nombre: "+ empleado.getNombre() + " , Apellido : "+ empleado.getApellido() + " , Edad : "+ empleado.calcularEdad() + " }");
                }
            }
 
            };break;




         case 3:
                
          
            Map<String, ArrayList<Empleado>> listaMayorMenorSueldo = getMayoryMenorSueldo(listaEmpleados);

           if ( listaMayorMenorSueldo.size()==0) {
               System.out.println("No hay empleados en la lista");
           }

           else{
            for (Map.Entry<String, ArrayList<Empleado>> map : listaMayorMenorSueldo.entrySet()) {
        
                System.out.println("\n\n -- "+map.getKey()+" -- \n\n ");
        
                for (Empleado empleado : map.getValue()) {
                 
                    System.out.println(" { Nombre: "+ empleado.getNombre() + " , Apellido : "+ empleado.getApellido() + " , Sueldo : "+ empleado.getSueldo() + " }");
                }
            }
 
            };break;



            case 4:
                
          

           List<Empleado>listaEmpleadosOrdenAlf =  listOrdenAlfabetico(listaEmpleados);

           if (listaEmpleadosOrdenAlf.size()==0) {
               System.out.println("No hay empleados en la lista");
           }
           else{
           imprimirLista(listaEmpleadosOrdenAlf);

           }


                break;
        


            default:
                break;
        }
    } while (op!=5);




    sc.close();
}




// Imprime la lista pasada por parametro

public static void imprimirLista(List<Empleado>listaEmpleados) {
    for (Empleado empleado : listaEmpleados) {
    System.out.println(empleado.toString());}
}



 // Lee la la lista de empleados del archivo y los guarda en una lista

    public static List<Empleado> leerListaEmpleados(List<Empleado> listaEmpleados, String path) {

        String currentLine;
        BufferedReader reader = null;
       
        try {

            reader = new BufferedReader(new FileReader(path));

            while ((currentLine = reader.readLine()) != null) {

                listaEmpleados.add(separarAtributos(currentLine));

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return listaEmpleados;

    }


    /*
    
    Trata cada línea (String) del archivo , separa los campos y crea un
objeto Empleado por cada linea
    
    */


    public static Empleado separarAtributos(String currentLine) {
        

        String [] datosEmpleado = currentLine.split(",");

        Double sueldo = parsearSueldo(datosEmpleado[3]);
        // Creo el empleado
       

         LocalDate fechaNacimiento = formatearFecha(datosEmpleado[2], "dd-MM-yyyy");

        Empleado e = new Empleado(datosEmpleado[0], datosEmpleado[1],fechaNacimiento,sueldo);


       return e;
    }




    // Formatea la fecha pasando de String a LocalDate con un formato pasado por parámetro

    public static LocalDate formatearFecha(String fecha, String formato) {



        DateTimeFormatter format = DateTimeFormatter.ofPattern(formato);
        
        return LocalDate.parse(fecha,format);

    }


    // Parsea el sueldo de String a double 


    public static Double parsearSueldo(String sueldo) {
       return Double.parseDouble(sueldo);
    }




    /****** Calculos sobre la lista  *******/




  /* Método que devuelve todos los empleados que comienzan con una letra dada en el
apellido*/


        public static List<Empleado> getEmpleadosLetraApellido(char letra, List<Empleado>listaEmpleados)

        {

            List<Empleado> listaFiltrada = new ArrayList<Empleado>();

            
            for (Empleado e : listaEmpleados) {
                
                if (Character.toLowerCase(e.getApellido().charAt(0))== Character.toLowerCase(letra) ) {
                    
                    listaFiltrada.add(e);
                }
            }




            return listaFiltrada;
        }
 



/* 

        Método que devuelve el empleado más joven y el más viejo (necesito una funcion para
calcular el año basado en una fecha -> Se encuentra en la clase Empleado) */



public static Map<String,ArrayList<Empleado>> getMayoryMenorEdad (List<Empleado>listaEmpleados) {
    

    Map<String,ArrayList<Empleado>>mayorMenor= new HashMap<String, ArrayList<Empleado>>();

    ArrayList<Empleado> mayores = new ArrayList<Empleado>();
    ArrayList<Empleado> menores = new ArrayList<Empleado>();

    int auxMayor=listaEmpleados.get(0).calcularEdad(), auxMenor=listaEmpleados.get(0).calcularEdad();


    for (Empleado e : listaEmpleados) {
        int edad=e.calcularEdad();

        // Calculo los menores

        if (edad<auxMenor) {
            auxMenor=edad;
            menores.removeAll(menores);
            menores.add(e);
        }else if(edad==auxMenor){
            menores.add(e);
        }



        // Calculo los mayores
        if (edad>auxMayor) {
            auxMayor=edad;
            mayores.removeAll(mayores);
            mayores.add(e);
        }else if(edad==auxMayor){
            mayores.add(e);
        }

    }


    mayorMenor.put("Mayor/es", mayores);
    mayorMenor.put("Menor/es", menores);




    return mayorMenor;
}





/* Metodo para obtener el empleado que más gana y el que menos gana.
 */   

public static Map<String,ArrayList<Empleado>> getMayoryMenorSueldo(List<Empleado>listaEmpleados) {


    Map<String,ArrayList<Empleado>>mayorMenor= new HashMap<String, ArrayList<Empleado>>();



    ArrayList<Empleado> mayores = new ArrayList<Empleado>();
    ArrayList<Empleado> menores = new ArrayList<Empleado>();

    double auxMayorSueldo=listaEmpleados.get(0).getSueldo(), auxMenorSueldo=listaEmpleados.get(0).getSueldo();


    for (Empleado e : listaEmpleados) {
       


        double sueldo = e.getSueldo();


        // Empleados con el mayor sueldo 

        if (sueldo>auxMayorSueldo) {
            
            auxMayorSueldo=sueldo;

            mayores.removeAll(mayores);
            mayores.add(e);

        }else if(sueldo==auxMayorSueldo){
            mayores.add(e);
        }


        // Empleados con el menor  sueldo 


        if (sueldo<auxMenorSueldo) {
            
            auxMenorSueldo=sueldo;

            menores.removeAll(menores);
            menores.add(e);

        }else if(sueldo==auxMenorSueldo){
            menores.add(e);
        }








    }


    mayorMenor.put("Mayor/es sueldos", mayores);
    mayorMenor.put("Menor/es sueldos", menores);


    return mayorMenor;





}



 
/* 

(Opcional): Imprimir todos los empleados en orden alfabético (por nombre y por
apellido). */



public static List<Empleado> listOrdenAlfabetico(List<Empleado> listaEmpleados) {
           /// Orden alfabetico
           List<Empleado> listadoOrdenAlf = listaEmpleados.stream().sorted(
            Comparator.comparing(n->n.toString())).collect(Collectors.toList());
            return listadoOrdenAlf;
}

}
