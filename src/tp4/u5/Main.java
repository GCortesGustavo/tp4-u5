package tp4.u5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        Producto producto1 = new Producto(
                "P001",
                "Teclado",
                25000
        );

        Producto producto2 = new Producto(
                "P002",
                "Mouse",
                15000
        );

        Producto producto3 = new Producto(
                "P003",
                "Monitor",
                180000
        );

        Producto producto4 = new Producto(
                "P001",
                "Teclado Mecánico",
                50000
        );

        agregarProducto(productos, producto1);
        agregarProducto(productos, producto2);
        agregarProducto(productos, producto3);
        agregarProducto(productos, producto4);

        System.out.println("Lista final de productos:");

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public static void agregarProducto(
            List<Producto> productos,
            Producto producto
    ) {

        if (productos.contains(producto)) {
            System.out.println(
                    "El producto con código " +
                    producto.getCodigo() +
                    " ya existe. No se agregará."
            );
        } else {
            productos.add(producto);

            System.out.println(
                    "Producto agregado: " +
                    producto.getNombre()
            );
        }
    }
}