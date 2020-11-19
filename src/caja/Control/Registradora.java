package caja.Control;

import caja.almacenamiento.BaseDatos;
import caja.productos.Arroz;
import caja.productos.Carne;
import caja.productos.Papa;
import caja.productos.Producto;
import caja.vista.Vista;

import javax.swing.text.View;
import java.util.List;

public class Registradora {
    private BaseDatos baseDatos;

    public Registradora(){
        baseDatos = new BaseDatos();

        //Inicia el proceso de la registradora;


    }

    public void registradora() {


        int opcion;
        do{
            Vista.mostrarEncabezado();
            Vista.verMenuPrincipal();
            Vista.seleccionarOpcion();
            opcion = Vista.getOpcion();
            switch (opcion) {
                case 1:
                    comprar();
                    break;
                case 2:
                    vender();
                    break;
                case 3:
                    mostrarInventario();
                    break;
                case 4:
                    mostrarCompras();
                    Vista.mostarEncabezadoCompras();
                    break;
                case 5:
                    mostrarVentas();
                    Vista.mostrarEncabezadoVentas();
                    break;
                case 6:
                    Vista.agradecer();
                    System.exit(0);
                    break;
                default:
                    Vista.opcionInvalida();
            }
        }while (opcion >= 1 && opcion <= 6);

    }

   // El metodo comprar muestra el menu de compras y captura la opcion deseada por el usuario
    private void comprar(){
        Vista.menuCompras();
        int opcion;
        do{
            Vista.seleccionarOpcion();
            opcion= Vista.getOpcion();
            if (opcion >=1 && opcion <= 3){
                comprarProducto(opcion);
            }else if(opcion==4){
                Vista.mostrarSalida("Compras");
                return;
            }
            else
                Vista.opcionInvalida();

        }while(opcion < 1 || opcion > 4);
    }

    private void vender(){

        Vista.encabezadoVentas();
        int opcion;
        do{
            Vista.seleccionarOpcion();
            opcion= Vista.getOpcion();
            if (opcion >=1 && opcion <= 3){
                venderProducto(opcion);
            }else if(opcion==4){
                Vista.mostrarSalida("Ventas");
                return;
            }
            else
                Vista.opcionInvalida();

        }while(opcion < 1 || opcion > 4);
    }

    //registra en la bd el producto comprado
    public void comprarProducto(int opcion){
        Producto producto = null;
        switch (opcion){
            case 1:
                producto = new Papa("Papita");
                break;
            case 2:
                producto = new Arroz("Bueno");
                break;
            case 3:
                producto = new Carne("Lomo");
                break;
            default:
                Vista.opcionInvalida();
        }
        Vista.mostrarGetCantidad();
        int cantidad = Vista.getCantidad();
        Vista.mostrarGetPrecio();
        double precio = Vista.getPrecio();

        producto.setCantidad(cantidad);
        producto.setPrecio(precio);
        baseDatos.comprar(producto);

    }

    public void venderProducto(int opcion){
        Producto producto = null;
        if (opcion < 1 || opcion > 3){
            Vista.opcionInvalida();
            return;
        }

        producto= baseDatos.getPorIndice(opcion - 1);
        Vista.mostrarGetCantidad();
        int cantidad = Vista.getCantidad();
        if(producto.getCantidad() < cantidad){
            Vista.mostrarCantidadInvalida();
            return;
        }

        producto.setCantidad(cantidad);
        baseDatos.vender(producto);

    }

    private void mostrarInventario(){
        Vista.encabezadoInventario();
        Vista.mostrarInventarioItems(baseDatos.getTodos());
        Vista.mostrarCualquiera();
        Vista.getOpcion();
    }

    private void mostrarCompras(){
        List <Producto> listado = baseDatos.getCompras();
        Vista.mostarEncabezadoCompras();
        Vista.mostrarCompras(listado);
        Vista.mostrarCualquiera();
        Vista.getOpcion();

    }

    private void mostrarVentas(){
        List <Producto> listado = baseDatos.getVentas();
        Vista.mostrarEncabezadoVentas();
        Vista.mostrarVentas(listado);
        Vista.mostrarCualquiera();
        Vista.getOpcion();

    }
}
