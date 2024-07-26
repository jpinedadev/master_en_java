public class ReservaHoteles {
    public static void main(String[] args) {
        /*Nombre del cliente, dias de estancia, tarifa diaria,
        * habitacion cuenta con vista al mar*/
        System.out.println("*** Bienvenido al Hotel ***");
        var nombreCliente = "Juan Perez";
        var diasEstancia = 10;
        var tarifa = 15;
        var hasVistaAlMar = true;

        System.out.println("Nombre: "+nombreCliente);
        System.out.println("Dias estancia: "+diasEstancia);
        System.out.println("Tarifa diaria: "+tarifa);
        System.out.println("Vista al mar: "+hasVistaAlMar);

        System.out.println("\n*** Mas datos ***");
        nombreCliente = "Ana Lopez";
        diasEstancia = 5;
        tarifa = 8;
        hasVistaAlMar = false;

        System.out.println("Nombre: "+nombreCliente);
        System.out.println("Dias estancia: "+diasEstancia);
        System.out.println("Tarifa diaria: "+tarifa);
        System.out.println("Vista al mar: "+hasVistaAlMar);
    }
}
