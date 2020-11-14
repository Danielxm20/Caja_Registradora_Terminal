package caja.vista;

import java.awt.*;
import java.util.Scanner;

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
        System.out.print("\t\t Digite la opcion");
    }

    public static int getOpcion(){
        Scanner teclado = new Scanner(System.in);
        return  teclado.nextInt();
    }
}
