import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        //se solicita los datos de un empleado (nombre,edad,salario,jefe de departamento)
        System.out.println("*** Sistema de empelados ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        var nombre = consola.nextLine();

        System.out.print("Ingresa edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa salario: ");
        var salario = Double.parseDouble(consola.nextLine());

        System.out.print("¿Es jefe de departamento?: ");
        var jefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        //imprimir datos
        System.out.println("\n********************************");
        System.out.println("\tNombre: "+nombre);
        System.out.println("\tEdad: "+edad);
        System.out.println("\tSalario: "+salario);
        System.out.println("\tJefe Departamento: "+jefeDepartamento);
    }

}
