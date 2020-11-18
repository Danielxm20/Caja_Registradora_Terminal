package caja.vista;

import caja.productos.Producto;

import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Vista {

    public static void mostrarEncabezado(){
        System.out.println("**********************************************************");
        System.out.println("+ Bienvenido a la caja  registradora");
        System.out.println("**********************************************************");
    }

    public static void verMenuPrincipal() {
        //System.out.print(Color.BLUE_BOLD);
        System.out.println("\t\t\t 1. Comprar");
        System.out.println("\t\t\t 2. Vender");
        System.out.println("\t\t\t 3. Inventario");
        System.out.println("\t\t\t 4. Compras");
        System.out.println("\t\t\t 5. Ventas");
        System.out.println("\t\t\t 6. Salir");
        //System.out.print(Color.RESET);
        //showEnterOption();
    }

    public static void seleccionarOpcion(){
        System.out.print("\t\t Digite la opcion: ");
    }

    public static void mostrarGetCantidad() {
        System.out.print("\t\tDigite la cantidad: ");
    }

    public static void mostrarGetPrecio() {
        System.out.print("\t\tDigite el precio: ");
    }

    public static int getOpcion(){
        Scanner teclado = new Scanner(System.in);
        return  teclado.nextInt();
    }

    public static int getCantidad() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    public static double getPrecio() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }


    public static void menuCompras(){
      //  System.out.print(Color.YELLOW);
        System.out.println("\t\t**************************************");
        System.out.println("\t\t*            MENU DE COMPRAS         *");
        System.out.println("\t\t**************************************");
       // System.out.print(Color.RESET);
        encabezadoItemsMenu();
    }

    public static void encabezadoVentas(){
        System.out.print(Color.YELLOW);
        System.out.println("\t\t**************************************");
        System.out.println("\t\t*            MENU DE VENTAS          *");
        System.out.println("\t\t**************************************");
        //System.out.print(Color.RESET);
        encabezadoItemsMenu();
    }

    public static void encabezadoInventario(){
        System.out.print(Color.YELLOW);
        System.out.println("\t\t*****************************************************");
        System.out.println("\t\t*               I N V E N T A R I O                 *");
        System.out.println("\t\t*****************************************************");
       // System.out.print(Color.RESET);
        encabezadoItems();

    }

    public static void encabezadoItems(){
       // System.out.print(Color.BLUE_BOLD);
        System.out.println("\t\t-----------------------------------------------------");
        System.out.println("\t\t* PRODUCTO\t| Cantidad\t| Vr Unitario\t| Vr Total\t*");
        System.out.println("\t\t-----------------------------------------------------");
        /*for (Producto v : productos) {
            System.out.println("\t\t* "+v.getName()+"\t| "+v.getAmount()+"\t\t| "+v.getPrice()+"\t\t\t| "+v.getAmount()*v.getPrice()+"\t\t*");
        }*/
        //System.out.print(Color.RESET);

    }

    public static void mostarEncabezadoCompras(){
        System.out.println("\t\t*****************************************************");
        System.out.println("\t\t*                C O M P R A S                      *");
        System.out.println("\t\t*****************************************************");
        encabezadoItems();
    }

    public static void mostrarEncabezadoVentas(){
        System.out.println("\t\t*****************************************************");
        System.out.println("\t\t*                  V E N T A S                      *");
        System.out.println("\t\t*****************************************************");
        encabezadoItems();
    }

    public static void encabezadoItemsMenu(){
        System.out.println("\t\t\t1. Papa");
        System.out.println("\t\t\t2. Arroz");
        System.out.println("\t\t\t3. Carne");
        System.out.println("\t\t\t4. Volver");

    }

    public static void opcionInvalida(){
        System.out.println("Opcion no valida");
    }


    public static void agradecer() {
        System.out.println("Gracias por utilizar nuestra app");
    }

    public static void mostrarSalida(String name){
        System.out.println("Saliendo del modulo: " + name);
    }

    public static void mostrarCualquiera(){
        System.out.print("Digite cualquier numero para continuar: ");
    }

    public static void mostrarInventarioItems(Producto [] productos){
        for (Producto v : productos) {
            System.out.println("\t\t* "+v.getNombre()+"\t| "+v.getCantidad()+"\t\t| "+v.getPrecio()+"\t\t\t| "+v.getCantidad()*v.getPrecio()+"\t\t*");
        }
    }

    public static void mostrarCantidadInvalida(){
        System.out.println("La cantidad es invalida");
    }

    public static void mostrarCompras(List<Producto> listado){
        for (Producto p: listado){
            System.out.println("\t\t* "+p.getNombre()+"\t| "+p.getCantidad()+"\t\t| "+p.getPrecio()+"\t\t\t| "+p.getCantidad()*p.getPrecio()+"\t\t*");

        }
    }

    public static void mostrarVentas(List <Producto> listado){
        for (Producto p: listado){
            System.out.println("\t\t* "+p.getNombre()+"\t| "+p.getCantidad()+"\t\t| "+p.getPrecio()+"\t\t\t| "+p.getCantidad()*p.getPrecio()*1.25+"\t\t*");

        }

    }
}
