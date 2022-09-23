public class Combustivel {

    public static void main(String[] args) {

        double distancia;
        double litros ;
        double tempo = 7;
        double velocidade = 112;

        distancia = (tempo * velocidade);
        litros = distancia / 12;

        System.out.println("Vamos calcular quanto seu automóvel gasta em uma viagem?");
        System.out.println("Seu automóvel faz 12Km/l, já conferimos aqui.");
        System.out.println("Você informou em seu check list que dirigiu a 112km/h e levou 7 horas no percurso.");
        System.out.println("Sendo assim, para " + distancia + "Km percorridos no total, você consumiu de combustível: " + litros + " litros.");

    }
}
