package caja.test;

import caja.almacenamiento.BaseDatos;
import caja.productos.Producto;
import caja.vista.Vista;

public class Main {

    public static void main(String args[]){

        Jabon j= new Jabon("Zote");
        System.out.println(j); // imprime el estado del objeto

        BaseDatos basedatos = new BaseDatos();
        Producto producto = basedatos.getPorIndice(0);
        System.out.println(producto);

        Vista.mostrarEncabezado();
        Vista.verMenuPrincipal();
        int option = Vista.getOpcion();
        System.out.println("La opciondigitada fue:" + option);

    }
}
