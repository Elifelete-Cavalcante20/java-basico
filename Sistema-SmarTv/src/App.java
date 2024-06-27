public class App {
    public static void main(String[] args) throws Exception {
        
        SmarTv smarTv = new SmarTv();

        System.out.println("A sua SmarTV está ligada? " + smarTv.estado);
        System.out.println("O volume da sua SmarTV é "+ smarTv.volume);
        System.out.println("O canal que sua SmarTV está é " + smarTv.canal);

            smarTv.ligar();
            smarTv.aumentarVolume();
            smarTv.aumentarVolume();
            smarTv.aumentarVolume();
            smarTv.retornaCanal();
            smarTv.retornaCanal();
            smarTv.retornaCanal();
            smarTv.retornaCanal();

        System.out.println("A sua SmarTV está ligada? " + smarTv.estado);
        System.out.println("O volume da sua SmarTV é "+ smarTv.volume);
        System.out.println("O canal que sua SmarTV está é " + smarTv.canal);

    }
}
