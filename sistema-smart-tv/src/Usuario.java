public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Qual canal? " + smartTv.canal);
        System.out.println("Qual volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Alteração - TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Alteração - TV Ligada? " + smartTv.ligada);

        //Canais
        smartTv.definirCanal(46);
        System.out.println("Alteração - Qual canal? " + smartTv.canal);


        smartTv.subirCanal();
        System.out.println("Alteração - Qual canal? " + smartTv.canal);
        
        smartTv.descerCanal();
        System.out.println("Alteração - Qual canal? " + smartTv.canal);

        //Volume
        smartTv.subirVolume();
        System.out.println("Alteração - Qual volume? " + smartTv.volume);

        smartTv.descerVolume();
        System.out.println("Alteração - Qual volume? " + smartTv.volume);        
    }
}
