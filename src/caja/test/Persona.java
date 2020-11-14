package caja.test;

public class Persona implements Cloneable { // interfaz que permite clonar objetos
    public String nombre;
    public int edad;

    public Persona clone() throws CloneNotSupportedException{
        return (Persona) super.clone();
    }

}
