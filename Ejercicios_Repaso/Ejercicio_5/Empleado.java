

import java.time.LocalDate;

public class Empleado implements Comparable<Empleado>{
    
/* 
    Nombre, apellido: String
    fecha de nacimiento: Fecha con formato (dia-mes-año, ejemplo: 23-05-2021)
    Sueldo: es numérico con decimales. */
    


    private String nombre ; 
    private String apellido ;
    private LocalDate fechaNac ;
    private double sueldo ;


    Empleado(String nombre , String apellido , LocalDate fechaNac , double sueldo){

        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaNac=fechaNac;
        this.sueldo=sueldo;

    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }


    public double getSueldo() {
        return sueldo;
    }


    public int getEdad(){

        // TODO
        

        return 1;

    }

   

    @Override
    public String toString() {
        return this.nombre + " - "+ this.apellido + " - "+ this.fechaNac+ " - "+ this.sueldo ;
    }
}
