public class CotacaoDolar {

    public static void main(String[] args) {

        double dolar_day = 5.12;
        double quantidade_moeda = 725.38;
        double resultado = quantidade_moeda / dolar_day ;
        String moeda = "R$";
        final char moeda_output = '$';


        System.out.println("Consta em nossos registros que você quer cotar valores em Dolar.");
        System.out.println("Sua cotação do valor informado de " + moeda + quantidade_moeda + " é " + moeda_output+ resultado + "." );
    }
}
