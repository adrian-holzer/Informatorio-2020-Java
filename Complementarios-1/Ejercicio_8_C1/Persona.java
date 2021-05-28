public class Persona {
    


    private String nombre;
    private String apellido ;
    private int edad;
    private String direccion ;
    private String ciudad ;



    Persona(String nombre , String apellido, int edad , String direccion , String ciudad){


        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
        this.direccion= direccion;
        this.ciudad= ciudad;

    }




 @Override
 public String toString() {
     
     return this.nombre+" - "+this.apellido+ " - " +this.edad+ " - "+this.direccion + " - " + this.ciudad ;
 }
}
