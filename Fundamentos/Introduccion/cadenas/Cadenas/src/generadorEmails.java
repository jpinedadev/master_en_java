public class generadorEmails {
    public static void main(String[] args) {
        System.out.println("*** Generador de emails ***");

        var nombre = "Jahy Sama";
        var nombreNormalizado = nombre.toLowerCase().replace(" ",".");
        System.out.println(nombreNormalizado);

        var empresa = "Crunchyroll";
        var empresaNormalizado = "@"+empresa.toLowerCase();
        System.out.println("empresaNormalizado = " + empresaNormalizado);
        var dominio = ".com";

        var email = nombreNormalizado + empresaNormalizado + dominio;
        System.out.println("email = " + email);
        //repaso
    }
}
