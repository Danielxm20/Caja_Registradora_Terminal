package caja.almacenamiento;

import caja.productos.Arroz;
import caja.productos.Carne;
import caja.productos.Papa;
import caja.productos.Producto;

public class BaseDatos {
    private Producto[] productos;

    public BaseDatos() {
        productos = new Producto[3];
        Producto papa = new Papa("Papita");
        Producto arroz = new Arroz("Bueno");
        Producto carne = new Carne("Lomo");

        productos[0] = papa;
        productos[1] = arroz;
        productos[2] = carne;
    }
        public Producto getPorIndice(int i){
            if (i < 0 || i > 2){
                System.out.println("Indice no valido");
                return null;

            }
            return productos[i];
        }

        public Producto[] getTodos(){
            return productos;
        }

}
