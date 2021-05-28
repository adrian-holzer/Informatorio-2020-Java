

public class Empleado {


    public String nombreApellido;
    public String dni;
    public Integer horasTrabajadas;
    public Integer valorHora;

    Empleado(String nombap, String dni, Integer horasTrabajadas,Integer valorHora){

this.nombreApellido = nombap;
this.dni = dni;
this.horasTrabajadas= horasTrabajadas;
this.valorHora=valorHora;




    }


    public void info(){

        System.out.println(this.nombreApellido + " - DNI : "+ this.dni + " - Horas Trabajadas : "+this.horasTrabajadas + " - Valor Hora : " + this.valorHora);

    }

    public double getTotalPagar(){

       return this.horasTrabajadas*this.valorHora;

    }
    
}