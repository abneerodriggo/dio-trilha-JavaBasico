public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual da Tv: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);

        smartTv.mudarCanal(15);
        System.out.println("Novo Status -> Canal Atual : " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);


    }
}
