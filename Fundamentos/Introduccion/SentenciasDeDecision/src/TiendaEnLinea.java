import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        /* Crear un sistema que ofrezca descuentos, dependiendo del monto
           de la compra, o si es miembro de la tienda.
           1. si ha comprado mas de $1.000 y es miembro -> Desc 10%
           2. si solo es miembro de la tienda -> Desc 5%
           3. si no es miembro ni compró mas de $1.000 -> Desc 0%
        */
        System.out.println("**Tienda en linea**");
        //condiciones
        final var MONTO_COMPRA_DESC = 1000.00;
        var consola = new Scanner(System.in);

        System.out.print("Monto total de compra?: ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembro? (true/false): ");
        var eresMiembro = Boolean.parseBoolean(consola.nextLine());

        //calculo del descuento
        var descuento = 0.0;
        //comprobaciones
        if (montoCompra>=MONTO_COMPRA_DESC && eresMiembro){
            descuento = 0.10; //10%
        } else if (eresMiembro) {
            descuento = 0.05; //5%
        }else {
            descuento = 0;
        }

        //presentando datos y calculos
        if (descuento!=0){
            var montoDesc = montoCompra * descuento;
            var montoFinal = montoCompra - montoDesc;
            System.out.printf("""
                    %nTu descuento es de %.0f%%
                    Monto de la compra: $%.2f
                    Monto del desc: $%.2f
                    Monto final: $%.2f%n
                    """,descuento*100, montoCompra,montoDesc,montoFinal);
        }else {
            System.out.printf("""
                    %nNo aplica descuento
                    Monto final: $%.2f%n
                    """,montoCompra);
        }
    }
}
