package caja.productos;

public abstract class Producto implements Cloneable {

    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(){}

    public Producto(String n){
        this.nombre = n;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad<0){
            System.out.println("No puede asignar una cantidad negativa");
            return;
        }
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio < 0){
            System.out.println("No se puede asignar precio negativo");
            return;
        }
        this.precio = precio;
    }

    @Override
    public String toString(){ // Sobre escribiendo el metodo para saber el estado del objeto
        return this.nombre + " - " + this.cantidad + " - " + this.precio; // devuelve los atributos del objeto
    }

    public Producto clone() throws CloneNotSupportedException{
        return (Producto) super.clone();
    }
}
