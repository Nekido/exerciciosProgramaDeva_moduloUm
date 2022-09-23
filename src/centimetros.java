public class centimetros {

    public static void main(String[] args) {

        final double multiplicador = 2.54;
        double medida_imput = 25.30;
        double resultado = medida_imput * multiplicador;
        final String unidade_medida = "centimetros";

        System.out.println("A conversão de: " + medida_imput + " para " + unidade_medida + " é " + resultado + ".");
    }
}