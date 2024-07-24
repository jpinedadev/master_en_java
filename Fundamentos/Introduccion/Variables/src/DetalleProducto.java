public class DetalleProducto {
    public static void main(String[] args) {
        //nombre del producto, precio, cantidad, disponibilidad
        System.out.println("*** Tienda en linea (detalle producto) ***");
        String nombreProducto = "Mouse";
        System.out.println("nombreProducto = " + nombreProducto);
        double precioProducto = 18.25;
        System.out.println("precioProducto = " + precioProducto);
        int cantidadProducto = 10;
        System.out.println("cantidadProducto = " + cantidadProducto);
        boolean hasProducto = true;
        System.out.println("hasProducto = " + hasProducto);
        
        //cambiando valores
        System.out.println();
        nombreProducto = "Teclado";
        System.out.println("nombreProducto = " + nombreProducto);
        precioProducto = 45.53;
        System.out.println("precioProducto = " + precioProducto);
        cantidadProducto = 5;
        System.out.println("cantidadProducto = " + cantidadProducto);
        hasProducto = true;
        System.out.println("hasProducto = " + hasProducto);
        
    }
}
