import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        /*- El sistema solicitará el precio de cada producto a comprar
          y el usuario deberá indicar su precio (decimal)
          - El sistema debe realizar la suma de cada producto
            calcular el impuesto e imprimir el total de la compra.*/

        System.out.println("**Generacion ticket de venta**");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio platanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.println("Aplicar algun descuento (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());


        //Calculo subtotal sin impuestos
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        //Aplicar descuento
        var descuento = subtotal * (descuentoPorcentaje/100.0);

        //Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;

        //calculo impuestos 15%
        var impuesto = subtotalConDescuento * 0.15;

        //calculo total de la compra
        var costoTotal = subtotalConDescuento + impuesto;

        //imprimir el ticket
        System.out.printf("""
                %n Ticket de Venta
                ---------------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (15%%): $%.2f
                Costo total: $%.2f
                """, subtotal, descuento,descuentoPorcentaje, impuesto, costoTotal);
    }
}
