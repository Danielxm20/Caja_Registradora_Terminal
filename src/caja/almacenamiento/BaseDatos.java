package caja.almacenamiento;

import caja.productos.Arroz;
import caja.productos.Carne;
import caja.productos.Papa;
import caja.productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    private Producto[] productos;
    private List<Producto> compras;
    private List <Producto> ventas;

    public BaseDatos() {
        productos = new Producto[3];
        Producto papa = new Papa("Papita");
        Producto arroz = new Arroz("Bueno");
        Producto carne = new Carne("Lomo");

        productos[0] = papa;
        productos[1] = arroz;
        productos[2] = carne;

        compras = new ArrayList<>();
        ventas = new ArrayList<>();
    }
        public Producto getPorIndice(int i){
            if (i < 0 || i > 2){
                System.out.println("Indice no valido");
                return null;

            }

            Producto resultado = null;
            try {
                resultado =productos[i].clone();
            }catch (CloneNotSupportedException ce){
                System.out.println(ce);
            }
            return resultado;
        }

        public Producto[] getTodos(){
            Producto[] resultado = new Producto[3];
            try{
                resultado[0] = productos[0].clone();
                resultado[1] = productos[1].clone();
                resultado[2] = productos[2].clone();
            }catch (CloneNotSupportedException ce) {
                System.out.println(ce);
            }

            return resultado;
        }

    public void comprar(Producto producto) {
        Producto temp;
        switch (producto.getClass().getSimpleName()){
            case "papa":
                temp = productos[0];
                break;
            case "arroz":
                temp = productos[1];
                break;
            case "carne":

                temp = productos[2];
                break;
            default:
                System.out.println("No valido");
                return;


        }

        temp.setCantidad(temp.getCantidad()+producto.getCantidad());
        temp.setPrecio(producto.getPrecio());
        compras.add(producto);

    }

    public void vender(Producto producto) {
        Producto temp;
        switch (producto.getClass().getSimpleName()){
            case "papa":
                temp = productos[0];
                break;
            case "arroz":
                temp = productos[1];
                break;
            case "carne":

                temp = productos[2];
                break;
            default:
                System.out.println("No valido");
                return;


        }

        temp.setCantidad(temp.getCantidad()-producto.getCantidad());
        temp.setPrecio(temp.getPrecio() * 1.25);
        ventas.add(producto);

    }

    public List<Producto> getCompras(){
        return ventas;
    }

    public List<Producto> getVentas(){
        return ventas;

    }


}
