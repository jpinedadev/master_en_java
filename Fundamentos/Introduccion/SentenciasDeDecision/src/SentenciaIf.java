public class SentenciaIf {
    public static void main(String[] args) {
        var edad = 18;
        if (edad>=18){
            System.out.println("Mayor de edad");
        } else if (edad >=13 && edad < 18) {
            System.out.println("Eres adolescente");
        } else{
            System.out.println("Menor de edad");
        }
    }
}
