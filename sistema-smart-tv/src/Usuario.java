public class Usuario {
    public static void main(String[] args) throws Exception {
        



        SmartTv b = new SmartTv();

        b.diminuirVolume();
        b.diminuirVolume();
        b.diminuirVolume();
        b.aumentarVolume();

        System.out.println("canal atual " + b.canal);
        b.mudarCanal(13);

        System.out.println("canal atual " + b.canal);

        System.out.println("volume de agora" + b.volume);

        System.out.println("tv ligada? "+b.ligada);
        System.out.println("canal atual " + b.canal);
        System.out.println("volume atual "+b.volume);


        b.ligar();
        System.out.println(" novo status - tv ligada? "+b.ligada);

        b.desligar();
        System.out.println("novo status - tv ligada? " + b.ligada );
    }
}
