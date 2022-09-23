public class Temperatura {


    public static void main(String[] args) {

        final String unidademed_um = "celsius";
        final String unidademed_dois = "Fahrenheit";
        double temperatura = 33;
        double resultado = (temperatura * 1.8 )+ 32;


        System.out.println("A temperatura que você quer converter é: " + temperatura + unidademed_um + " :");
        System.out.println("A conversão fica : " + resultado + " " + unidademed_dois + ".");

    }
}
