package Ejercicios_Repaso.Ejercicios_1_2_3_4;
public class Empleado {
    

    private String name ;
    private String dni ;


    Empleado(String name,String dni){

        this.name= name;
        this.dni= dni;
    }


    @Override
    public String toString() {
        return "Nombre : "+this.name + " - DNI : " + this.dni;
    }


}
