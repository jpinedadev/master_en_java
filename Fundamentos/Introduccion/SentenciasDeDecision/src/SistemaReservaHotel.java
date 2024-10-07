import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {

        final var TARIFA_CON_VISTA_MAR = 190.50;
        final var TARIFA_SIN_VISTA_MAR= 150.50;

        System.out.println("**Sistema Reserva Hotel**");
        var consola = new Scanner(System.in);

        //pedir datos, nombre, dias, vista al mar
        System.out.print("\nNombre: ");
        var nombre = consola.nextLine();

        System.out.print("Dias estancia: ");
        var diasEstancia = Integer.parseInt(consola.nextLine());

        System.out.print("Vista al mar True/False: ");
        var vistaMar = Boolean.parseBoolean(consola.nextLine());

        var costo = 0.0;
        if (vistaMar){
            //si tiene vista al mar entonces diasx190.50
            costo = diasEstancia*TARIFA_CON_VISTA_MAR;
        }
        else{
            //si NO tiene vista al mar entonces diasx150.50
            costo = diasEstancia*TARIFA_SIN_VISTA_MAR;
        }

        System.out.printf("""
                Nombre: %s
                Estancia: %d dias
                Vista al mar: %s
                Costo: %.2f 
                """,nombre,diasEstancia,vistaMar,costo);

    }
}
